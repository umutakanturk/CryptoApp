package com.example.retrofitjava.service;

import com.example.retrofitjava.model.CryptoModel;
import io.reactivex.Observable;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    // GET, POST, UPDATE, DELETE

    //https://api.nomics.com/v1/markets?key=ae36ffc010f73a827182cf3825def2818131120c
    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("prices?key=ae36ffc010f73a827182cf3825def2818131120c")
    Call<List<CryptoModel>> getData();
}
