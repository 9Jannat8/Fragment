 package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;//ai jinishta sob jaygay ak e rokom hote hobe
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

 public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name = {"Bangladesh", "India", "Japan", "Nepal", "Bhutan", "Afghanistan", "Sri Lanka", "Pakistan", "Armenia", "America"};

        listView = findViewById(R.id.lstviewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

     @Override
     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Fragment fragment;


        if (position == 0) {

            fragment = new BangladeshFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();

//            fragment = new BangladeshFragment();
//            FragmentManager fragmentManager = getFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            fragmentTransaction.replace(R.id.fragmentId, fragment);
//            fragmentTransaction.commit();

        }
        else if (position == 1) {

            fragment = new IndiaFragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentId, fragment);
            fragmentTransaction.commit();

        }
        else if (position == 2) {

            fragment = new JapanFragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentId, fragment);
            fragmentTransaction.commit();
        }//ctrl+shift+/ caple multiple line comment hoye jay
         //double shift click cepe constructor toiri kora jay..avabe getter and setter o toiri kora jay
         //ak e namer akta variable er nam sob jaygay change korar jonno shift+f6 cepe dhore ja likha hobe ta e sob jaygay set hoye jabe
     }
 }