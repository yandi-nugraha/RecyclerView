package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KendaraanAdapter extends RecyclerView.Adapter<KendaraanAdapter.ViewHolder> {

    private final ArrayList<Kendaraan> values;
    private final LayoutInflater inflater;

    public static final String NAMA_EXTRA = "NAMA_KEY";
    public static final String JENIS_EXTRA = "JENIS_KEY";
    public static final String DESC_EXTRA = "DESC_KEY";
    public static final String IMG_EXTRA = "IMG_KEY";

    public KendaraanAdapter(Context context, ArrayList<Kendaraan> values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public KendaraanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_kendaraan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KendaraanAdapter.ViewHolder holder, int position) {
        Kendaraan kendaraan = values.get(position);
        holder.txtName.setText(kendaraan.name);
        holder.txtType.setText(kendaraan.type);
        holder.txtDesc.setText(kendaraan.desc);
        holder.img.setImageResource(kendaraan.img);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailKendaraanActivity.class);
                intent.putExtra(NAMA_EXTRA, kendaraan.name);
                intent.putExtra(JENIS_EXTRA, kendaraan.type);
                intent.putExtra(DESC_EXTRA, kendaraan.desc);
                intent.putExtra(IMG_EXTRA, String.valueOf(kendaraan.img));
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtType;
        TextView txtDesc;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
            txtType = itemView.findViewById(R.id.txt_jenis);
            txtDesc = itemView.findViewById(R.id.txt_desc);
            img = itemView.findViewById(R.id.img_kendaraan);
        }
    }
}
