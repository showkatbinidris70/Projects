package com.idb.fahrentocelsius;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputET;
    private Button convertBtn;
    private TextView resultTV, statusTV;
    private RadioButton fahrenToCel, celToFahren;
    private String fahrenhite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputET = findViewById(R.id.inputET);
        convertBtn = findViewById(R.id.convertBtn);
        resultTV = findViewById(R.id.resultTV);
        statusTV = findViewById(R.id.statusTV);
        fahrenToCel = findViewById(R.id.fahrenToCel);
        celToFahren = findViewById(R.id.celToFahren);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fahrenhite = inputET.getText().toString();

                if (inputET.equals("")) {
                    Toast.makeText(MainActivity.this, "Enter weather", Toast.LENGTH_SHORT).show();

                } else if (fahrenToCel.isChecked()) {
                    double fahren = Double.valueOf(fahrenhite);
                    double result = (fahren - 32) * 5 / 9;
                    resultTV.setText(String.valueOf(result));
                    if (result > 33){
                        statusTV.setText("Hot");
                    }else if (result < 25){
                        statusTV.setText("cold");
                    }else {
                        statusTV.setText("Normal");
                    }

                } else if (celToFahren.isChecked()) {
                    double fahren = Double.valueOf(fahrenhite);
                    double result = (fahren * 9/5 ) + 32;
                    resultTV.setText(String.valueOf(result));
                    if (result > 150){
                        statusTV.setText("Hot");
                    }else if (result < 100){
                        statusTV.setText("cold");
                    }else {
                        statusTV.setText("Normal");
                    }
                }

            }
        });


    }
}

 //  else if (celToFahren.isChecked()){
//                        double fahren = Double.valueOf(fahrenhite);
//                        double result = (fahren -32 ) * 5/9;
//                        resultTV.setText(String.valueOf(result));
//                        if (result > 33){
//                            statusTV.setText("Hot");
//                        }else if (result < 25){
//                            statusTV.setText("Cold");
//                        }else{
//                            statusTV.setText("Normal");
//                        }
//                    }