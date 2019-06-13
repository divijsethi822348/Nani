package com.example.nani.Adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nani.Activities.OrderCancelledActivity;
import com.example.nani.Activities.OrderCompletedActivity;
import com.example.nani.Activities.OrderDetailsActivity;
import com.example.nani.R;

import org.w3c.dom.Text;

import java.util.List;

public class MyOrdersBuyerRecyclerAdapter extends RecyclerView.Adapter<MyOrdersBuyerRecyclerAdapter.Holder> {
    Context context;
    List<String> status;

    public MyOrdersBuyerRecyclerAdapter(Context context, List<String> status) {
        this.context = context;
        this.status = status;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.my_orders_buyer_recycler_item,viewGroup,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder, final int i) {
        holder.orderStatus.setText(status.get(i));
        if (status.get(i).equalsIgnoreCase("Confirm")){
            holder.orderStatus.setTextColor(Color.parseColor("#306B0B"));
        }else if (status.get(i).equalsIgnoreCase("Cancel")){
            holder.orderStatus.setTextColor(Color.RED);
        }else if (status.get(i).equalsIgnoreCase("Completed")){
            holder.orderStatus.setTextColor(Color.parseColor("#306B0B"));
        }

        holder.main_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (status.get(i).equalsIgnoreCase("Confirm")){
                    Toast.makeText(context, "Confirm", Toast.LENGTH_SHORT).show();
                    context.startActivity(new Intent(context, OrderDetailsActivity.class));
                }else if (status.get(i).equalsIgnoreCase("Cancel")){
                    Toast.makeText(context, "Cancelled", Toast.LENGTH_SHORT).show();
                    context.startActivity(new Intent(context, OrderCancelledActivity.class));
                }else if (status.get(i).equalsIgnoreCase("Completed")){
                    Toast.makeText(context, "Completed", Toast.LENGTH_SHORT).show();
                    context.startActivity(new Intent(context, OrderCompletedActivity.class));
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return status.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView orderStatus;
        CardView main_card;
        public Holder(@NonNull View itemView) {
            super(itemView);
            orderStatus=itemView.findViewById(R.id.my_orders_buyer_recycler_status);
            main_card=itemView.findViewById(R.id.my_orders_buyer_recycler_card);

        }
    }
}
