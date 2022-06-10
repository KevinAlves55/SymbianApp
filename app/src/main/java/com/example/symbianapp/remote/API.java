package com.example.symbianapp.remote;

public class API {

    public API() {
    }

    public static final String API_URL = "http://10.107.144.7:3000";

    public static RouterInterface getClientInterface() {

        return RetrofitClient.getClient(API_URL).create(RouterInterface.class);

    }

}
