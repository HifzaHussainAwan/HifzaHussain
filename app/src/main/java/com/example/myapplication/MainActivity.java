package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button btn = findViewById(R.id.btn),btn1 = findViewById(R.id.btn1);
EditText txt = findViewById(R.id.text),txt1 = findViewById(R.id.text2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyHelperDatabase dbHelper=new MyHelperDatabase(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button_two=new Intent(MainActivity.this,Home.class);
                startActivity(button_two);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button_two=new Intent(MainActivity.this,NewAccount.class);
                startActivity(button_two);
            }
        });
    }
}