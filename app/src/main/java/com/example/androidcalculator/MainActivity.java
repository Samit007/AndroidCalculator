package com.example.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidcalculator.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvcalc;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,btnMinus,btnMult,btnDivide,btnReset,btnTotal;
    private String operation;
    private float fNum,sNum;
    private boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operation="0";

        btn0=findViewById(R.id.zero);
        btn1=findViewById(R.id.one);
        btn2=findViewById(R.id.two);
        btn3=findViewById(R.id.three);
        btn4=findViewById(R.id.four);
        btn5=findViewById(R.id.five);
        btn6=findViewById(R.id.six);
        btn7=findViewById(R.id.seven);
        btn8=findViewById(R.id.eight);
        btn9=findViewById(R.id.nine);
        btnPlus=findViewById(R.id.plus);
        btnMinus=findViewById(R.id.minus);
        btnMult=findViewById(R.id.mult);
        btnDivide=findViewById(R.id.divide);
        btnReset=findViewById(R.id.reset);
        btnTotal=findViewById(R.id.total);
        tvcalc=findViewById(R.id.calc);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnReset.setOnClickListener(this);

         btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add == true) {
                    sNum = Float.parseFloat(operation);
                    tvcalc.setText(Float.toString(fNum + sNum));
                    operation = Float.toString(fNum + sNum);
                    add = false;
                }else if (sub == true) {
                    sNum = Float.parseFloat(operation);
                    tvcalc.setText(Float.toString(fNum - sNum));
                    operation = Float.toString(fNum - sNum);
                    sub = false;
                }else if (mul == true) {
                    sNum = Float.parseFloat(operation);
                    tvcalc.setText(Float.toString(fNum * sNum));
                    operation = Float.toString(fNum * sNum);
                    mul = false;
                }else if (div == true) {
                    sNum = Float.parseFloat(operation);
                    tvcalc.setText(Float.toString(fNum / sNum));
                    operation = Float.toString(fNum / sNum);
                    div = false;
                }
            }
        });
    }
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.one:
                    tvcalc.setText(tvcalc.getText().toString() + " 1 ");
                    operation += "1";
                    break;
                case R.id.two:
                    tvcalc.setText(tvcalc.getText().toString() + " 2 ");
                    operation += "2";
                    break;
                case R.id.three:
                    tvcalc.setText(tvcalc.getText().toString() + " 3 ");
                    operation += "3";
                    break;
                case R.id.four:
                    tvcalc.setText(tvcalc.getText().toString() + " 4 ");
                    operation += "4";
                    break;
                case R.id.five:
                    tvcalc.setText(tvcalc.getText().toString() + " 5 ");
                    operation += "5";
                    break;
                case R.id.six:
                    tvcalc.setText(tvcalc.getText().toString() + " 6 ");
                    operation += "6";
                    break;
                case R.id.seven:
                    tvcalc.setText(tvcalc.getText().toString() + " 7 ");
                    operation += "7";
                    break;
                case R.id.eight:
                    tvcalc.setText(tvcalc.getText().toString() + " 8 ");
                    operation += "8";
                    break;
                case R.id.nine:
                    tvcalc.setText(tvcalc.getText().toString() + " 9 ");
                    operation += "9";
                    break;
                case R.id.zero:
                    tvcalc.setText(tvcalc.getText().toString() + " 0 ");
                    operation += "0";
                    break;
                    case R.id.plus:
                        fNum= Float.parseFloat(operation);
                        tvcalc.setText(tvcalc.getText().toString() + " + ");
                        operation="0";
                        add=true;
                    break;
                case R.id.minus:
                    fNum= Float.parseFloat(operation);
                    tvcalc.setText(tvcalc.getText().toString() + " - ");
                    operation="0";
                    sub=true;
                    break;
                case R.id.mult:
                    fNum= Float.parseFloat(operation);
                    tvcalc.setText(tvcalc.getText().toString() + " x ");
                    operation="0";
                    mul=true;
                    break;
                case R.id.divide:
                    fNum= Float.parseFloat(operation);
                    tvcalc.setText(tvcalc.getText().toString() + " % ");
                    operation="0";
                    div=true;
                    break;
                case R.id.reset:
                    tvcalc.setText("0");
                    fNum = 0;
                    operation = "0";
                    break;

    }
    }
}
