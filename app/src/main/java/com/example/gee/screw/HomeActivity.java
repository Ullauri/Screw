package com.example.gee.screw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableRow;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    Button btncreate;
    ImageButton btnContact;
    ImageButton btnProfile;
    ImageButton btnmyProfile;
    ImageButton btnSearch;
    ImageButton btnHome;
    ImageButton btnMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btncreate = (Button) findViewById(R.id.create_btn);
        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,CreatePostActivity.class);
                startActivity(intent);
            }
        });
        btnContact = (ImageButton) findViewById(R.id.contact_btn);

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,ContactsActivity.class);
                startActivity(intent);
            }
        });



        btnmyProfile = (ImageButton) findViewById(R.id.user_btn);
        btnmyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MyProfileActivity.class);
                startActivity(intent);
            }
        });

        btnSearch = (ImageButton) findViewById(R.id.search_btn);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });


        btnHome = (ImageButton) findViewById(R.id.home_btn);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        btnMap = (ImageButton) findViewById(R.id.map_bth);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

    }

    public void onPostRowClick(View v) {
        TableRow row = (TableRow) v;
        String project = ((TextView) row.getChildAt(0)).getText().toString();;
        String date = ((TextView) row.getChildAt(1)).getText().toString();;

        startActivity(new Intent(this, PostActivity.class));
    }

}
