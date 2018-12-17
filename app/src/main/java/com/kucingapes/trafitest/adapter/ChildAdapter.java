/*
 * Created by Muhammad Utsman on 17/12/2018
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 12/17/18 8:56 PM
 */

package com.kucingapes.trafitest.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kucingapes.trafitest.R;
import com.kucingapes.trafitest.model.RouteSegmentsItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ChildViewHolder> {

    private List<RouteSegmentsItem> segmentsItems;
    private Context context;

    public ChildAdapter(List<RouteSegmentsItem> segmentsItems) {
        this.segmentsItems = segmentsItems;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        return new ChildViewHolder(LayoutInflater.from(context).inflate(R.layout.item_child, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder childViewHolder, int i) {
        RouteSegmentsItem segmentsItem = segmentsItems.get(i);

        String iconTrans = segmentsItem.getIconUrl();
        String startPoint = segmentsItem.getStartPoint().getName();
        String endPoint = segmentsItem.getEndPoint().getName();
        String timeDuration = String.valueOf(segmentsItem.getDurationMinutes()) + " Minute";
        String distanceMeter = String.valueOf(segmentsItem.getDistanceMeters() + " Meter");

        String to = " to ";

        if (startPoint.equals("")) {
            to = "To ";
        }

        if (endPoint.equals("")) {
            to = " to Location";
        }

        String desc = startPoint + to + endPoint + " (" + distanceMeter + ", " + timeDuration + ")";

        Picasso.get().load(iconTrans).into(childViewHolder.iconTrans);
        childViewHolder.descTrans.setText(desc);
    }

    @Override
    public int getItemCount() {
        return segmentsItems.size();
    }

    public class ChildViewHolder extends RecyclerView.ViewHolder {
        ImageView iconTrans;
        TextView descTrans;
        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);
            iconTrans = itemView.findViewById(R.id.icon_trans);
            descTrans = itemView.findViewById(R.id.description_trans);
        }
    }
}
