package com.example.nani.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nani.Adapters.AddItemRecyclerAdapter;
import com.example.nani.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddItemFragment extends Fragment {
    CheckBox contains_meat;
    LinearLayout meat_products;
    RecyclerView addItemRecycler;
    int quantity;
    TextView Quantity;
    RelativeLayout minus,add;


    public AddItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_add_item, container, false);
        contains_meat= view.findViewById(R.id.contains_meat_products_check);
        meat_products=view.findViewById(R.id.contains_meat_products_layout);
        Quantity=view.findViewById(R.id.quantity_t_add_item);
        minus=view.findViewById(R.id.minus_quantity_add_item);
        add=view.findViewById(R.id.add_quantity_add_item);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity=Integer.parseInt(Quantity.getText().toString());
                if (quantity>1){
                    quantity--;
                    Quantity.setText(String.valueOf(quantity));
                }else {
                    Toast.makeText(getContext(), "Least", Toast.LENGTH_SHORT).show();
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity=Integer.parseInt(Quantity.getText().toString());
                quantity++;
                Quantity.setText(String.valueOf(quantity));
            }
        });
        contains_meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contains_meat.isChecked()){
                    meat_products.setVisibility(View.VISIBLE);
                }else {
                    meat_products.setVisibility(View.GONE);
                }
            }
        });

        addItemRecycler=view.findViewById(R.id.add_item_recycler_view);
        addItemRecycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        addItemRecycler.setAdapter(new AddItemRecyclerAdapter(getContext()));
        return view;
    }

}
