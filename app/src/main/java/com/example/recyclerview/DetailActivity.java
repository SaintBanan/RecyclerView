package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView details_view = findViewById(R.id.details);
        Intent intent = getIntent();
        String details_str = intent.getStringExtra("details");

        //Отобразить характеристики товара
        details_view.setText(details_str);
    }
}