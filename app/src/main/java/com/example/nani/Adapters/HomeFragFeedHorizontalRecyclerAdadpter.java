package com.example.nani.Adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

import com.example.nani.Activities.ItemDescriptionActivity;
import com.example.nani.R;

public class HomeFragFeedHorizontalRecyclerAdadpter extends RecyclerView.Adapter<HomeFragFeedHorizontalRecyclerAdadpter.Holder> {
    Context context;

    public HomeFragFeedHorizontalRecyclerAdadpter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public HomeFragFeedHorizontalRecyclerAdadpter.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.home_frag_feed_horizontal_recycler_item,viewGroup,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeFragFeedHorizontalRecyclerAdadpter.Holder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class Holder extends RecyclerView.ViewHolder {
        RatingBar ratingBar;
        CardView item;
        public Holder(@NonNull View itemView) {
            super(itemView);
            ratingBar=itemView.findViewById(R.id.rating_bar_horizontal_feed_item);
            LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
            stars.getDrawable(2).setColorFilter(Color.parseColor("#F5AE44"), PorterDuff.Mode.SRC_ATOP);
            item=itemView.findViewById(R.id.horizontal_feed_card_item);
            item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context, ItemDescriptionActivity.class));
                }
            });
        }
    }
}
