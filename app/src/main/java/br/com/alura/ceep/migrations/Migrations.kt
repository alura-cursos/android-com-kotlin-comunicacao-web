package br.com.alura.ceep.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import java.util.*

val MIGRATION_1_2 = object : Migration(1, 2) {

    override fun migrate(database: SupportSQLiteDatabase) {
        val tabelaNova = "Nota_nova"
        val tabelaAtual = "Nota"

        //criar tabela nova com todos os campos esperados
        database.execSQL(
            """CREATE TABLE IF NOT EXISTS $tabelaNova (
        `id` TEXT PRIMARY KEY NOT NULL, 
        `titulo` TEXT NOT NULL, 
        `descricao` TEXT NOT NULL, 
        `imagem` TEXT)"""
        )

        //copiar dados da tabela atual para a tabela nova
        database.execSQL(
            """INSERT INTO $tabelaNova (id, titulo, descricao, imagem) 
        SELECT id, titulo, descricao, imagem FROM $tabelaAtual
    """
        )

        //gerar ids diferentes e novos
        val cursor = database.query("SELECT * FROM $tabelaNova")
        while (cursor.moveToNext()) {
            val id = cursor.getString(
                cursor.getColumnIndex("id")
            )
            database.execSQL(
                """
        UPDATE $tabelaNova 
            SET id = '${UUID.randomUUID()}' 
            WHERE id = $id"""
            )
        }

        //apagar tabela atual
        database.execSQL("DROP TABLE $tabelaAtual")

        //renomear tabela nova com o nome da tabela atual
        database.execSQL("ALTER TABLE $tabelaNova RENAME TO $tabelaAtual")
    }

}