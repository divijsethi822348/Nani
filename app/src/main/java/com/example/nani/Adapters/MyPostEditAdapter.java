package com.example.nani.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.nani.Activities.EditMyPostActivity;
import com.example.nani.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class MyPostEditAdapter extends RecyclerView.Adapter<MyPostEditAdapter.Holder> {
    Context context;

    public MyPostEditAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.my_post_edit_images_recycler_item,viewGroup,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

        if(EditMyPostActivity.showCloseImage)
            holder.close.setVisibility(View.VISIBLE);
        else
        {
            holder.close.setVisibility(View.GONE);

        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class Holder extends RecyclerView.ViewHolder {
        private ImageView close;

        public Holder(@NonNull View itemView) {
            super(itemView);
            close = itemView.findViewById(R.id.my_post_edit_image_close);

        }
    }
}
