package com.example.mravi.myapplicationmd4;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;


public class MainActivitymd4 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymd4);


        recyclerView=(RecyclerView)findViewById(R.id.recyclerviewid);
        recyclerView.setHasFixedSize(true);//sees alignment is proper;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        listItems=new ArrayList<>();

        ListItem item1=new ListItem("Moview 1","Its about lion","Its Good");

        ListItem item2=new ListItem("Movie 2","Its about tiger","Its great");

        for(int i=0;i<10;i++){

            ListItem item=new ListItem(
                    "Item "+(i+1),
                    "Description",
                    "Amazing"

            );

  //          listItems.add(item1);
    //        listItems.add(item2);


        listItems.add(item);


        }

    adapter=new MyAdapter(this,listItems);

    recyclerView.setAdapter(adapter);

    }
}
