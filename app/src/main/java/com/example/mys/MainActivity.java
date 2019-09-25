package com.example.mys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    CardView cardView, cardView1, cardView2, cardView3, cardView4, cardView5;
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardView = findViewById(R.id.cardViewA);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start.class);

                startActivity(intent);
//                String text = "";
//                try {
//                    InputStream is = getAssets().open("hello1.txt");
//                    int size = is.available();
//                    byte[] buffer = new byte[size];
//                    is.read(buffer);
//                    is.close();
//                    text = new String(buffer);
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//
//                }
//                textView.setText(text);


            }
        });
        cardView1 = findViewById(R.id.cardViewB);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start.class);
                startActivity(intent);
            }
        });

        cardView2 = findViewById(R.id.cardViewC);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start.class);
                startActivity(intent);
            }
        });

        cardView3 = findViewById(R.id.cardViewD);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start.class);
                startActivity(intent);
            }
        });

        cardView4 = findViewById(R.id.cardViewE);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start.class);
                startActivity(intent);
            }
        });

        cardView5 = findViewById(R.id.cardViewF);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Start.class);
                startActivity(intent);
            }
        });
    }
}
