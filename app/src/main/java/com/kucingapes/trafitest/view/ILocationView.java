/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.view;

import android.location.Location;

public interface ILocationView {
    void onLastLocation(Location location);
    void onDefaultLocation(Location location);
}
