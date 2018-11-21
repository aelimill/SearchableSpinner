package com.toptoche.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchableSpinner searchableSpinner = (SearchableSpinner) findViewById(R.id.spinner);
        String[] stringArray = getResources().getStringArray(R.array.planets);
        searchableSpinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,stringArray));
        searchableSpinner.setSelectedItemPosition(3);


    }
}
