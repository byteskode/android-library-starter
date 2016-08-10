package com.github.byteskode.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView titleTv;
    int conditionValue = 4;
    TextView labelTv;
    Intent startingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleTv = (TextView) findViewById(R.id.title);
        labelTv = (TextView) findViewById(R.id.label);

        startingIntent = getIntent();
    }
}
