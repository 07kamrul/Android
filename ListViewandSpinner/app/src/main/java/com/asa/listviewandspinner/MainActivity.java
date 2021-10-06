package com.asa.listviewandspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner studentsSpinner;
    private ListView citiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
        studentsSpinner = findViewById(R.id.studentsSpinner);

        spinnerViewMethod(studentsSpinner);
        listViewMethod(citiesList);
    }

//    For Spinner

    public void spinnerViewMethod(Spinner studentsSpinner) {
        final ArrayList<String> students = new ArrayList<>();

        students.add("Zakaria");
        students.add("Shariful");
        students.add("Ariful");
        students.add("kamrul");
        students.add("Nabila");
        students.add("Tushar");

        ArrayAdapter<String> studentAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                students

        );

        studentsSpinner.setAdapter(studentAdapter);

        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, students.get(position) + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

//    For ListView

    public void listViewMethod(ListView citiesList) {
        final ArrayList<String> cities = new ArrayList<>();

        cities.add("Dhaka");
        cities.add("New York");
        cities.add("Panjab");
        cities.add("Berlin");
        cities.add("Moscow");
        cities.add("London");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );

        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cities.get(position) + " selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}