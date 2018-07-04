package com.example.hossameldeen.androidfirstapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView message = (TextView) findViewById(R.id.textView3);
        Button[] buttons = new Button[9];
        final Button button1= (Button) findViewById(R.id.button1);  buttons[0]=button1;
        final Button button2= (Button) findViewById(R.id.button2);  buttons[1]=button2;
        final Button button3= (Button) findViewById(R.id.button3);  buttons[2]=button3;
        final Button button4= (Button) findViewById(R.id.button4);  buttons[3]=button4;
        final Button button5= (Button) findViewById(R.id.button5);  buttons[4]=button5;
        final Button button6= (Button) findViewById(R.id.button6);  buttons[5]=button6;
        final Button button7= (Button) findViewById(R.id.button7);  buttons[6]=button7;
        final Button button8= (Button) findViewById(R.id.button8);  buttons[7]=button8;
        final Button button9= (Button) findViewById(R.id.button9);  buttons[8]=button9;
        final Button buttonPlus = (Button) findViewById(R.id.buttonplus);  buttons[9]=buttonPlus;
        final Button buttonMinus = (Button) findViewById(R.id.buttonminus);  buttons[10]=buttonMinus;

        for(int i=0; i<buttons.length; i++){
            final Button button = buttons[i];
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    message.setText(message.getText().toString()+button.getText());
                }
            });
        }

        final Button resultButton = (Button) findViewById(R.id.buttonequal);
        resultButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String equation = message.getText().toString();
                int plusIndex = equation.indexOf('+');
                if(plusIndex == -1){
                    String[] parameters = equation.split("/-");
                    int a = Integer.parseInt(parameters[0]);
                    int b = Integer.parseInt(parameters[1]);
                    int result = a - b;
                    message.setText(result);
                }else{
                    String[] parameters = equation.split("/+");
                    int a = Integer.parseInt(parameters[0]);
                    int b = Integer.parseInt(parameters[1]);
                    int result = a + b;
                    message.setText(result);
                }

            }
        });

    }
}

