package com.example.daftarsmartphone;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHapeAdapter extends RecyclerView.Adapter<ListHapeAdapter.ListViewHolder> {
    private ArrayList<hape> listhape;
    private Context context;
    //private Context mContext;

    public ListHapeAdapter(Context context, ArrayList<hape> list){
        this.listhape = list;
        this.context = context;
        //mContext = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_hp, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        final hape hape = listhape.get(position);
        holder.txtnama.setText(hape.getNama());
        holder.txtklan.setText(hape.getKlan());

        Glide.with(holder.itemView.getContext())
                .load(hape.getFoto())
                .apply(new RequestOptions().override(1000, 1000))
                .into(holder.image);

        holder.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("txtnama", hape.getNama());
                intent.putExtra("txtklan", hape.getKlan());
                intent.putExtra("txtdesk", hape.getDeskripsi());
                intent.putExtra("image", hape.getFoto());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listhape.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout relative;
        ImageView image;
        TextView txtnama, txtklan;

        ListViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.img_hp);
            txtnama = itemView.findViewById(R.id.txt_nama);
            txtklan = itemView.findViewById(R.id.txt_klan);
            relative = itemView.findViewById(R.id.relative);
        }
    }
}
