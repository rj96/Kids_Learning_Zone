package com.example.kids_learning_zone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.danny_jiang.tracinglibrary.bean.LetterFactory;
import com.danny_jiang.tracinglibrary.view.TracingLetterView;

public class trace_alphabet_Menu extends AppCompatActivity {
    TracingLetterView letterView;
    Intent intent;
    TextView A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R1,S,T,U,V,W,X,Y,Z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trace_alphabet_menu);

        //IDENTIFYING ALL ALPHABET BUTTONS
        A = (TextView) findViewById(R.id.textViewA);
        B = (TextView) findViewById(R.id.textViewB);
        C = (TextView) findViewById(R.id.textViewC);
        D = (TextView) findViewById(R.id.textViewD);
        E = (TextView) findViewById(R.id.textViewE);
        F = (TextView) findViewById(R.id.textViewF);
        G = (TextView) findViewById(R.id.textViewG);
        H = (TextView) findViewById(R.id.textViewH);
        I = (TextView) findViewById(R.id.textViewI);
        J = (TextView) findViewById(R.id.textViewJ);
        K = (TextView) findViewById(R.id.textViewK);
        L = (TextView) findViewById(R.id.textViewL);
        M = (TextView) findViewById(R.id.textViewM);
        N = (TextView) findViewById(R.id.textViewN);
        O = (TextView) findViewById(R.id.textViewO);
        P = (TextView) findViewById(R.id.textViewP);
        Q = (TextView) findViewById(R.id.textViewQ);
        R1 = (TextView) findViewById(R.id.textViewR);
        S = (TextView) findViewById(R.id.textViewS);
        T = (TextView) findViewById(R.id.textViewT);
        U = (TextView) findViewById(R.id.textViewU);
        V = (TextView) findViewById(R.id.textViewV);
        W = (TextView) findViewById(R.id.textViewW);
        X = (TextView) findViewById(R.id.textViewX);
        Y = (TextView) findViewById(R.id.textViewY);
        Z = (TextView) findViewById(R.id.textViewZ);

        //CALLING TRACE ALPHABET FOR TRACING
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "A");
                startActivity(intent);
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "B");
                startActivity(intent);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "C");
                startActivity(intent);
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "D");
                startActivity(intent);
            }
        });
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "E");
                startActivity(intent);
            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "F");
                startActivity(intent);
            }
        });
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "G");
                startActivity(intent);
            }
        });
        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "H");
                startActivity(intent);
            }
        });
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "I");
                startActivity(intent);
            }
        });
        J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "J");
                startActivity(intent);
            }
        });
        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "K");
                startActivity(intent);
            }
        });
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "L");
                startActivity(intent);
            }
        });
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "M");
                startActivity(intent);
            }
        });
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "N");
                startActivity(intent);
            }
        });
        O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "O");
                startActivity(intent);
            }
        });
        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "P");
                startActivity(intent);
            }
        });
        Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "Q");
                startActivity(intent);
            }
        });
        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "R");
                startActivity(intent);
            }
        });
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "S");
                startActivity(intent);
            }
        });
        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "T");
                startActivity(intent);
            }
        });
        U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "U");
                startActivity(intent);
            }
        });
        V.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "V");
                startActivity(intent);
            }
        });
        W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "W");
                startActivity(intent);
            }
        });
        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "X");
                startActivity(intent);
            }
        });
        Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "Y");
                startActivity(intent);
            }
        });
        Z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(trace_alphabet_Menu.this, Trace_alphabet.class);
                intent.putExtra("alpha name", "Z");
                startActivity(intent);
            }
        });

    }
}