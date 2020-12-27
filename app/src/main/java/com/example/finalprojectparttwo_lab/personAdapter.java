package com.example.finalprojectparttwo_lab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class personAdapter extends RecyclerView.Adapter<personAdapter.viewHolder> {

    public static Object viewHolder;

    public static class viewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView imag;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.tv_1);
            imag=itemView.findViewById(R.id.tv_2);
        }
    }

    private Context context;
    private  List<person> personList;

    public personAdapter(Context context, List<person>personList) {
        this.context=context;
        this.personList=personList;
    }

    @NonNull
    @Override
    public personAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.recycler,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull personAdapter.viewHolder holder, int position) {

        person p=personList.get(position);
        holder.name.setText(p.getName());
        holder.imag.setImageResource(p.getImag());
    }

    @Override
    public final int getItemCount() {
        return personList.size();
    }
}
