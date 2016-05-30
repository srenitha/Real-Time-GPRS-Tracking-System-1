package com.mycompany.livetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Values extends AppCompatActivity {
String la,ln;
    TextView lat,lng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values);
        lat = (TextView) findViewById(R.id.textView4);
        lng = (TextView) findViewById(R.id.textView5);
        Bundle bundle= getIntent().getExtras();
        la=bundle.getString("message");
        ln=bundle.getString("message1");
        lat.setText(la);
        lng.setText(ln);
    }
}
