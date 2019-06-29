package com.example.recyclerview;

public class List_Item {

    private String head;
    private String imageurl;

    public List_Item(String head, String imageurl) {
        this.head = head;
        this.imageurl = imageurl;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getHead() {
        return head;
    }

    public String getImageurl() {
        return imageurl;
    }
}
