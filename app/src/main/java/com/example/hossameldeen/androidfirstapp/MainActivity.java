package com.example.hossameldeen.androidfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        final TextView message = (TextView) findViewById(R.id.lbl_display);
        Button[] buttons = new Button[11];
        final Button button1= (Button) findViewById(R.id.btn_number_one);  buttons[0]=button1;
        final Button button2= (Button) findViewById(R.id.btn_number_two);  buttons[1]=button2;
        final Button button3= (Button) findViewById(R.id.btn_number_three);  buttons[2]=button3;
        final Button button4= (Button) findViewById(R.id.btn_number_four);  buttons[3]=button4;
        final Button button5= (Button) findViewById(R.id.btn_number_five);  buttons[4]=button5;
        final Button button6= (Button) findViewById(R.id.btn_number_six);  buttons[5]=button6;
        final Button button7= (Button) findViewById(R.id.btn_number_seven);  buttons[6]=button7;
        final Button button8= (Button) findViewById(R.id.btn_number_eight);  buttons[7]=button8;
        final Button button9= (Button) findViewById(R.id.btn_number_nine);  buttons[8]=button9;
        final Button buttonPlus = (Button) findViewById(R.id.btn_operator_add);  buttons[9]=buttonPlus;
        final Button buttonMinus = (Button) findViewById(R.id.btn_operator_subtract);  buttons[10]=buttonMinus;

        for(int i=0; i<buttons.length; i++){
            final Button button = buttons[i];
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    message.setText(message.getText().toString()+button.getText());
                }
            });
        }

        final Button resultButton = (Button) findViewById(R.id.btn_evaluate);
        resultButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String equation = message.getText().toString();
                int plusIndex = equation.indexOf('+');
                if(plusIndex == -1){
                    int minusIndex = equation.indexOf('-');
                    int a = Integer.parseInt(equation.substring(0, minusIndex));
                    int b = Integer.parseInt(equation.substring(minusIndex+1));
                    int result = a - b;
                    message.setText(result+"");
                }else{
                    int a = Integer.parseInt(equation.substring(0, plusIndex));
                    int b = Integer.parseInt(equation.substring(plusIndex+1));
                    int result = a + b;
                    message.setText(result+"");
                }

            }
        });

    }
}

