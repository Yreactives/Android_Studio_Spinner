package com.ronny202102241.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner _spinner1, _spinner2, _spinner3, _spinner4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _spinner1 = (Spinner) findViewById(R.id.spinner1);
        _spinner2 = (Spinner) findViewById(R.id.spinner2);
        _spinner3 = (Spinner) findViewById(R.id.spinner3);
        _spinner4 = (Spinner) findViewById(R.id.spinner4);

        initSpinner1();
        initSpinner2();
        initSpinner3();
        initSpinner4();
    }

    private void initSpinner1(){
        List<String> buahlist = new ArrayList<>();
        buahlist.add("Rambutan");
        buahlist.add("Langsat");
        buahlist.add("Durian");
        buahlist.add("Nangka");
        buahlist.add("Mangga");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, buahlist);
        _spinner1.setAdapter(arrayAdapter);
    }

    private void initSpinner2(){
        List<String> mahasiswalist = new ArrayList<>();
        for (int i = 1; i<=100; i++){
            mahasiswalist.add("Mahasiswa ke-" + i);
        }
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mahasiswalist);
        _spinner2.setAdapter(arrayAdapter2);
    }

    private void initSpinner3(){
        List<String> ganjillist = new ArrayList<>();
        for (int i = 1; i<= 999; i+=2){
            ganjillist.add("Bilangan ke-" + i);
        }
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ganjillist);
        _spinner3.setAdapter(arrayAdapter3);
    }
    private void initSpinner4(){
        List<String> genaplist = new ArrayList<>();
        for (int i = 2; i<= 1000; i+=2){
            genaplist.add("Bilangan ke-" + i);
        }
        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, genaplist);
        _spinner4.setAdapter(arrayAdapter4);
    }
}