package com.asa.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegistrationBtnClick (View view){
        TextView firstTextView = findViewById(R.id.textViewFirstName);
        TextView lastTextView = findViewById(R.id.textViewLastName);
        TextView emailTextView = findViewById(R.id.textViewEmail);
        TextView FullNameTextView = findViewById(R.id.textViewFullName);

        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        EditText editTextLastName = findViewById(R.id.editTextLastName);
        EditText editTextEmail = findViewById(R.id.editTextEmail);




        firstTextView.setText("First Name: "+editTextFirstName.getText().toString());
        lastTextView.setText("Last Name: "+editTextLastName.getText().toString());
        emailTextView.setText("Email: "+editTextEmail.getText().toString());
        FullNameTextView.setText("Full Name: "+editTextFirstName.getText().toString()+ " "+ editTextLastName.getText().toString());

    }
}