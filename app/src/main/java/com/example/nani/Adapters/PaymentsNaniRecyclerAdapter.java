package com.example.nani.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nani.R;

public class PaymentsNaniRecyclerAdapter extends RecyclerView.Adapter<PaymentsNaniRecyclerAdapter.Holder> {
    Context context;

    public PaymentsNaniRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.payment_nani_recyler_item, viewGroup, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return 9;
    }

    public class Holder extends RecyclerView.ViewHolder {
        private TextView price;

        public Holder(@NonNull View itemView) {
            super(itemView);
            price = itemView.findViewById(R.id.all_payments_value);
        }
    }
}

