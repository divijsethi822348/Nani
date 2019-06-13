package com.example.nani.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nani.Activities.ItemDescriptionActivity;
import com.example.nani.R;

public class HomeFragFeedVerticalRecyclerAdapter extends RecyclerView.Adapter<HomeFragFeedVerticalRecyclerAdapter.Holder> {
    Context context;

    public HomeFragFeedVerticalRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.home_frag_feed_vertical_recycler_item,viewGroup,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class Holder extends RecyclerView.ViewHolder {
        CardView item;
        public Holder(@NonNull View itemView) {
            super(itemView);
            item=itemView.findViewById(R.id.vertical_feed_card_item);
            item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context, ItemDescriptionActivity.class));
                }
            });
        }
    }
}
