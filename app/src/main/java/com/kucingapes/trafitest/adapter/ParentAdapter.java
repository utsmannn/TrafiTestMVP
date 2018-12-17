/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kucingapes.trafitest.R;
import com.kucingapes.trafitest.model.RoutesItem;

import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ParentViewHolder> {

    private List<RoutesItem> routesItems;
    private Context context;

    public ParentAdapter(List<RoutesItem> routesItems) {
        this.routesItems = routesItems;
    }

    @NonNull
    @Override
    public ParentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        return new ParentViewHolder(LayoutInflater.from(context).inflate(R.layout.item_parent, viewGroup, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ParentViewHolder parentViewHolder, int i) {
        RoutesItem routesItem = routesItems.get(i);

        parentViewHolder.titleRoute.setText(routesItem.getPreferenceLabel());
        parentViewHolder.duration.setText(routesItem.getDurationMinutes() + " Minute");
        parentViewHolder.price.setText(routesItem.getCurrency() + " " + String.valueOf(routesItem.getPrice()));

        parentViewHolder.routeChild.setLayoutManager(new LinearLayoutManager(context));
        parentViewHolder.routeChild.setAdapter(new ChildAdapter(routesItem.getRouteSegments()));
    }

    @Override
    public int getItemCount() {
        return routesItems.size();
    }

    public class ParentViewHolder extends RecyclerView.ViewHolder {
        TextView titleRoute, duration, price;
        RecyclerView routeChild;

        public ParentViewHolder(@NonNull View itemView) {
            super(itemView);
            titleRoute = itemView.findViewById(R.id.title_route);
            duration = itemView.findViewById(R.id.duration);
            price = itemView.findViewById(R.id.price);
            routeChild = itemView.findViewById(R.id.trafi_child);
        }
    }
}