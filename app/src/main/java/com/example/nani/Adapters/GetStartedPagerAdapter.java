package com.example.nani.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.nani.Fragments.AboutOneFragment;
import com.example.nani.Fragments.AboutThreeFragment;
import com.example.nani.Fragments.AboutTwoFragment;

public class GetStartedPagerAdapter extends FragmentStatePagerAdapter {




    public GetStartedPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                AboutOneFragment aboutOneFragment = new AboutOneFragment();
                return aboutOneFragment;
            case 1:
                AboutTwoFragment aboutTwoFragment = new AboutTwoFragment();
                return aboutTwoFragment;
            case 2:
                AboutThreeFragment aboutThreeFragment = new AboutThreeFragment();
                return aboutThreeFragment;

            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return 3;
    }
}

