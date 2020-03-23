package com.hfad.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.hfad.lists.data.Minion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListActivity extends AppCompatActivity {


   public static final String TAG = "butcheer";
   private ListView minionsListView;
   private String[] minions =
      new String[]{"Carl", "Kevin", "Phil", "Jerry", "Stuart", "Tom", "Dave", "Tim"};

   private List<Minion> minionsList = new ArrayList<>();


   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_list);
      minionsListView = findViewById(R.id.list_minions_list);
//      List<String> minionsList = new ArrayList<>(Arrays.asList(minions));
//      ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                                                        android.R.layout.simple_list_item_1,
//                                                        minionsList);

      initMinionsList();
      ArrayAdapter<Minion> adapter = new MinionsAdapter(this, minionsList);
      minionsListView.setAdapter(adapter);

      minionsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(ListActivity.this, position + "", Toast.LENGTH_SHORT).show();
         }
      });

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
