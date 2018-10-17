package com.example.nadim.a2ndproject;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class OptionMenuIntegrate extends AppCompatActivity {
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_integrate);
        relativeLayout = findViewById(R.id.relative);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.marcedes)
        {
          //  relativeLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.bbugatti));
            relativeLayout.setBackgroundResource(R.drawable.mercedes);
        }

        if(id == R.id.lembo)
        {
           // relativeLayout.setBackgroundColor(Color.YELLOW);
            relativeLayout.setBackgroundResource(R.drawable.wlembo);
        }
        if(id == R.id.bugatti)
        {
            //relativeLayout.setBackgroundColor(Color.BLACK);
            relativeLayout.setBackgroundResource(R.drawable.bbugatti);
        }

        if(id == R.id.logout)
        {
            Toast.makeText(this,"Logout Pressed!",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);

    }
}
