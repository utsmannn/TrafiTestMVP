/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.model;

import com.google.gson.annotations.SerializedName;

public class Transport{

	@SerializedName("IconUrl")
	private String iconUrl;

	@SerializedName("Color")
	private String color;

	@SerializedName("ScheduleId")
	private String scheduleId;

	@SerializedName("Direction")
	private String direction;

	@SerializedName("Name")
	private String name;

	@SerializedName("TrackId")
	private String trackId;

	public void setIconUrl(String iconUrl){
		this.iconUrl = iconUrl;
	}

	public String getIconUrl(){
		return iconUrl;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setScheduleId(String scheduleId){
		this.scheduleId = scheduleId;
	}

	public String getScheduleId(){
		return scheduleId;
	}

	public void setDirection(String direction){
		this.direction = direction;
	}

	public String getDirection(){
		return direction;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setTrackId(String trackId){
		this.trackId = trackId;
	}

	public String getTrackId(){
		return trackId;
	}
}