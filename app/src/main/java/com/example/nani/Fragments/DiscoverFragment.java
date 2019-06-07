package com.example.nani.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nani.Adapters.DiscoverRecyclerAdapter;
import com.example.nani.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverFragment extends Fragment {
    RecyclerView discover_recycler;


    public DiscoverFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_discover, container, false);
        discover_recycler=view.findViewById(R.id.discover_recycler);
        discover_recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        discover_recycler.setAdapter(new DiscoverRecyclerAdapter(getContext()));
        return view;
    }

}
