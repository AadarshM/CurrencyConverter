package com.aadarsh.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollars = (EditText) findViewById(R.id.dollars);
        double d = Double.parseDouble(dollars.getText().toString());
        double inr = 60 * d;
        Toast.makeText(this, "Value in Rupees is " + String.format("%.2f",inr), Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
