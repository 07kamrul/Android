package com.asa.uibasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHelloBtnClicked(View view) {
        TextView txtWelcome = findViewById(R.id.txtWelcome);
        txtWelcome.setText("Hello Again");

    }
}