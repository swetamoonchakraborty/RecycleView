package com.example.recycleview;
import static com.example.recycleview.R.*;
import android.app.LauncherActivity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;

import java.util.List;

import static com.example.recycleview.R.*;

public  class Itemadapter extends RecyclerView.Adapter<Itemadapter.MyViewHolder>
{
    private List<Itemlist> listitems;



    public Itemadapter(List<Itemlist> itemList, android.content.Context context)
    {
        listitems = listitems;
        Context = context;
    }

    private Context Context;


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View V= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem,parent,false);

        return new MyViewHolder(V);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        Itemlist itemlist=listitems.get(position);
        holder.nametext.setText(itemlist.getHead());
        holder.itemdesc.setText(itemlist.getHead());

    }

    @Override
    public int getItemCount()
    {
        return listitems.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView nametext;
        public TextView itemdesc;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            nametext=(TextView) itemView.findViewById(R.id.info_text);
            itemdesc=(TextView) itemView.findViewById(id.desc);

        }

    }



}
