package com.sitihajar_f55123063.wonderland_sulteng;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private List<String> dataList;

    public HomeAdapter(List<String> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.descriptionTextView.setText(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class HomeViewHolder extends RecyclerView.ViewHolder {
        TextView descriptionTextView;

        public HomeViewHolder(View itemView) {
            super(itemView);
            descriptionTextView = itemView.findViewById(R.id.textViewDescription);
        }
    }
}
