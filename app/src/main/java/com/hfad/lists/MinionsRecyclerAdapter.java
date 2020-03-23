package com.hfad.lists;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hfad.lists.data.Minion;

import java.util.List;

/**
 * Created by Butcheer on 2020-03-23 12:38
 */
public class MinionsRecyclerAdapter extends RecyclerView.Adapter<MinionsRecyclerAdapter.MinionViewHolder> {


   private List<Minion> minionsList;


   public MinionsRecyclerAdapter(List<Minion> minionsList) {
      this.minionsList = minionsList;
   }

   @NonNull
   @Override
   public MinionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View minionView = LayoutInflater.from(parent.getContext())
                                      .inflate(R.layout.item_minion, parent, false);

      return new MinionViewHolder(minionView);
   }

   @Override
   public void onBindViewHolder(@NonNull MinionViewHolder holder, int position) {
      Minion minion = minionsList.get(position);
      holder.nameTV.setText(minion.getName());
      holder.ageTV.setText(holder.ageTV.getContext().getString(R.string.age, minion.getAge()));

   }

   @Override
   public int getItemCount() {
      return minionsList.size();
   }

   public class MinionViewHolder extends RecyclerView.ViewHolder {
      TextView nameTV;
      TextView ageTV;

      public MinionViewHolder(@NonNull View itemView) {
         super(itemView);
         nameTV = itemView.findViewById(R.id.item_name);
         ageTV = itemView.findViewById(R.id.item_age);

      }
   }
}
