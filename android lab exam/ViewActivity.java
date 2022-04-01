package com.example.sjcet.to_do_list;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class ViewActivity extends AppCompatActivity {
TextView v_title,v_due_date,v_item;
    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_TITLE = "title";
    private static final String KEY_DUE_DATE = "due_date";
    private static final String KEY_ITEM = "item";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        v_title = (TextView)findViewById(R.id.v_title);
        v_due_date = (TextView)findViewById(R.id.v_due_date);
        v_item = (TextView)findViewById(R.id.v_item);
        v_title.setText(sharedPreferences.getString(KEY_TITLE,null));
        v_title.setText(sharedPreferences.getString(KEY_DUE_DATE,null));
        v_title.setText(sharedPreferences.getString(KEY_ITEM,null));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
        if (onMenuItemSelected(signout,item)){
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.commit();
            Toast.makeText(this, "Signout Successfully", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
            finish();
        }

    }
}
