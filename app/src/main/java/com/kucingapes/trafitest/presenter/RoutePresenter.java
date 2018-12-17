/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.presenter;

import android.location.Location;

import com.kucingapes.trafitest.api.RetrofitClient;
import com.kucingapes.trafitest.api.TrafiServices;
import com.kucingapes.trafitest.model.Trafi;
import com.kucingapes.trafitest.view.IRouteView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RoutePresenter {
    private IRouteView routeView;

    public RoutePresenter(IRouteView routeView) {
        this.routeView = routeView;
    }

    public void getRoute(Location startLocation, Location endLocation) {

        String startLat = String.valueOf(startLocation.getLatitude());
        String startLng = String.valueOf(startLocation.getLongitude());
        String endLat = String.valueOf(endLocation.getLatitude());
        String endLng = String.valueOf(endLocation.getLongitude());
        String apiKey = "sandbox_key_not_for_production";

        TrafiServices trafiServices = RetrofitClient.trafiServices();

        trafiServices.getTrafi(startLat, startLng, endLat, endLng, "false", apiKey).enqueue(new Callback<Trafi>() {
            @Override
            public void onResponse(Call<Trafi> call, Response<Trafi> response) {
                String s = String.valueOf(response.body().getRoutes().size());
                routeView.onRouteList(response.body().getRoutes());
            }

            @Override
            public void onFailure(Call<Trafi> call, Throwable t) {
                routeView.onRouteError(t);
            }
        });

    }
}
