package com.example.nani.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nani.R;

public class ProfileBuyerRecyclerAdapter extends RecyclerView.Adapter<ProfileBuyerRecyclerAdapter.Holder> {
    Context context;

    public ProfileBuyerRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.profile_buyer_recycler_item,viewGroup,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        if (i%2!=0){
            holder.view.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class Holder extends RecyclerView.ViewHolder {
        View view;
        public Holder(@NonNull View itemView) {
            super(itemView);
            view=itemView.findViewById(R.id.profile_buyer_recycler_view);
        }
    }
}
