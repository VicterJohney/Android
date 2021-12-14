package com.example.sjcet.passmessagetoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_two extends AppCompatActivity {

    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        t2 = findViewById(R.id.t2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        t2.setText(str);
    }
}
