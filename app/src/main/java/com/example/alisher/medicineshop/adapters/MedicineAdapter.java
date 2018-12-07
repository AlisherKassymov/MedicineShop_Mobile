package com.example.alisher.medicineshop.adapters;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.alisher.medicineshop.R;
import com.example.alisher.medicineshop.activities.MedicineItemActivity;
import com.example.alisher.medicineshop.entities.Medicine;

import java.util.List;

public class MedicineAdapter extends RecyclerView.Adapter<MedicineAdapter.MyViewHolder>{

    private Context mContext ;
    private List<Medicine> mData ;

    public MedicineAdapter(Context mContext, List lst) {
        this.mContext = mContext;
        this.mData = lst;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.medicines_layout,parent,false);
        final MyViewHolder viewHolder=new MyViewHolder(view);
        viewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mContext,MedicineItemActivity.class);
                intent.putExtra("medicine_name",mData.get(viewHolder.getAdapterPosition()).getName());
                intent.putExtra("medicine_description",mData.get(viewHolder.getAdapterPosition()).getDescription());
                intent.putExtra("medicine_price",mData.get(viewHolder.getAdapterPosition()).getPrice());

                mContext.startActivity(intent);
            }
        });
        // click listener here
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(mData.get(position).getName());
        holder.description.setText(mData.get(position).getDescription());
        holder.price.setText(mData.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name, description,price;
        ImageView image;
        LinearLayout view_container;

        public MyViewHolder(View itemView){
            super(itemView);
            view_container=itemView.findViewById(R.id.medicineContainer);
            name=itemView.findViewById(R.id.medicineName);
            description=itemView.findViewById(R.id.medicineDescription);
            price=itemView.findViewById(R.id.medicinePrice);
            image=itemView.findViewById(R.id.medicineImage);
        }
    }
}
