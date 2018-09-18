package com.example.hemapalanisamy.mvpsample.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hemapalanisamy.mvpsample.Pojo;
import com.example.hemapalanisamy.mvpsample.R;

import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    private final List<Pojo> pojoList;

    public MainAdapter(List<Pojo> pojoList) {
        this.pojoList = pojoList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_main, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pojo pojo=pojoList.get(position);
        holder.title.setText(pojo.getTitle());
        holder.body.setText(pojo.getBody());
    }

    @Override
    public int getItemCount() {
        return pojoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

       public TextView title, body;
        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            body = (TextView) view.findViewById(R.id.body);
        }

    }
}