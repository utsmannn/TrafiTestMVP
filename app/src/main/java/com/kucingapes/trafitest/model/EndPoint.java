/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.model;

import com.google.gson.annotations.SerializedName;

public class EndPoint{

	@SerializedName("Coordinate")
	private Coordinate coordinate;

	@SerializedName("Time")
	private String time;

	@SerializedName("Id")
	private String id;

	@SerializedName("Name")
	private String name;

	public void setCoordinate(Coordinate coordinate){
		this.coordinate = coordinate;
	}

	public Coordinate getCoordinate(){
		return coordinate;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}