package com.waltonbd.testspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1, spinner2;
    private Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);

        btnSubmit = findViewById(R.id.btnSubmit);

        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"click"+"Spinner"+String.valueOf(spinner1.getSelectedItem()), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private class CustomOnItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(parent.getContext(), "ONItemSelectedlistner "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();

            Log.e("tag ","text "+parent.getItemAtPosition(position).toString());
            Log.e("tag ","position "+position);


            switch (position) {


                case 1:
                    spinner2 = findViewById(R.id.spinner2);
                    spinner2.setVisibility(View.VISIBLE);
                    List<String> ulist = new ArrayList<String>();

                    ulist.add("USA 1");
                    ulist.add("USA 2");
                    ulist.add("USA 3");
                    ArrayAdapter<String> udataAdapter;
                    udataAdapter = new ArrayAdapter<String>(getApplicationContext(),  android.R.layout.simple_spinner_item, ulist);
                    udataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    udataAdapter.notifyDataSetChanged();
                    spinner2.setAdapter(udataAdapter);
                    break;

                case 2:
                    spinner2 = findViewById(R.id.spinner2);
                    spinner2.setVisibility(View.VISIBLE);
                    List<String> blist = new ArrayList<String>();

                    blist.add("Bangladesh 1");
                    blist.add("Bangladesh 2");
                    blist.add("Bangladesh 3");
                    ArrayAdapter<String> bdataAdapter;
                    bdataAdapter = new ArrayAdapter<String>(getApplicationContext(),  android.R.layout.simple_spinner_item, blist);
                    bdataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                    bdataAdapter.notifyDataSetChanged();
                    spinner2.setAdapter(bdataAdapter);
                    break;

                case 3:
                    spinner2 = findViewById(R.id.spinner2);
                    spinner2.setVisibility(View.VISIBLE);

                    List<String> list = new ArrayList<String>();
                    list.add("Germany 1");
                    list.add("Germany 2");
                    list.add("Germany 3");
                    ArrayAdapter<String> dataAdapter;
                    dataAdapter = new ArrayAdapter<String>(getApplicationContext(),  android.R.layout.simple_spinner_item, list);
                    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    dataAdapter.notifyDataSetChanged();
                    spinner2.setAdapter(dataAdapter);
                    break;

                case 4:
                    spinner2 = findViewById(R.id.spinner2);
                    spinner2.setVisibility(View.VISIBLE);

                    List<String> mlist = new ArrayList<String>();
                    mlist.add("Malaysia 1");
                    mlist.add("Malaysia 2");
                    mlist.add("Malaysia 3");
                    ArrayAdapter<String> mdataAdapter;
                    mdataAdapter = new ArrayAdapter<String>(getApplicationContext(),  android.R.layout.simple_spinner_item, mlist);
                    mdataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    mdataAdapter.notifyDataSetChanged();
                    spinner2.setAdapter(mdataAdapter);
                    break;

                default:
                    spinner2.setVisibility(View.GONE);
                    break;

            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
