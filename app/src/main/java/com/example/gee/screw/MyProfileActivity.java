package com.example.gee.screw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MyProfileActivity extends AppCompatActivity {
    ImageButton btnContact;
    ImageButton btnProfile;
    ImageButton btnmyProfile;
    ImageButton btnSearch;
    ImageButton btnHome;
    ImageButton btnMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);
        btnContact = (ImageButton) findViewById(R.id.contact_btn);

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfileActivity.this,ContactsActivity.class);
                startActivity(intent);
            }
        });


        btnmyProfile = (ImageButton) findViewById(R.id.user_btn);
        btnmyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfileActivity.this,MyProfileActivity.class);
                startActivity(intent);
            }
        });

        btnSearch = (ImageButton) findViewById(R.id.search_btn);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfileActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });


        btnHome = (ImageButton) findViewById(R.id.home_btn);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfileActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        btnMap = (ImageButton) findViewById(R.id.map_bth);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyProfileActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
