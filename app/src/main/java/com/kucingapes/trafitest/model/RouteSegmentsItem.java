/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RouteSegmentsItem{

	@SerializedName("IconUrl")
	private String iconUrl;

	@SerializedName("OtherTransports")
	private List<Object> otherTransports;

	@SerializedName("Shape")
	private String shape;

	@SerializedName("DurationMinutes")
	private int durationMinutes;

	@SerializedName("StartPoint")
	private StartPoint startPoint;

	@SerializedName("DistanceMeters")
	private int distanceMeters;

	@SerializedName("EndPoint")
	private EndPoint endPoint;

	@SerializedName("Transport")
	private Transport transport;

	@SerializedName("WalkDistanceMeters")
	private int walkDistanceMeters;

	@SerializedName("StopsCount")
	private int stopsCount;

	@SerializedName("RouteSegmentType")
	private int routeSegmentType;

	public void setIconUrl(String iconUrl){
		this.iconUrl = iconUrl;
	}

	public String getIconUrl(){
		return iconUrl;
	}

	public void setOtherTransports(List<Object> otherTransports){
		this.otherTransports = otherTransports;
	}

	public List<Object> getOtherTransports(){
		return otherTransports;
	}

	public void setShape(String shape){
		this.shape = shape;
	}

	public String getShape(){
		return shape;
	}

	public void setDurationMinutes(int durationMinutes){
		this.durationMinutes = durationMinutes;
	}

	public int getDurationMinutes(){
		return durationMinutes;
	}

	public void setStartPoint(StartPoint startPoint){
		this.startPoint = startPoint;
	}

	public StartPoint getStartPoint(){
		return startPoint;
	}

	public void setDistanceMeters(int distanceMeters){
		this.distanceMeters = distanceMeters;
	}

	public int getDistanceMeters(){
		return distanceMeters;
	}

	public void setEndPoint(EndPoint endPoint){
		this.endPoint = endPoint;
	}

	public EndPoint getEndPoint(){
		return endPoint;
	}

	public void setTransport(Transport transport){
		this.transport = transport;
	}

	public Transport getTransport(){
		return transport;
	}

	public void setWalkDistanceMeters(int walkDistanceMeters){
		this.walkDistanceMeters = walkDistanceMeters;
	}

	public int getWalkDistanceMeters(){
		return walkDistanceMeters;
	}

	public void setStopsCount(int stopsCount){
		this.stopsCount = stopsCount;
	}

	public int getStopsCount(){
		return stopsCount;
	}

	public void setRouteSegmentType(int routeSegmentType){
		this.routeSegmentType = routeSegmentType;
	}

	public int getRouteSegmentType(){
		return routeSegmentType;
	}
}