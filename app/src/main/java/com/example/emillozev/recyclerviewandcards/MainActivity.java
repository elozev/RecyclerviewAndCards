package com.example.emillozev.recyclerviewandcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<CardInfo> mCardInfoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager linearManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearManager);

        initializeCards();
        CardAdapter adapter = new CardAdapter(mCardInfoList);
        mRecyclerView.setAdapter(adapter);
    }

    public void initializeCards(){
        mCardInfoList = new ArrayList<>();
        mCardInfoList.add(new CardInfo("Emma Wilson", "23 years old", R.drawable.iron_man));
        mCardInfoList.add(new CardInfo("Lavery Maiss", "25 years old", R.drawable.lego_movie));
        mCardInfoList.add(new CardInfo("Lillie Watts", "35 years old", R.drawable.mad_max));
    }
}
