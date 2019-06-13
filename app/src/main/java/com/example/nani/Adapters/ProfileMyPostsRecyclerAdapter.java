package com.example.nani.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nani.Activities.EditMyPostActivity;
import com.example.nani.R;

public class ProfileMyPostsRecyclerAdapter extends RecyclerView.Adapter<ProfileMyPostsRecyclerAdapter.Holder> {
    Context context;

    public ProfileMyPostsRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.my_posts_recycler_item,viewGroup,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.myPostsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, EditMyPostActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class Holder extends RecyclerView.ViewHolder {
        CardView myPostsCard;
        public Holder(@NonNull View itemView) {
            super(itemView);
            myPostsCard =itemView.findViewById(R.id.my_posts_card);
        }
    }
}
