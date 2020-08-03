package com.example.fimp.Network_Utility;


import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;


public class ServerResponse {

    // variable name should be same as in the json response from php
    @SerializedName("success")
    boolean success;
    @SerializedName("message")
    String message;
    @SerializedName("user")
    Gson gson ;



    public String getMessage() {
        return message;
    }

    public boolean getSuccess() {
        return success;
    }

    public  Gson getuser(){return  gson; }
}