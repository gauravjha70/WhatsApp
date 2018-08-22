package com.example.gauravjha.whatsapp;

import java.util.ArrayList;

public class ChatListElementClass {

    String chatName, chatMsg;

    public ChatListElementClass(){}

    public ChatListElementClass(String cname, String cmsg)
    {
        setChatName(cname);
        setChatMsg(cmsg);
    }

    public ArrayList<ChatListElementClass> setChatList()
    {
        ChatListElementClass obj;
        ArrayList<ChatListElementClass> chatArray = new ArrayList<ChatListElementClass>();
        obj = new ChatListElementClass("Gaurav", "Hello there!!");
        chatArray.add(obj);
        obj = new ChatListElementClass("Avredeep", "How are you?");
        chatArray.add(obj);
        obj = new ChatListElementClass("Sam", "......");
        chatArray.add(obj);
        obj = new ChatListElementClass("Pranav", "hmmmmmmm");
        chatArray.add(obj);
        obj = new ChatListElementClass("Yash", "yo!!");
        chatArray.add(obj);
        obj = new ChatListElementClass("Gaurav", "Hello there!!");
        chatArray.add(obj);
        obj = new ChatListElementClass("Avredeep", "How are you?");
        chatArray.add(obj);
        obj = new ChatListElementClass("Sam", "......");
        chatArray.add(obj);
        obj = new ChatListElementClass("Pranav", "hmmmmmmm");
        chatArray.add(obj);
        obj = new ChatListElementClass("Yash", "yo!!");
        chatArray.add(obj);
        obj = new ChatListElementClass("Pranav", "hmmmmmmm");
        chatArray.add(obj);
        obj = new ChatListElementClass("Yash", "yo!!");
        chatArray.add(obj);
        obj = new ChatListElementClass("Gaurav", "Hello there!!");
        chatArray.add(obj);
        obj = new ChatListElementClass("Avredeep", "How are you?");
        return chatArray;

    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getChatMsg() {
        return chatMsg;
    }

    public void setChatMsg(String chatMsg) {
        this.chatMsg = chatMsg;
    }
}
