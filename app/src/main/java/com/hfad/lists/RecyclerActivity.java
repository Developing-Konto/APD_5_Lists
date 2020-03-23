package com.hfad.lists;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hfad.lists.data.Minion;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {


   private RecyclerView recyclerView;
   private List<Minion> minionsList = new ArrayList<>();

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_recycler);
      recyclerView = findViewById(R.id.recycler);
      initMinionsList();
      MinionsRecyclerAdapter minionsRecyclerAdapter = new MinionsRecyclerAdapter(minionsList);
      recyclerView.setAdapter(minionsRecyclerAdapter);
      RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
      recyclerView.setLayoutManager(layoutManager);
      recyclerView.setItemAnimator(new DefaultItemAnimator());

     
   }

   private void initMinionsList() {
      minionsList.add(new Minion("Carl", 6));
      minionsList.add(new Minion("Kevin", 8));
      minionsList.add(new Minion("Phil", 6));
      minionsList.add(new Minion("Jerry", 7));
      minionsList.add(new Minion("Stuart", 9));
      minionsList.add(new Minion("Tom", 8));
      minionsList.add(new Minion("Dave", 5));
      minionsList.add(new Minion("Tim", 10));
   }
}
