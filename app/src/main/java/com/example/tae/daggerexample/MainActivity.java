package com.example.tae.daggerexample;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.AppInitializer;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;
    private TextView textView;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((AppInitializer) getApplication())
                .getDependencyComponent().inject(this);
        textView=findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        textView.setText(sharedPreferences.getString("s","String"));

        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, secondactivity.class);
                startActivity(i);
            }
        });
    }
}
