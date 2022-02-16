package br.com.alura.ceep.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Nota(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val titulo: String,
    val descricao: String,
    val imagem: String? = null,
    @ColumnInfo(defaultValue = "0")
    val sincronizada: Boolean = false,
    @ColumnInfo(defaultValue = "0")
    val desativada: Boolean = false
)
