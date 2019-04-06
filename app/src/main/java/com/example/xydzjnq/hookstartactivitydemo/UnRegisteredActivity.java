package com.example.xydzjnq.hookstartactivitydemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class UnRegisteredActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("UnRegisteredActivity");
        setContentView(textView);
    }
}
