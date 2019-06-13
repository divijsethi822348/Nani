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

import com.example.nani.Adapters.AddItemRecyclerAdapter;
import com.example.nani.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddItemFragment extends Fragment {
    CheckBox contains_meat;
    LinearLayout meat_products;
    RecyclerView addItemRecycler;


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
