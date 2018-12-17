/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.view;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.kucingapes.trafitest.presenter.LocationPresenter;
import com.kucingapes.trafitest.adapter.ParentAdapter;
import com.kucingapes.trafitest.R;
import com.kucingapes.trafitest.presenter.RoutePresenter;
import com.kucingapes.trafitest.model.RoutesItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements ILocationView, IRouteView {

    private List<RoutesItem> routesItems = new ArrayList<>();
    private ParentAdapter parentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocationPresenter locationPresenter = new LocationPresenter(this);
        locationPresenter.getLocation();

        Location startLocation = new Location("");
        startLocation.setLatitude(-6.128949);
        startLocation.setLongitude(106.8799204);

        Location endLocation = new Location("");
        endLocation.setLatitude(-6.244691);
        endLocation.setLongitude(106.8045455);

        new RoutePresenter(this).getRoute(startLocation, endLocation);

        parentAdapter = new ParentAdapter(routesItems);
        RecyclerView routeParent = findViewById(R.id.trafi_parent);
        routeParent.setLayoutManager(new LinearLayoutManager(this));
        routeParent.setAdapter(parentAdapter);

    }

    @Override
    public void onLastLocation(Location location) {
    }

    @Override
    public void onDefaultLocation(Location location) {
    }

    @Override
    public void onRouteList(List<RoutesItem> routesItems) {
        Log.d("route sukses ----->", String.valueOf(routesItems.size()));
        this.routesItems.addAll(routesItems);
        parentAdapter.notifyDataSetChanged();
    }

    @Override
    public void onRouteError(Throwable throwable) {
        Log.e("route error ----->", throwable.getLocalizedMessage());
    }
}