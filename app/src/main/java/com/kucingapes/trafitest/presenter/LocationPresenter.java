/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.presenter;

import android.Manifest;
import android.annotation.SuppressLint;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.BasePermissionListener;
import com.kucingapes.trafitest.view.ILocationView;

public class LocationPresenter {
    private ILocationView view;
    private FusedLocationProviderClient fusedLocationProviderClient;

    public LocationPresenter(ILocationView view) {
        this.view = view;
    }

    public void getLocation() {
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((AppCompatActivity)view);

        Dexter.withActivity((AppCompatActivity)view)
                .withPermission(Manifest.permission.ACCESS_COARSE_LOCATION)
                .withListener(new BasePermissionListener(){
                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse response) {
                        super.onPermissionDenied(response);
                    }

                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse response) {
                        super.onPermissionGranted(response);
                        lastLocation();
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
                        super.onPermissionRationaleShouldBeShown(permission, token);
                        token.continuePermissionRequest();
                    }
                }).check();
    }

    @SuppressLint("MissingPermission")
    private void lastLocation() {
        final Location defaultLocation = new Location("");

        /* default location in MONAS */
        defaultLocation.setLatitude(-6.1753871);
        defaultLocation.setLongitude(106.8249641);

        fusedLocationProviderClient.getLastLocation()
                .addOnSuccessListener((AppCompatActivity)view, new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        if (location != null) {
                            view.onLastLocation(location);
                        } else  {
                            view.onDefaultLocation(defaultLocation);
                        }
                    }
                });
    }
}
