package com.asa.uibasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtHello;
    private EditText editTxtName;

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnHello:
                txtHello.setText("Hello " + editTxtName.getText().toString());
                break;
            case R.id.editTextName:
                Toast.makeText(this, "Attempting to type something", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);

        editTxtName = findViewById(R.id.editTextName);
        editTxtName.setOnClickListener(this);
        
        txtHello = findViewById(R.id.txtHello);
    }
}