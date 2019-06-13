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

public class DiscoverNestedRecyclerAdapter extends RecyclerView.Adapter<DiscoverNestedRecyclerAdapter.Holder> {
    Context context;

    public DiscoverNestedRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public DiscoverNestedRecyclerAdapter.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.discover_nested_recycler_item,viewGroup,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscoverNestedRecyclerAdapter.Holder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class Holder extends RecyclerView.ViewHolder {
        CardView discover_card;
        public Holder(@NonNull final View itemView) {
            super(itemView);
            discover_card=itemView.findViewById(R.id.discover_item);
            discover_card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context, ItemDescriptionActivity.class));
                }
            });
        }
    }
}
