package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private EditText Ed_n1;
        private EditText Ed_n2;

        private TextView tv_res;

        private Button bt_soma;
        private Button bt_menos;
        private Button bt_div;
        private Button bt_mult;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ed_n1 = findViewById(R.id.Ed_n1);
        Ed_n2 = findViewById(R.id.Ed_n2);
        tv_res = findViewById(R.id.tv_res);
        bt_soma = findViewById(R.id.bt_soma);
        bt_menos = findViewById(R.id.bt_menos);
        bt_div = findViewById(R.id.bt_div);
        bt_mult = findViewById(R.id.bt_mult);





        bt_soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                somar();
            }
        });
        bt_menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menos();
            }
        });
        bt_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                div();
            }
        });
        bt_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mult();
            }
        });


    }
    public void somar(){
         double n1= Double.parseDouble(Ed_n1.getText().toString());
         double n2= Double.parseDouble(Ed_n2.getText().toString());
         double res = n1 +n2;

        tv_res.setText(String.valueOf(res));

    }
    public void menos(){
        double n1= Double.parseDouble(Ed_n1.getText().toString());
        double n2= Double.parseDouble(Ed_n2.getText().toString());
        double res = n1  - n2;

        tv_res.setText(String.valueOf(res));

    }
    public void div(){
        double n1= Double.parseDouble(Ed_n1.getText().toString());
        double n2= Double.parseDouble(Ed_n2.getText().toString());
        double res = n1 /n2;

        tv_res.setText(String.valueOf(res));

    }
    public void mult(){
        double n1= Double.parseDouble(Ed_n1.getText().toString());
        double n2= Double.parseDouble(Ed_n2.getText().toString());
        double res = n1 * n2;

        tv_res.setText(String.valueOf(res));

    }





}