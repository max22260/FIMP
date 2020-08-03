package com.example.fimp.Network_Utility;


import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;


public interface ApiConfig {

    @Multipart
    @POST("/api/recognize")
    Call<ServerResponse> upload(
            @Header("Authorization") String authorization,
            @PartMap Map<String, RequestBody> map
    );

    @Multipart
    @POST("/api/train")
    Call<ServerResponse> uploadPerson(
            @Header("Authorization") String authorization
            , @Part("name") RequestBody name
            , @PartMap Map<String, RequestBody> map);


}