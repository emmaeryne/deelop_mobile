package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView msg;
private TextView msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=(TextView) findViewById(R.id.txt1);
        msg2=(TextView) findViewById(R.id.txt2);
        msg2.setText(" bonjour tout le monde ");
        msg2.setText(msg.getText());



    }
}