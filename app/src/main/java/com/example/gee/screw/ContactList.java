package com.example.gee.screw;

/**
 * Created by Gee on 4/29/17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class ContactList extends MainActivity {

    ImageButton btnContact;
    ImageButton btnProfile;
    ImageButton btnmyProfile;
    ImageButton btnSearch;
    ImageButton btnHome;
    ImageButton btnMap;
    // Array of strings...
    String[] mobileArray = {"Gee Huang","Byron Ullauri","Niaz Morshed","Sin Chiu ",
            "Asifur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

        btnContact = (ImageButton) findViewById(R.id.contact_btn);

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,ContactList.class);
                startActivity(intent);
            }
        });



        btnmyProfile = (ImageButton) findViewById(R.id.user_btn);
        btnmyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Myprofile.class);
                startActivity(intent);
            }
        });

        btnSearch = (ImageButton) findViewById(R.id.search_btn);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Search.class);
                startActivity(intent);
            }
        });


        btnHome = (ImageButton) findViewById(R.id.home_btn);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,Home.class);
                startActivity(intent);
            }
        });

        btnMap = (ImageButton) findViewById(R.id.map_bth);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactList.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}

