/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.api;

import com.kucingapes.trafitest.model.Trafi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TrafiServices {

    @GET("routes")
    Call<Trafi> getTrafi(@Query("start_lat") String startLat,
                         @Query("start_lng") String startLng,
                         @Query("end_lat") String endLat,
                         @Query("end_lng") String endLng,
                         @Query("is_arrival") String arrival,
                         @Query("api_key") String apiKey);
}
