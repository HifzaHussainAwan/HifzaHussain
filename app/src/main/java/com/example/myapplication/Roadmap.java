package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class Roadmap extends AppCompatActivity {


    Button btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roadmap);

        btn = findViewById(R.id.btn1);
        btn1 = findViewById(R.id.btn2);
        btn2 = findViewById(R.id.btn3);
        btn3 = findViewById(R.id.btn4);
        btn4 = findViewById(R.id.btn5);
        btn5 = findViewById(R.id.btn6);
        btn6 = findViewById(R.id.btn7);
        btn7 = findViewById(R.id.btn8);
        btn8 = findViewById(R.id.btn9);
        btn9 = findViewById(R.id.btn10);
        btn10 = findViewById(R.id.btn11);


        btn.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for btn1
                Intent intent = new Intent(Roadmap.this, Tag1.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for btn2
                Toast.makeText(Roadmap.this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for btn3
                Toast.makeText(Roadmap.this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for btn4
                Toast.makeText(Roadmap.this, "Button 4 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for btn5
                Toast.makeText(Roadmap.this, "Button 5 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for btn6
                Toast.makeText(Roadmap.this, "Button 6 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for btn7
                Toast.makeText(Roadmap.this, "Button 7 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for btn8
                Toast.makeText(Roadmap.this, "Button 8 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for btn9
                Toast.makeText(Roadmap.this, "Button 9 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for btn10
                Toast.makeText(Roadmap.this, "Button 10 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform action for btn11
                Toast.makeText(Roadmap.this, "Button 11 clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

}