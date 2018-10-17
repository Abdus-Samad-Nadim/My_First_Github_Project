package com.example.nadim.a2ndproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.xml.transform.Result;

public class IntentOnePageToAnother extends AppCompatActivity {
    Button button;
    EditText name,email,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_one_page_to_another);

        button = findViewById(R.id.send);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        age = findViewById(R.id.age);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameText = name.getText().toString();
                String ageText =  age.getText().toString();
                String emailText = email.getText().toString();
                Intent intent = new Intent(IntentOnePageToAnother.this,Result2.class);
                intent.putExtra("Name",nameText);
                intent.putExtra("Age",ageText);
                intent.putExtra("Email",emailText);

                startActivity(intent);

            }
        });
    }
}
