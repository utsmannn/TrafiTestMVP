/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RoutesItem{

	@SerializedName("DepartureTime")
	private String departureTime;

	@SerializedName("PreferenceLabel")
	private String preferenceLabel;

	@SerializedName("Price")
	private double price;

	@SerializedName("DurationMinutes")
	private int durationMinutes;

	@SerializedName("Currency")
	private String currency;

	@SerializedName("WalkMinutes")
	private int walkMinutes;

	@SerializedName("RouteSegments")
	private List<RouteSegmentsItem> routeSegments;

	@SerializedName("ArrivalTime")
	private String arrivalTime;

	public void setDepartureTime(String departureTime){
		this.departureTime = departureTime;
	}

	public String getDepartureTime(){
		return departureTime;
	}

	public void setPreferenceLabel(String preferenceLabel){
		this.preferenceLabel = preferenceLabel;
	}

	public String getPreferenceLabel(){
		return preferenceLabel;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setDurationMinutes(int durationMinutes){
		this.durationMinutes = durationMinutes;
	}

	public int getDurationMinutes(){
		return durationMinutes;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setWalkMinutes(int walkMinutes){
		this.walkMinutes = walkMinutes;
	}

	public int getWalkMinutes(){
		return walkMinutes;
	}

	public void setRouteSegments(List<RouteSegmentsItem> routeSegments){
		this.routeSegments = routeSegments;
	}

	public List<RouteSegmentsItem> getRouteSegments(){
		return routeSegments;
	}

	public void setArrivalTime(String arrivalTime){
		this.arrivalTime = arrivalTime;
	}

	public String getArrivalTime(){
		return arrivalTime;
	}
}