package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bAdd, bSubtract, bMultiply, bDivide;
    TextView etFirst, etSecond, etAnswer;
    Double first, second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bAdd = (Button)findViewById(R.id.add);
        bSubtract = (Button)findViewById(R.id.subtract);
        bMultiply = (Button)findViewById(R.id.multiply);
        bDivide = (Button)findViewById(R.id.divide);

        etFirst = (TextView)findViewById(R.id.et_first);
        etSecond = (TextView)findViewById(R.id.et_second);
        etAnswer = (TextView)findViewById(R.id.et_answer);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etFirst.length()==0){
                    etFirst.findFocus();
                    etFirst.setError("Cannot be empty!");
                }
                else if (etSecond.length()==0){
                    etSecond.findFocus();
                    etSecond.setError("Cannot be empty!");
                }
                else{
                    first = Double.parseDouble(etFirst.getText().toString());
                    second = Double.parseDouble(etSecond.getText().toString());
                    etAnswer.setText("Answer is " + (first + second));
                }
            }
        });

        bSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etFirst.length()==0){
                    etFirst.findFocus();
                    etFirst.setError("Cannot be empty!");
                }
                else if (etSecond.length()==0){
                    etSecond.findFocus();
                    etSecond.setError("Cannot be empty!");
                }
                else{
                    first = Double.parseDouble(etFirst.getText().toString());
                    second = Double.parseDouble(etSecond.getText().toString());
                    etAnswer.setText("Answer is " + (first - second));
                }
            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etFirst.length()==0){
                    etFirst.findFocus();
                    etFirst.setError("Cannot be empty!");
                }
                else if (etSecond.length()==0){
                    etSecond.findFocus();
                    etSecond.setError("Cannot be empty!");
                }
                else{
                    first = Double.parseDouble(etFirst.getText().toString());
                    second = Double.parseDouble(etSecond.getText().toString());
                    etAnswer.setText("Answer is " + (first * second));
                }
            }
        });

        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etFirst.length()==0){
                    etFirst.findFocus();
                    etFirst.setError("Cannot be empty!");
                }
                else if (etSecond.length()==0){
                    etSecond.findFocus();
                    etSecond.setError("Cannot be empty!");
                }
                else{
                    first = Double.parseDouble(etFirst.getText().toString());
                    second = Double.parseDouble(etSecond.getText().toString());
                    if (second == 0){
                        etSecond.findFocus();
                        etSecond.setError("Divisor cannot be zero");
                    }
                    else{
                        etAnswer.setText("Answer is " + (first / second));
                    }
                }
            }
        });

    }
}
