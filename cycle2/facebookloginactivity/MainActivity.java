package com.example.sjcet.facebookloginactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void facebooklogin(View view) {
        Intent facebooklogin = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/"));
        startActivity(facebooklogin);
    }
}
