package com.example.capstone;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Seedlings extends AppCompatActivity {

    private String[] type = new String[] {"Black Wattle", "Whispering Pine", "Lusina", "Muringa", "Eucalyptus", "Mvule", "Gum Arabicum","Black Wattle", "Whispering Pine", "Lusina", "Muringa", "Eucalyptus", "Mvule", "Gum Arabicum"};
    private String[] maurationPeriod = new String[] {"6-10 years", "4-6 years", "2 years", "10 yeara", "10 years", "10 years", "3 years","6-10 years", "4-6 years", "2 years", "10 yeara", "10 years", "10 years", "3 years"};
    private String[] climate = new String[] {"Cool climate(1400mm)", "Semi Arid climate(750mm)", "Semi Arid(1000mm)", "Cool climate(200mm)", "Dry climate(500mm)", "Cool climate(700mm)", "Cool climate(1000mm)","Cool climate(1400mm)", "Semi Arid climate(750mm)", "Semi Arid(1000mm)", "Cool climate(200mm)", "Dry climate(500mm)", "Cool climate(700mm)", "Cool climate(1000mm)"};

//    seedlingsArrayAdapter adapter = new seedlingsArrayAdapter(this, android.R.layout.simple_list_item_1, type, maurationPeriod,climate);
    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seedlings);

        mListView = (ListView) findViewById(R.id.listView);


        seedlingsArrayAdapter adapter = new seedlingsArrayAdapter(this, android.R.layout.simple_list_item_1, type, maurationPeriod,climate);
        mListView.setAdapter(adapter);

//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String restaurant = ((TextView)view).getText().toString();
//                Toast.makeText(RestaurantsActivity.this, restaurant, Toast.LENGTH_LONG).show();
//            }
//        });
}
}
