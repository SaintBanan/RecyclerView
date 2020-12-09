package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.view.LayoutInflater;
import java.util.List;

public class RViewAdapter extends RecyclerView.Adapter<RViewAdapter.ViewHolder> {
    private List<BallValve> ball_valves;

    RViewAdapter(List<BallValve> ball_valves) {
        this.ball_valves = ball_valves;
    }

    @Override
    public RViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RViewAdapter.ViewHolder holder, int position) {
        BallValve ball_valve = ball_valves.get(position);

        //Чередовать цвета строк
        int color = ball_valve.getId() % 2 == 0 ? Color.WHITE : Color.LTGRAY;

        //Отобразить id товара
        holder.ball_valve_id_view.setText(String.valueOf(ball_valve.getId()));

        //Отобразить наименование товара
        holder.ball_valve_name_view.setText(ball_valve.getName());

        holder.itemView.setBackgroundColor(color);
        holder.itemView.setTag(ball_valve);
        holder.itemView.setOnClickListener(onClickListener);
    }

    @Override
    public int getItemCount() {
        return ball_valves.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView ball_valve_id_view, ball_valve_name_view;

        ViewHolder(View view) {
            super(view);
            ball_valve_id_view = view.findViewById(R.id.ball_valve_id);
            ball_valve_name_view = view.findViewById(R.id.ball_valve_name);
        }
    }

    final private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            BallValve ball_valve = (BallValve) view.getTag();
            Context context = view.getContext();
            Intent intent = new Intent(context, DetailActivity.class);

            //Передать в DetailActivity характеристики товара
            intent.putExtra("details", ball_valve.getFeatures());
            context.startActivity(intent);
        }
    };
}
