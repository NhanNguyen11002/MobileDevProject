package com.example.nike_store.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.nike_store.R;
import com.example.nike_store.model.NewRelease;

import java.util.List;

public class NewReleaseRecyclerAdapter extends RecyclerView.Adapter<NewReleaseRecyclerAdapter.NewReleaseViewHolder> {
    private Context context;
    private List<NewRelease> newReleaseList;

    public NewReleaseRecyclerAdapter(Context context, List<NewRelease> newReleaseList) {
        this.context = context;
        this.newReleaseList = newReleaseList;
    }

    @Override
    public NewReleaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.new_release_recycler_items, parent, false);
        final NewReleaseViewHolder viewHolder = new NewReleaseViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NewReleaseRecyclerAdapter.NewReleaseViewHolder holder, int position) {
        holder.itemName.setText(newReleaseList.get(position).getName());
        holder.price.setText(newReleaseList.get(position).getPrice());
        holder.gender.setText(newReleaseList.get(position).getGender());
        Glide.with(context).load(newReleaseList.get(position).getImageurl()).into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return newReleaseList.size();
    }

    public static class NewReleaseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView itemImage;
        TextView price, gender, itemName;
        LinearLayout linearLayout_new_release;

        public NewReleaseViewHolder(View itemView) {
            super(itemView);
            linearLayout_new_release = itemView.findViewById(R.id.new_release);
            itemImage = itemView.findViewById(R.id.imageView);
            price = itemView.findViewById(R.id.price);
            gender = itemView.findViewById(R.id.gender);
            itemName = itemView.findViewById(R.id.shoe_name);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
