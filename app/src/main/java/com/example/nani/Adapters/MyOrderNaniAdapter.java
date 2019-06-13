package com.example.nani.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nani.R;

public class MyOrderNaniAdapter extends RecyclerView.Adapter<MyOrderNaniAdapter.Holder> {
    Context context;
    MyOrderNaniAdapter.Holder holder;

    public MyOrderNaniAdapter(Context context) {

        this.context = context;

    }

    @NonNull
    @Override
    public MyOrderNaniAdapter.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.my_order_nani_item, viewGroup, false);
        return new MyOrderNaniAdapter.Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final MyOrderNaniAdapter.Holder holder, int i) {

        this.holder = holder;
        holder.myOrderNaniSelections.setVisibility(View.GONE);
        holder.confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.myOrderNaniSelections.setVisibility(View.VISIBLE);
                holder.courierBut.setClickable(false);
                holder.foodArrBut.setClickable(false);
                holder.foodPreparedBut.setClickable(true);

            }
        });
        holder.foodPreparedBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.courierBut.setClickable(true);
                holder.foodPreparedBut.setBackgroundResource(R.drawable.orange_more_round_back);
                holder.foodPreparedBut.setTextColor(context.getResources().getColor(R.color.white));
            }
        });
        holder.courierBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.foodArrBut.setClickable(true);
                holder.courierBut.setBackgroundResource(R.drawable.orange_more_round_back);
                holder.courierBut.setTextColor(context.getResources().getColor(R.color.white));

            }
        });
        holder.foodArrBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.foodArrBut.setBackgroundResource(R.drawable.orange_more_round_back);
                holder.foodArrBut.setTextColor(context.getResources().getColor(R.color.white));
                holder.cancel.setText("Completed");
                holder.cancel.setTextColor(context.getResources().getColor(R.color.green));
                holder.myOrderNaniSelections.setVisibility(View.GONE);
                holder.cancel.setClickable(false);
                holder.confirm.setVisibility(View.GONE);

            }
        });
        holder.cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.myOrderNaniSelections.setVisibility(View.GONE);
                holder.confirm.setVisibility(View.GONE);
                holder.cancel.setText("Cancelled");
            }
        });



    }


    @Override
    public int getItemCount() {
        return 3;
    }



    public class Holder extends RecyclerView.ViewHolder {
        private TextView confirm, cancel;
        private Button confirmOrderBut, foodPreparedBut, courierBut, foodArrBut;
        private LinearLayout myOrderNaniSelections;

        public Holder(@NonNull View itemView) {
            super(itemView);
            confirm = itemView.findViewById(R.id.my_order_nani_confirm);
            cancel = itemView.findViewById(R.id.my_order_nani_cancel);
            myOrderNaniSelections = itemView.findViewById(R.id.my_order_nani_selections);
            confirmOrderBut = itemView.findViewById(R.id.my_order_nani_confirm_order_but);
            foodPreparedBut = itemView.findViewById(R.id.my_order_nani_food_prepared);
            foodArrBut = itemView.findViewById(R.id.my_order_nani_food_arriving);
            courierBut = itemView.findViewById(R.id.my_order_nani_courier_on_way);
        }
    }
}