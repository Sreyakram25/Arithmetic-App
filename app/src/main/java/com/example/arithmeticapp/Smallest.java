package com.example.arithmeticapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Smallest extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_smallestt);
        ed1=(EditText) findViewById(R.id.no1);
        ed2=(EditText) findViewById(R.id.no2);
        b1=(AppCompatButton) findViewById(R.id.findsmall);
        b2=(AppCompatButton) findViewById(R.id.backmenu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String getNumber1 = ed1.getText().toString();
                    String getNumber2 = ed2.getText().toString();
                    int n1 = Integer.parseInt(getNumber1);
                    int n2 = Integer.parseInt(getNumber2);
                    if (n1 < n2) {
                        Toast.makeText(getApplicationContext(), String.valueOf(n1) + " is the smallest number", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), String.valueOf(n2) + " is the smallest number", Toast.LENGTH_SHORT).show();
                    }
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Not Possible to compare,Enter both Numbers!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);
            }
        });
    }
}