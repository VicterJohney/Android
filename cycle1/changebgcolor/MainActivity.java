package com.example.sjcet.changebgcolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btn;
    View v;
    boolean isColor = true;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v = this.getWindow().getDecorView();
        //btn = (Button) findViewById(R.id.btn);

        btn = findViewById(R.id.b1);
        linearLayout = findViewById(R.id.l1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearLayout.setBackgroundResource(android.R.color.holo_blue_dark);

            }

        });

    }


    public void ChangeColor(View view) {
        linearLayout.setBackgroundResource(R.color.colorPrimary);
    }

}