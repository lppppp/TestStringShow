package com.example.devalicklee.teststringshow;

/**
 * produced by alice lee
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import org.jdom2.Document;
import org.json.JSONArray;

public class MainActivity extends AppCompatActivity {
    TextView show;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        show = (TextView) findViewById(R.id.show);
        et = (EditText) findViewById(R.id.et);
        String tip = "hehehehheheheeh";         //et.getText().toString();
        show.setText(tip);

        Document doc = new Document();

        JSONArray ja = new JSONArray();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
