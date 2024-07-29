package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewAccount extends AppCompatActivity {
Button btn;
EditText text,text1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
        btn=findViewById(R.id.btn);
        text=findViewById(R.id.text);
        text1=findViewById(R.id.text2);
        MyHelperDatabase dbHelper=new MyHelperDatabase(this);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent in=new Intent(NewAccount.this,Home.class);
        startActivity(in);
    }
});
    }
}