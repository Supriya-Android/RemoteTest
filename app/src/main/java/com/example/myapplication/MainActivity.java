package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name_iv,number_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name_iv=findViewById(R.id.name_iv);
        number_iv=findViewById(R.id.number_iv);
        String name=Myclass.getName();
        name_iv.setText(name);
        int number=Myclass.getNumber();
        number_iv.setText(number);
    }
}