package com.example.mys;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

import java.util.Locale;

public class Start extends AppCompatActivity {
    TextView textView;
    Button button;
    TextToSpeech tts;
    String text;
    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        textView = findViewById(R.id.textView1);
        button=findViewById(R.id.start);
                String text="";
                try{
                    InputStream is = getAssets().open("hello1.txt");
                    int size=is.available();
                    byte[] buffer=new byte[size];
                    is.read(buffer);
                    is.close();
                    text=new String(buffer);
                }
                catch (IOException ex){
                    ex.printStackTrace();

                }
            textView.setText(text);


        tts = new TextToSpeech(Start.this, new TextToSpeech.OnInitListener() {

            @Override
            public void onInit(int status) {

                if (status == TextToSpeech.SUCCESS) {

                    result = tts.setLanguage(Locale.UK);

                } else {

                    Toast.makeText(getApplicationContext(),
                            "Feature not Supported in Your Device",
                            Toast.LENGTH_SHORT).show();

                }

            }
        });

    }

    public void doSomething(View v) {
        // TODO Auto-generated method stub

        switch (v.getId()) {
            case R.id.start:

                if(result == TextToSpeech.LANG_NOT_SUPPORTED || result == TextToSpeech.LANG_MISSING_DATA){

                    Toast.makeText(getApplicationContext(),
                            "Feature not Supported in Your Device",
                            Toast.LENGTH_SHORT).show();

                }else{
                    text = textView.getText().toString();

                    tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);

                }
                break;

    }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tts.stop();
        tts.shutdown();
    }
}
