package com.example.vignesh.recycler;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by vignesh on 12/12/17.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.View_holder> {

    List<Data> list= Collections.emptyList();
    Context context;

    public DataAdapter(List<Data> list,Context context){
        this.list=list;
        this.context=context;
    }

    @Override
    public DataAdapter.View_holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.data_layout,parent,false);
        View_holder holder=new View_holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(DataAdapter.View_holder holder, int position) {
        holder.name.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class View_holder extends RecyclerView.ViewHolder{
        TextView name;
        CardView cv;

        public View_holder(View itemview){
            super(itemview);
            cv=(CardView)itemView.findViewById(R.id.cardView);
            name=(TextView)itemView.findViewById(R.id.txt_name);

        }
    }
}
