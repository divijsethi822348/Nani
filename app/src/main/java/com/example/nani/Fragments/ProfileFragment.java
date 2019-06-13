package com.example.nani.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nani.Activities.EditProfileActivity;
import com.example.nani.Activities.HomeBuyerActivity;
import com.example.nani.Activities.LoginActivity;
import com.example.nani.Adapters.ProfileAddressesRecyclerAdapter;
import com.example.nani.Adapters.ProfileMyPostsRecyclerAdapter;
import com.example.nani.R;
import com.example.nani.Util.App;
import com.example.nani.Util.Login_Logout;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment implements View.OnClickListener {
    RecyclerView profile_addresses_recycler,my_posts_recycler;
    Button log_out;
    String userTpe="";
    TextView my_posts;
    TextView edit_account;


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_profile, container, false);
        setIds(view);
        setClicks();
        return view;
    }

    private void setClicks() {
        log_out.setOnClickListener(this);
        edit_account.setOnClickListener(this);
    }

    private void setIds(View view) {
        profile_addresses_recycler =view.findViewById(R.id.profile_addresses_recycler);
        profile_addresses_recycler.setLayoutManager(new GridLayoutManager(getContext(),2));
        profile_addresses_recycler.setAdapter(new ProfileAddressesRecyclerAdapter(getContext()));
        log_out=view.findViewById(R.id.profile_logout);
        my_posts_recycler=view.findViewById(R.id.my_posts_recycler_profile);
        my_posts=view.findViewById(R.id.my_posts_text_profile);
        userTpe=App.getSingleton().getUserType();
        if (userTpe.equalsIgnoreCase("Nani")){
            my_posts.setVisibility(View.VISIBLE);
            my_posts_recycler.setVisibility(View.VISIBLE);
            my_posts_recycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
            my_posts_recycler.setAdapter(new ProfileMyPostsRecyclerAdapter(getContext()));

        }else if (userTpe.equalsIgnoreCase("Buyer")){
            my_posts.setVisibility(View.GONE);
            my_posts_recycler.setVisibility(View.GONE);
        }
        edit_account=view.findViewById(R.id.edit_account_text_click);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.profile_logout:
                Login_Logout.Logout(getActivity());
                App.getSingleton().setLoggedIn(false);
                if (userTpe.equalsIgnoreCase("Nani")){
                    startActivity(new Intent(getActivity(), LoginActivity.class));
                }else if (userTpe.equalsIgnoreCase("Buyer")){
                    startActivity(new Intent(getActivity(), HomeBuyerActivity.class));
                }
                break;

            case R.id.edit_account_text_click:
                startActivity(new Intent(getActivity(), EditProfileActivity.class));
                break;
        }
    }
}
