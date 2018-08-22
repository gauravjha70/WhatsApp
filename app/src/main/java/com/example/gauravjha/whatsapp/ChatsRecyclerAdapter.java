package com.example.gauravjha.whatsapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChatsRecyclerAdapter extends RecyclerView.Adapter<ChatsRecyclerAdapter.ChatsViewHolder>{


    ArrayList<ChatListElementClass> chatArray;

    public ChatsRecyclerAdapter()
    {
        ChatListElementClass c = new ChatListElementClass();
        chatArray = new ArrayList<ChatListElementClass>();
        chatArray = c.setChatList();
    }

    @NonNull
    @Override
    public ChatsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_adapter_view,parent,false);
        return new ChatsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatsViewHolder holder, int position) {

        String n = chatArray.get(position).getChatName();
        String m = chatArray.get(position).getChatMsg();

        holder.nameText.setText(n);
        holder.msgText.setText(m);

    }

    @Override
    public int getItemCount() {
        return chatArray.size();
    }

    public class ChatsViewHolder extends RecyclerView.ViewHolder{

        ImageView chat_pro_image;
        TextView nameText, msgText;

        public ChatsViewHolder(View itemView) {
            super(itemView);

            chat_pro_image = itemView.findViewById(R.id.chat_image_holder);
            nameText = itemView.findViewById(R.id.chat_name_holder);
            msgText = itemView.findViewById(R.id.chat_message_holder);

        }
    }

    void searchChatList(ArrayList<ChatListElementClass> chatListElementClasses)
    {
        chatArray = new ArrayList<ChatListElementClass>();
        for(int i = 0 ;i<chatListElementClasses.size();i++)
        {
            chatArray.add(chatListElementClasses.get(i));
        }
        notifyDataSetChanged();
    }

}
