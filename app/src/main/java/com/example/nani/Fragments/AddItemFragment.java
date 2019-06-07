package com.example.nani.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nani.Adapters.AddItemRecyclerAdapter;
import com.example.nani.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddItemFragment extends Fragment {
    RecyclerView addItemRecycler;


    public AddItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_add_item, container, false);
        addItemRecycler=view.findViewById(R.id.add_item_recycler_view);
        addItemRecycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        addItemRecycler.setAdapter(new AddItemRecyclerAdapter(getContext()));
        return view;
    }

}
