package com.example.sjcet.printcontentintextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv1;
EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeLabelContent(View view) {
    tv1=(TextView)findViewById(R.id.tv1);
    et1=(EditText)findViewById(R.id.et1);
    tv1.setText(et1.getText());
    }
}
