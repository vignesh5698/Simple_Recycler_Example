package com.example.vignesh.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Data> data=fill_data();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler);
        DataAdapter adapter=new DataAdapter(data,getApplicationContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
    public List<Data> fill_data(){
        List<Data> data=new ArrayList<>();
        data.add(new Data("Sample"));
        data.add(new Data("Welcome"));
        data.add(new Data("Sample"));
        data.add(new Data("Welcome"));
        data.add(new Data("Sample"));
        data.add(new Data("Welcome"));
        data.add(new Data("Sample"));
        data.add(new Data("Welcome"));
        data.add(new Data("Sample"));
        data.add(new Data("Welcome"));
        data.add(new Data("Sample"));
        data.add(new Data("Welcome"));
        data.add(new Data("Sample"));
        data.add(new Data("Welcome"));
        data.add(new Data("Sample"));
        data.add(new Data("Welcome"));






        return data;
    }
}
