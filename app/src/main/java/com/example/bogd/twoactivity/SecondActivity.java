package com.example.bogd.twoactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    public static final String EXTRA_TEXT = "com.example.text";
    //public final String EXTRA_TEXT = "com.example.text";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textView = this.findViewById(R.id.textView2);
        String text = getIntent().getStringExtra(this.EXTRA_TEXT);
        textView.setText((CharSequence) text);
    }
}
