package com.example.arithmeticapp;

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

public class even_odd extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_even_odd);
        ed1=(EditText) findViewById(R.id.number);
        b1=(AppCompatButton) findViewById(R.id.evodd);
        b2=(AppCompatButton) findViewById(R.id.backmenu);

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            String getNumber = ed1.getText().toString();
                            int n = Integer.parseInt(getNumber);
                            if (n % 2 == 0) {
                                Toast.makeText(getApplicationContext(), String.valueOf(n) + " " + "is an even Number", Toast.LENGTH_LONG).show();
                            }
                                else
                                {

                                    Toast.makeText(getApplicationContext(), String.valueOf(n) + " is an odd number", Toast.LENGTH_SHORT).show();
                                }

                        } catch (Exception e) {
                            Toast.makeText(getApplicationContext(), "Enter a number", Toast.LENGTH_LONG).show();
                        }
                    }
                });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(k);
            }
        });

    }
}

