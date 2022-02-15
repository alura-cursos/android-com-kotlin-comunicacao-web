package br.com.alura.ceep.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.alura.ceep.database.dao.NotaDao
import br.com.alura.ceep.migrations.MIGRATION_1_2
import br.com.alura.ceep.migrations.MIGRATION_2_3
import br.com.alura.ceep.model.Nota

@Database(
    version = 3,
    entities = [Nota::class],
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun notaDao(): NotaDao

    companion object {
        @Volatile
        private var db: AppDatabase? = null

        fun instancia(context: Context): AppDatabase {
            return db ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "ceep.db"
            ).addMigrations(MIGRATION_1_2, MIGRATION_2_3)
                .build()
        }
    }

}