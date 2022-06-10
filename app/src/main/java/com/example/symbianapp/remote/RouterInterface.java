package com.example.symbianapp.remote;

import com.example.symbianapp.model.Cliente;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RouterInterface {

    /** MAPEAMENTO DE TODAS AS ROTAS **/

    // POST (Rota de envio)
    @POST("/cliente/cadastrarCliente")
    Call<Cliente> addCliente(@Body Cliente cliente);

}
