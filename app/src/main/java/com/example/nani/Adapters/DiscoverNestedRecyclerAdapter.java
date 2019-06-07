package com.example.nani.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        public Holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
