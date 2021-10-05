package com.asa.uibasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxHarry, checkBoxMatrix, checkBoxJoker;
    private RadioGroup rgMaritalStatus;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxHarry = findViewById(R.id.checkboxHarry);
        checkBoxMatrix = findViewById(R.id.checkboxMatrix);
        checkBoxJoker = findViewById(R.id.checkboxJoker);

        String harry = "Harry";
        String matrix = "Matrix";
        String joker = "Joker";

        checkBoxMethod(checkBoxHarry, harry);
        checkBoxMethod(checkBoxMatrix, matrix);
        checkBoxMethod(checkBoxJoker, joker);

        rgMaritalStatus = findViewById(R.id.rgMaritalStatus);
        int checkedbutton = rgMaritalStatus.getCheckedRadioButtonId();

        progressBar = findViewById(R.id.progressBar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });

        thread.start();
        radioButton(checkedbutton, progressBar);


    }

    //  For check box

    public void checkBoxMethod(CheckBox checkBox, String name) {
        if (checkBox.isChecked()) {
            Toast.makeText(MainActivity.this, "You have watched " + name + ", Yay.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "You need to watch " + name + ".", Toast.LENGTH_SHORT).show();
        }

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "You have watched " + name + ", Yay.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You need to watch " + name + ".", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

//    For Radio Button

    public void radioButton(int checkedbutton, ProgressBar progressBar) {
        switch (checkedbutton) {
            case R.id.rbMarried:
                Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSingle:
                Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbInRel:
                Toast.makeText(MainActivity.this, "In a Relationship", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        rgMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbSingle:
                        Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbInRel:
                        Toast.makeText(MainActivity.this, "In a Relationship", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}