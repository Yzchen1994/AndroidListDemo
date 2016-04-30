package com.example.macbook.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myFriends = (ListView) findViewById(R.id.listView);

        ArrayList<String> friends = new ArrayList<String>();
        friends.add("steven");
        friends.add("boob");
        friends.add("wang");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friends);

        myFriends.setAdapter(arrayAdapter);

        myFriends.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(getApplicationContext(),
                                parent.getItemAtPosition(position).toString(),
                                Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
