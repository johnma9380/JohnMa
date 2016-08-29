package com.example.user.johnma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("testLog", "this is a Log");  //print在monitor log上
        Toast.makeText(this,
                "this is a toast",
                Toast.LENGTH_SHORT).show(); //print在device畫面上
    }
}
