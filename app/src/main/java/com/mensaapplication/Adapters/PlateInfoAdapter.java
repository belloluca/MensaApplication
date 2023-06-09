package com.mensaapplication.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.mensaapplication.Models.Food;
import com.mensaapplication.R;

import java.util.List;

public class PlateInfoAdapter extends RecyclerView.Adapter<PlateInfoAdapter.ViewHolder>{
    Food plate;
    private OnButtonClickListener buttonClickListener;
    public PlateInfoAdapter(Food plate) {
        this.plate = plate;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.meal_recyclerview_row,parent,false);
        return new ViewHolder(inflate);
    }

    public interface OnButtonClickListener {
        void onButtonClick(int position);
    }

    public void setOnButtonClickListener(OnButtonClickListener listener) {
        this.buttonClickListener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final int buttonPosition = position; // Aggiungi questa riga

        holder.plateLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonClickListener != null) {
                    buttonClickListener.onButtonClick(buttonPosition); // Usa buttonPosition invece di position
                }
            }
        });
//        holder.plateName.setText(plates.get(position).getName());
//        holder.priceForStud.setText(plates.get(position).getPriceForStudents());
//        holder.priceForNonStud.setText(plates.get(position).getPriceForNonStudents());
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ConstraintLayout plateLayout;
        TextView plateName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            plateLayout = itemView.findViewById(R.id.plateInfoLayout);
            plateName = itemView.findViewById(R.id.plateName);
        }
    }
}
