package com.example.symbianapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cliente {

    @SerializedName("cod_cliente") @Expose
    private int cod_cliente;

    @SerializedName("nome") @Expose
    private String nome;

    @SerializedName("sobrenome") @Expose
    private String sobrenome;

    @SerializedName("email") @Expose
    private String email;

    @SerializedName("celular") @Expose
    private String celular;

    public Cliente() {
    }

    public Cliente(int cod_cliente, String nome, String sobrenome, String email, String celular) {
        this.cod_cliente = cod_cliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.celular = celular;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
