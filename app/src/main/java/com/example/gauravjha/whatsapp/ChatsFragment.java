package com.example.gauravjha.whatsapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ChatsFragment extends Fragment implements SearchView.OnQueryTextListener {

    RecyclerView recyclerView;
    ChatsRecyclerAdapter chatsRecyclerAdapter = new ChatsRecyclerAdapter();
    FloatingActionButton floatingActionButton;

    public ChatsFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.chats_frag,container,false);

        recyclerView = rootview.findViewById(R.id.chats_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(chatsRecyclerAdapter);


        return rootview;
    }

    void updatesearch(ArrayList<ChatListElementClass> newsearchList){
        chatsRecyclerAdapter.searchChatList(newsearchList);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View mainview = getActivity().findViewById(R.id.fab);
        floatingActionButton = (FloatingActionButton) mainview;
        floatingActionButton.setImageResource(R.drawable.chat);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        // Inflate the menu; this adds items to the action bar if it is present.

        menuInflater.inflate(R.menu.menu_main, menu);
        super.onCreateOptionsMenu(menu, menuInflater);

        MenuItem searchItem = menu.findItem(R.id.search_view);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(this);



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

//        Toast.makeText(this,"Search bar",Toast.LENGTH_SHORT).show();
        int ctr = 0;
        String inputText = newText.toLowerCase();
        ChatListElementClass chatListElementClass = new ChatListElementClass();
        ArrayList<ChatListElementClass> searchItemList = chatListElementClass.setChatList();
        ArrayList<ChatListElementClass> newsearchList = new ArrayList<ChatListElementClass>();

        for(int i = 0 ; i<searchItemList.size() ; i++)
        {

            if(searchItemList.get(i).getChatName().toLowerCase().contains(inputText))
            {
                ctr++;
                newsearchList.add(searchItemList.get(i));
            }
        }
        updatesearch(newsearchList);

        return true;
    }

}
