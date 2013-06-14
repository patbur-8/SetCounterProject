package com.home.setcounter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button clear;
    private Button increase;
    private TextView value;
    private static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increase = (Button) findViewById(R.id.button1);
        clear = (Button) findViewById(R.id.button2);
        value = (TextView) findViewById(R.id.textView1);
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                value.setText(Integer.toString(counter));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                value.setText(Integer.toString(counter));
            }
        });
    }
}
