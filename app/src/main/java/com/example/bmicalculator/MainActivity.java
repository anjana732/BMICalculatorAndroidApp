package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight, edtHeightFt, edtHeightIn;
        TextView txtResult;
        Button btnCalculate;
        LinearLayout Llmain;

        edtWeight=findViewById(R.id.edtWeigth);
        edtHeightFt=findViewById(R.id.edtHeightFt);
        edtHeightIn=findViewById(R.id.edtHeightIn);
        btnCalculate=findViewById(R.id.btnCalculate);
        txtResult=findViewById(R.id.txtResult);
        Llmain=findViewById(R.id.Llmain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int wt =  Integer.parseInt(edtWeight.getText().toString());
              int HFt = Integer.parseInt(edtHeightFt.getText().toString());
              int HIn = Integer.parseInt(edtHeightIn.getText().toString());

              int ht = HFt*12 + HIn;
              double height = ht*2.53;
              double heightm = height/100;

              double bmi = wt/(heightm*heightm);

              if(bmi>25){
                  txtResult.setText("You are Overweight");
                  Llmain.setBackgroundColor(getResources().getColor(R.color.ColorOw));
              }else if(bmi<18){
                  txtResult.setText("You are Underweight");
                  Llmain.setBackgroundColor(getResources().getColor(R.color.ColorUw));
              }else{
                  txtResult.setText("You are Healthy");
                  Llmain.setBackgroundColor(getResources().getColor(R.color.ColorH));
              }

            }
        });

    }
}