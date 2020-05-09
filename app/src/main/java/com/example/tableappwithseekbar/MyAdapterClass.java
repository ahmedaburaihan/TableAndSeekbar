package com.example.tableappwithseekbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapterClass extends RecyclerView.Adapter<MyAdapterClass.MyViewHolder> {
    ArrayList<MyModel> myModelArrayList;

    public MyAdapterClass(ArrayList<MyModel> myModelArrayList) {
        this.myModelArrayList = myModelArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        MyModel myModel = myModelArrayList.get(position);
        holder.tableNumber.setText(Integer.toString(myModel.getTableNumber()));
        holder.number.setText(Integer.toString(myModel.getNumber()));
        holder.resultNumber.setText(Integer.toString(myModel.getResultNumber()));


    }

    @Override
    public int getItemCount() {
        return myModelArrayList.size();
    }





    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tableNumber, number, resultNumber;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tableNumber = itemView.findViewById(R.id.txtFirstNum);
            number = itemView.findViewById(R.id.txtSecondNum);
            resultNumber = itemView.findViewById(R.id.txtResult);


        }
    }

}
