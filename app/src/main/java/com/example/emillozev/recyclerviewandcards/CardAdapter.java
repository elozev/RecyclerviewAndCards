package com.example.emillozev.recyclerviewandcards;

import android.support.v7.widget.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder> {

    private List<CardInfo> mPersons;

    public CardAdapter(List<CardInfo> cardInfoList){
        this.mPersons = cardInfoList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_list_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTitle.setText(mPersons.get(position).getName());
        holder.mDescription.setText(mPersons.get(position).getDescription());
        holder.mPhoto.setImageResource(mPersons.get(position).getPhoto());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return mPersons.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        android.support.v7.widget.CardView mCardView;
        TextView mTitle;
        TextView mDescription;
        ImageView mPhoto;

        public MyViewHolder(View itemView) {
            super(itemView);
            mCardView = (android.support.v7.widget.CardView) itemView.findViewById(R.id.cardView);
            mTitle = (TextView) itemView.findViewById(R.id.person_name);
            mDescription = (TextView) itemView.findViewById(R.id.person_age);
            mPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
        }
    }
}
