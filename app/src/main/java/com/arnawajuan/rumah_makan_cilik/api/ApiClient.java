package com.arnawajuan.rumah_makan_cilik.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    //public static final String BASE_URL ="https://pbp.pelangidb.com/api/";
    public static final String BASE_URL = "http://pbp-api-h.herokuapp.com/"; // Link Local Host
    public static final String BASE_API_URL = BASE_URL + "api/"; // Link Local Host

    public static Retrofit retrofit = null;
    public static Retrofit getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
