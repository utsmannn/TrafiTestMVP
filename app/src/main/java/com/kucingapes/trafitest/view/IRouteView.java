/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.view;

import com.kucingapes.trafitest.model.RoutesItem;

import java.util.List;

public interface IRouteView {
    void onRouteList(List<RoutesItem> routesItems);
    void onRouteError(Throwable throwable);
}
