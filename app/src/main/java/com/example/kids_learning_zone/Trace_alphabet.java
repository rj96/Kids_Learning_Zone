package com.example.kids_learning_zone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.widget.Toast;

import com.danny_jiang.tracinglibrary.bean.LetterFactory;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;

import java.util.Locale;

public class Trace_alphabet extends AppCompatActivity {
    TracingLetterView letterView;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trace_alphabet);
        Intent intent;
        intent = getIntent();
        String alphabet = intent.getStringExtra("alpha name");


        //create an object textToSpeech and adding voice feature to it
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR ){
                    // To choose language
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });

        //find and check the letterView to trace
        letterView = findViewById(R.id.letter);
        switch (alphabet){
            case "A" : letterView.setLetterChar(LetterFactory.A);
                        break;
            case "B" : letterView.setLetterChar(LetterFactory.B);
                break;
            case "C" : letterView.setLetterChar(LetterFactory.C);
                break;
            case "D" : letterView.setLetterChar(LetterFactory.D);
                break;
            case "E" : letterView.setLetterChar(LetterFactory.E);
                break;
            case "F" : letterView.setLetterChar(LetterFactory.F);
                break;
            case "G" : letterView.setLetterChar(LetterFactory.G);
                break;
            case "H" : letterView.setLetterChar(LetterFactory.H);
                break;
            case "I" : letterView.setLetterChar(LetterFactory.I);
                break;
            case "J" : letterView.setLetterChar(LetterFactory.J);
                break;
            case "K" : letterView.setLetterChar(LetterFactory.K);
                break;
            case "L" : letterView.setLetterChar(LetterFactory.L);
                break;
            case "M" : letterView.setLetterChar(LetterFactory.M);
                break;
            case "N" : letterView.setLetterChar(LetterFactory.N);
                break;
            case "O" : letterView.setLetterChar(LetterFactory.O);
                break;
            case "P" : letterView.setLetterChar(LetterFactory.P);
                break;
            case "Q" : letterView.setLetterChar(LetterFactory.Q);
                break;
            case "R" : letterView.setLetterChar(LetterFactory.R);
                break;
            case "S" : letterView.setLetterChar(LetterFactory.S);
                break;
            case "T" : letterView.setLetterChar(LetterFactory.T);
                break;
            case "U" : letterView.setLetterChar(LetterFactory.U);
                break;
            case "V" : letterView.setLetterChar(LetterFactory.V);
                break;
            case "W" : letterView.setLetterChar(LetterFactory.W);
                break;
            case "X" : letterView.setLetterChar(LetterFactory.X);
                break;
            case "Y" : letterView.setLetterChar(LetterFactory.Y);
                break;
            case "Z" : letterView.setLetterChar(LetterFactory.Z);
                break;
        }
        letterView.setPointColor(Color.BLUE);
        letterView.setInstructMode(true);

        letterView.setTracingListener(new TracingLetterView.TracingListener() {
            @Override
            public void onFinish() {
                Toast.makeText(Trace_alphabet.this,
                        "traced successfully", Toast.LENGTH_SHORT).show();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    textToSpeech.speak("Congratulations, You traced "+alphabet+" successfully",TextToSpeech.QUEUE_FLUSH,null,null);
                } else {
                    textToSpeech.speak("Congratulations, You traced "+alphabet+" successfully", TextToSpeech.QUEUE_FLUSH, null);
                }
            }

            @Override
            public void onTracing(float x, float y) {
                Log.e("ABC", "tracing x : "+x+ " y : "+y);
            }
        });
    }
}