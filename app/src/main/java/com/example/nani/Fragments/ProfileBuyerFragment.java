package com.example.nani.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nani.Adapters.ProfileBuyerRecyclerAdapter;
import com.example.nani.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileBuyerFragment extends Fragment {
//    RecyclerView profile_buyer_recycler;


    public ProfileBuyerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_profile_buyer, container, false);
//        profile_buyer_recycler=view.findViewById(R.id.profile_buyer_recycler);
//        profile_buyer_recycler.setLayoutManager(new GridLayoutManager(getContext(),2));
//        profile_buyer_recycler.setAdapter(new ProfileBuyerRecyclerAdapter(getContext()));
        return view;
    }

}
