package com.example.tae.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.AppInitializer;

public class secondactivity extends AppCompatActivity {

    private TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        txtView2= findViewById(R.id.textView2);


        ((AppInitializer) getApplication())
                .getDependencyComponent()
                .inject(this);
        
    }
}
