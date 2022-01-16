package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    LinearLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= findViewById(R.id.button);
        myLayout= findViewById(R.id.linearLayout);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Fragment_01 fragment_01=new Fragment_01();
            FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.linearLayout, fragment_01);
            transaction.commit();
            }
        });
    }
}