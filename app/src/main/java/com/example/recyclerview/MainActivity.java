package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager linear_layout_manager = new LinearLayoutManager(this);

        RViewAdapter adapter = new RViewAdapter(BallValveContent.ball_valves);
        RecyclerView view = findViewById(R.id.list);

        view.setLayoutManager(linear_layout_manager);
        view.setAdapter(adapter);
    }
}