package com.example.gauravjha.whatsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PagerViewAdapter extends FragmentPagerAdapter {

    int no_of_tabs;
    ChatsFragment chatsFragment;


    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0: chatsFragment = new ChatsFragment();
                    return chatsFragment;
            case 1:return new Status_Fragment();
            case 2: return new CallsFragment();
            default:return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0: return "CHATS";
            case 1: return "STATUS";
            case 2: return "CALLS";
            default: return " ";
        }
        //return "";

    }

    @Override
    public int getCount() {
        return 3;
    }

}
