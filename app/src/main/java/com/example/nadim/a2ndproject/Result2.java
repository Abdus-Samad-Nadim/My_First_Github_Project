package com.example.nadim.a2ndproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textView = findViewById(R.id.text);

        Intent intent = getIntent();

        String nameT = intent.getStringExtra("Name");
        String ageT = intent.getStringExtra("Age");
        String emailT = intent.getStringExtra("Email");

        textView.setText("Name is "+nameT+"\nAge is "+ageT+"\nEmail is "+emailT);


    }
}
