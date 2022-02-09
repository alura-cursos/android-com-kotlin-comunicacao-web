package br.com.alura.ceep.webclient.services

import br.com.alura.ceep.model.Nota
import retrofit2.Call
import retrofit2.http.GET

interface NotaService {

    @GET("notas")
    fun buscaTodas(): Call<List<Nota>>

}