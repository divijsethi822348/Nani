package com.example.nani.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nani.Adapters.HomeFragFeedHorizontalRecyclerAdadpter;
import com.example.nani.Adapters.HomeFragFeedVerticalRecyclerAdapter;
import com.example.nani.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    RecyclerView horizontalRecyclerView,verticalRecyclerView;
    HomeFragFeedHorizontalRecyclerAdadpter feedHorizontalRecyclerAdadpter;



    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        iniiIds(view);
        horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        feedHorizontalRecyclerAdadpter=new HomeFragFeedHorizontalRecyclerAdadpter(getContext());
        horizontalRecyclerView.setAdapter(feedHorizontalRecyclerAdadpter);
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        verticalRecyclerView.setAdapter(new HomeFragFeedVerticalRecyclerAdapter(getContext()));

        return view;
    }

    private void iniiIds(View view) {
        horizontalRecyclerView=view.findViewById(R.id.home_frag_feed_horizontal_recycler_view);
        verticalRecyclerView=view.findViewById(R.id.home_frag_feed_vertical_recycler_view);

    }

}
