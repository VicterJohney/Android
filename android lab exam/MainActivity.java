package com.example.sjcet.to_do_list;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv_title,tv_due_date,tv_item;
EditText ed_title,ed_due_date,ed_item;
Button b_add,b_view;
SharedPreferences sharedPreferences;
private static final String SHARED_PREF_NAME = "mypref";
private static final String KEY_TITLE = "title";
private static final String KEY_DUE_DATE = "due_date";
private static final String KEY_ITEM = "item";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_title = (TextView)findViewById(R.id.tv_title);
        tv_due_date = (TextView)findViewById(R.id.tv_due_date);
        tv_item = (TextView)findViewById(R.id.tv_item);
        ed_title = (EditText) findViewById(R.id.ed_title);
        ed_due_date = (EditText) findViewById(R.id.ed_due_date);
        ed_item = (EditText) findViewById(R.id.ed_item);
        b_add = (Button)findViewById(R.id.b_add);
        b_view = (Button)findViewById(R.id.b_view);
        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
                //String title=sharedPreferences.getString(KEY_TITLE,null);
                //String due_date=sharedPreferences.getString(KEY_DUE_DATE,null);
                //String item=sharedPreferences.getString(KEY_ITEM,null);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(KEY_TITLE,ed_title.getText().toString());
                editor.putString(KEY_DUE_DATE,ed_due_date.getText().toString());
                editor.putString(KEY_ITEM,ed_item.getText().toString());
                editor.apply();
                Toast.makeText(MainActivity.this,"Added Successfully",Toast.LENGTH_SHORT).show();
            }
        });
        b_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
                String title=sharedPreferences.getString(KEY_TITLE,null);
                String due_date=sharedPreferences.getString(KEY_DUE_DATE,null);
                String item=sharedPreferences.getString(KEY_ITEM,null);
                if (title != null || due_date != null || item != null){
                    Intent intent= new Intent(MainActivity.this,ViewActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
