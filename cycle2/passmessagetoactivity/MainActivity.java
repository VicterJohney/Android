package com.example.sjcet.passmessagetoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 =  findViewById(R.id.e1);
    }

    public void PassMessage(View view) {
        String str = e1.getText().toString();
        Intent passmessage = new Intent(getApplicationContext(),Activity_two.class);
        passmessage.putExtra("message_key", str);
        startActivity(passmessage);
    }
}
