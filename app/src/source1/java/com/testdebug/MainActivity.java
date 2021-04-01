package com.testdebug;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    TextView name_iv,address_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name_iv=findViewById(R.id.name_iv);
        String name= Myclass.getName();
        name_iv.setText(name);
        address_iv=findViewById(R.id.address_iv);
        String address=Myclass.getName();
        address_iv.setText(address);
    }
}