package com.example.gee.screw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;

public class PostActivity extends AppCompatActivity {

    ImageButton btnContact;
    ImageButton btnProfile;
    ImageButton btnmyProfile;
    ImageButton btnSearch;
    ImageButton btnHome;
    ImageButton btnMap;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        //Intialization Button

        btnContact = (ImageButton) findViewById(R.id.contact_btn);

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this,ContactsActivity.class);
                startActivity(intent);
            }
        });

        btnProfile = (ImageButton) findViewById(R.id.postview_user_img_btn);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

        btnmyProfile = (ImageButton) findViewById(R.id.user_btn);
        btnmyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this,MyProfileActivity.class);
                startActivity(intent);
            }
        });

        btnSearch = (ImageButton) findViewById(R.id.search_btn);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });

        btnLogin = (Button) findViewById(R.id.chat_btn);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        btnHome = (ImageButton) findViewById(R.id.home_btn);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        btnMap = (ImageButton) findViewById(R.id.map_bth);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
}
}
