package net.rubydata.project.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import net.rubydata.project.R;

import java.util.ArrayList;

import objects.demo_doctor;

/**
 * Created by lee on 23/03/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    //    private demo_doctor[] itemsData;
    ArrayList<demo_doctor> itemsData;

    public MyAdapter(ArrayList<demo_doctor> itemsData) {
        this.itemsData = itemsData;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_list_appointment, null);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        demo_doctor d=itemsData.get(position);
//        viewHolder.imgViewIcon.setImageResource(itemsData[position].getImageItem());
//        viewHolder.txtDay.setText(itemsData[position].getDate());
//        viewHolder.txtTime.setText(itemsData[position].getTime());
//        viewHolder.txtAdrress.setText(itemsData[position].getTxtAdress());
        viewHolder.imgViewIcon.setImageResource(d.getImageItem());
//        viewHolder.txtDay.setText(d.get);
    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTime, txtDay, txtAdrress, txtNameHp;
        public ImageView imgViewIcon;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtTime = (TextView) itemLayoutView.findViewById(R.id.txtTime);
            txtDay = (TextView) itemLayoutView.findViewById(R.id.txtDate);
            txtAdrress = (TextView) itemLayoutView.findViewById(R.id.txtAdress);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.imgIcons);
        }
    }

    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return itemsData.size();
    }
}