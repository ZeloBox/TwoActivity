package com.example.bogd.twoactivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 *
 * Две активтити обмениваюся данными через Intent
 *
 * Реализовать передачу URL через интент используя интентфильтр на третью активити
 * Усложненное: открыть URL в WebView
 *
 */

public class MainActivity extends Activity {
    View button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.MyButton1);
        text = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                          intent.putExtra(SecondActivity.EXTRA_TEXT , "Текст из главной активити ");
                                          startActivity(intent);
                                      }
                                  }
        );


        button = findViewById(R.id.MyButton2);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          String uri = text.getText().toString();
                                          Intent intent = new Intent(Intent.ACTION_VIEW);
                                          intent.setData(Uri.parse(uri));
                                          startActivity(intent);
                                      }
                                  }
        );
    }
}
