package com.example.ahmed.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    EditText e1, e3, e4;
    TextView t1, t2 ,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        e1 = (EditText) findViewById(R.id.e1);
        e3 = (EditText) findViewById(R.id.e3);
        e4 = (EditText) findViewById(R.id.e4);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);


    }


    public void Calc(View v){

        double total = Double.parseDouble(e1.getText().toString());
        double interest = Double.parseDouble(e3.getText().toString());
        int years = Integer.parseInt(e4.getText().toString());

        double U = total * 0.25;

        double O = total * 0.75 ;

        double N = interest * years * O ;

        double L = N + O ;

        double S = L / (12 * years) ;


        t1.setText( String.valueOf(S));
        t2.setText( String.valueOf(L));
        t3.setText( String.valueOf(U));



    }


}
