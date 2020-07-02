package com.example.recycleview;
import java.util.ArrayList;

public class Itemlist {
    private String head;
    private String desc;

    public Itemlist(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }


    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public static void createItemsList() {
        ArrayList<Itemlist> items = new ArrayList<Itemlist>();

        for (int i = 1; i <= 10; i++) {
            items.add(new Itemlist("heading " + i + 1, "Test"));

        }


    }
}
