package com.smmizan.searchablespinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinner;
    TextView textView,androidText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner = (Spinner) findViewById(R.id.spinner_search);
        textView = (TextView) findViewById(R.id.textView);

       // androidText = (TextView) findViewById(R.id.android);




        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.mobile_manufacturers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = parent.getItemAtPosition(position).toString();
        switch (selectedItem) {
            case "Select one Item":
                break;
            case "One":
                Toast.makeText(getApplicationContext(), "You Are Selected By "+selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Two":
                Toast.makeText(getApplicationContext(), "You Are Selected By "+selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Three":
                Toast.makeText(getApplicationContext(), "You Are Selected By "+selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Four":
                Toast.makeText(getApplicationContext(), "You Are Selected By "+selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Five":
                Toast.makeText(getApplicationContext(), "You Are Selected By "+selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Six":
                Toast.makeText(getApplicationContext(), "You Are Selected By "+selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Seven":
                Toast.makeText(getApplicationContext(), "You Are Selected By "+selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Eight":
                Toast.makeText(getApplicationContext(), "You Are Selected By "+selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Nine":
                Toast.makeText(getApplicationContext(), "You Are Selected By "+selectedItem, Toast.LENGTH_SHORT).show();
                break;
            case "Ten":
                Toast.makeText(getApplicationContext(), "You Are Selected By "+selectedItem, Toast.LENGTH_SHORT).show();
                break;
        }




        final String mySpinner = this.spinner.getSelectedItem().toString();
        textView.setText(mySpinner);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
