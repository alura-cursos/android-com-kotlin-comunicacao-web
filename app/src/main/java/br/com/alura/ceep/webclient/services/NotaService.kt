package br.com.alura.ceep.webclient.services

import br.com.alura.ceep.webclient.model.NotaResposta
import retrofit2.http.GET

interface NotaService {

    @GET("notas")
    suspend fun buscaTodas(): List<NotaResposta>

}