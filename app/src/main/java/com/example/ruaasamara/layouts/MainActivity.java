package com.example.ruaasamara.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.graphics.Color;


public class MainActivity extends AppCompatActivity {
    RelativeLayout relativelayout;
    Button btn1,btn2,btn3;
    int id1, id2, id3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        relativelayout = new RelativeLayout(this);
        btn1 = new Button(this);
        btn2 = new Button(this);
        btn3 = new Button(this);
        id1 = 1;
        id2 = 2;
        id3 = 3;


        LayoutParams layoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        LayoutParams LayoutParamsButtons1 = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        LayoutParams LayoutParamsButtons2 = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        LayoutParams LayoutParamsButtons3 = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

        layoutparams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        relativelayout.setLayoutParams(layoutparams);
        relativelayout.setBackgroundColor(Color.GRAY);

        LayoutParamsButtons1.addRule(RelativeLayout.CENTER_IN_PARENT);
        btn1.setLayoutParams(LayoutParamsButtons1);
        LayoutParamsButtons2.addRule(RelativeLayout.BELOW,id1);
        btn2.setLayoutParams(LayoutParamsButtons2);
        LayoutParamsButtons3.addRule(RelativeLayout.ABOVE);
        btn3.setLayoutParams(LayoutParamsButtons3);

        btn1.setText("Hello");
        btn1.setId(id1 = 1);
        btn1.setBackgroundColor(Color.LTGRAY);
        btn2.setText("Mr Vesitor,");
        btn2.setId(id2 = 2);
        btn2.setBackgroundColor(Color.LTGRAY);
        btn3.setText("Greeting Word");
        btn3.setId(id3 = 3);
        btn3.setBackgroundColor(Color.LTGRAY);

        relativelayout.addView(btn1);
        relativelayout.addView(btn2);
        relativelayout.addView(btn3);
        setContentView(relativelayout);
    }
}
