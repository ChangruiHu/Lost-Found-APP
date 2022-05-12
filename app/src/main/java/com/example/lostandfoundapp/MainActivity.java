package com.example.lostandfoundapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt_add,bt_find;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_add  =findViewById(R.id.bt_add);
        bt_find = findViewById(R.id.bt_find);
        bt_find.setOnClickListener(this);
        bt_add.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_add:
                Intent intent = new Intent(MainActivity.this,AddActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_find:
                Intent intent1 = new Intent(MainActivity.this,FindActivity.class);
                startActivity(intent1);
                break;
        }
    }
}