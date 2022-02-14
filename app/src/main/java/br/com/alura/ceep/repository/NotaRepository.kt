package br.com.alura.ceep.repository

import br.com.alura.ceep.database.dao.NotaDao
import br.com.alura.ceep.model.Nota
import br.com.alura.ceep.webclient.NotaWebClient
import kotlinx.coroutines.flow.Flow

class NotaRepository(private val dao: NotaDao,
private val webClient: NotaWebClient) {

    fun buscaTodas(): Flow<List<Nota>> {
       return dao.buscaTodas()
    }

    suspend fun atualizaTodas() {
        webClient.buscaTodas()?.let { notas ->
            dao.salva(notas)
        }
    }

}