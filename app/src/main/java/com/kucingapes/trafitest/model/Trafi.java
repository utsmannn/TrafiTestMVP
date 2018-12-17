/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Trafi{

	@SerializedName("Routes")
	private List<RoutesItem> routes;

	public void setRoutes(List<RoutesItem> routes){
		this.routes = routes;
	}

	public List<RoutesItem> getRoutes(){
		return routes;
	}
}