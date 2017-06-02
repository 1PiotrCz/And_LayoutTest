package com.example.piotr.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener{

    TextView egzampleText;
    Button buttonLarge;
    Button buttonSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        egzampleText = (TextView) findViewById(R.id.egzampleText);
        egzampleText.setText("Zmieniony tekst");
        egzampleText.setOnClickListener(this);

        buttonLarge = (Button) findViewById(R.id.buttonLarge);
//        buttonLarge.setText("Large");
        buttonLarge.setOnClickListener(this);

        buttonSecond = (Button) findViewById(R.id.buttonSecond);
        buttonSecond.setOnClickListener(this);

    }

    @Override
    protected void onStop(){
        super.onStop();
    }


    @Override
    public void onClick(View v) {
        if(v.getId()== buttonLarge.getId()){
            Toast.makeText(this, "Wcisnieto przycisk duzy",Toast.LENGTH_LONG).show();
        }else if(v.getId()== buttonSecond.getId()){
            Toast.makeText(this, "Wcisnieto przycisk drugi",Toast.LENGTH_SHORT).show();
        }else if(v.getId() == egzampleText.getId()){
            Toast.makeText(this, "Wciśnięto tekst",Toast.LENGTH_SHORT).show();
        }

    }
}
