package com.hfad.lists;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.hfad.lists.data.Minion;

import java.util.List;

/**
 * Created by Butcheer on 2020-03-20 19:14
 *  
 * Implement ViewHolder Pattern for decrease using finnByView method
 */
public class MinionsAdapter extends ArrayAdapter<Minion> {

   public MinionsAdapter(@NonNull Context context,
                         @NonNull List<Minion> objects) {
      super(context, -1, objects);
   }

   @NonNull
   @Override
   public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      ViewHolder viewHolder;
      if (convertView == null) {
         LayoutInflater inflater = (LayoutInflater) getContext()
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         convertView = inflater.inflate(R.layout.item_minion, parent, false);
         viewHolder = new ViewHolder();
         viewHolder.nameTextView = convertView.findViewById(R.id.item_name);
         viewHolder.ageTextView = convertView.findViewById(R.id.item_age);
         convertView.setTag(viewHolder);
      } else {
         viewHolder = (ViewHolder) convertView.getTag();
      }

      Minion minion = getItem(position);
      viewHolder.nameTextView.setText(minion.getName());
      viewHolder.ageTextView.setText(getContext().getString(R.string.age, minion.getAge()));

      return convertView;
   }


   private class ViewHolder {
      private TextView nameTextView;
      private TextView ageTextView;

   }
}
