/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    public static TrafiServices trafiServices() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api-ext.trafi.com")
                .build();
        return retrofit.create(TrafiServices.class);
    }
}
