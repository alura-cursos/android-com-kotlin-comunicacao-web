package br.com.alura.ceep.webclient

import android.util.Log
import br.com.alura.ceep.model.Nota
import br.com.alura.ceep.webclient.model.NotaRequisicao
import br.com.alura.ceep.webclient.services.NotaService

private const val TAG = "NotaWebClient"

class NotaWebClient {

    private val notaService: NotaService =
        RetrofitInicializador().notaService

    suspend fun buscaTodas(): List<Nota>? {
        return try {
            val notasResposta = notaService
                .buscaTodas()
            notasResposta.map { notaResposta ->
                notaResposta.nota
            }
        } catch (e: Exception) {
            Log.e(TAG, "buscaTodas: ", e)
            null
        }
    }

    suspend fun salva(nota: Nota): Boolean {
        try {
            val resposta = notaService.salva(nota.id, NotaRequisicao(
                titulo = nota.titulo,
                descricao = nota.descricao,
                imagem = nota.imagem
            ))
            return resposta.isSuccessful
        } catch (e: Exception) {
            Log.e(TAG, "salva: falha ao tentar salvar", e)
        }
        return false
    }

}