package com.example.bogd.twoactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 *
 * Две активтити обмениваюся данными через Intent
 */

public class MainActivity extends Activity {
    View button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.MyButton1);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                          intent.putExtra(SecondActivity.EXTRA_TEXT , "Текст из главной активити ");
                                          startActivity(intent);
                                      }
                                  }
        );


        button = findViewById(R.id.MyButton1);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                          intent.putExtra(SecondActivity.EXTRA_TEXT , "Текст из главной активити ");
                                          startActivity(intent);
                                      }
                                  }
        );
    }
}
