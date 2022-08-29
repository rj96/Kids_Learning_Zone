package com.example.kids_learning_zone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IndexScreen extends AppCompatActivity {

    //creating intent to call the another activity
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_screen);

        //find canvasDraw textView
        TextView canvas = findViewById(R.id.canvasDraw);
        TextView traceAlpha = findViewById(R.id.traceAlphabaet); //trace alphabet button to open trace view
        //set onClick for canvas and call another activity
        canvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(IndexScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //set onClick for trace alphabet and call trace alphabet activity
        traceAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(IndexScreen.this, trace_alphabet_Menu.class);
                startActivity(intent);
            }
        });



    }
}