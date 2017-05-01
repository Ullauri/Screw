package com.example.gee.screw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class SearchActivity extends AppCompatActivity {
    ImageButton btnContact;
    ImageButton btnProfile;
    ImageButton btnmyProfile;
    ImageButton btnSearch;
    ImageButton btnHome;
    ImageButton btnMap;
    // Category | Project | Content | Date | Tags(PK - FK)
    private String[][] demoData = {{""}};
    private RelativeLayout searchLayout;
    private ScrollView tagScrollView, categoryScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        searchLayout = (RelativeLayout) findViewById(R.id.searchLayout);
        tagScrollView = (ScrollView) findViewById(R.id.tagResultsScrollView);
        categoryScrollView = (ScrollView) findViewById(R.id.categoryResultsScrollView);

        RadioGroup searchModeGroup = (RadioGroup) findViewById(R.id.searchModeRadioGroup);
        searchModeGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (checkedId == R.id.tagRadioButton) {
                    categoryScrollView.setVisibility(View.GONE);
                    searchLayout.setVisibility(View.VISIBLE);
                    tagScrollView.setVisibility(View.VISIBLE);
                } else if (checkedId == R.id.categoryRadioButton) {
                    searchLayout.setVisibility(View.GONE);
                    tagScrollView.setVisibility(View.GONE);
                    categoryScrollView.setVisibility(View.VISIBLE);
                }
            }
        });

        btnContact = (ImageButton) findViewById(R.id.contactsButton);
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this,MyProfileActivity.class);
                startActivity(intent);
            }
        });


        btnmyProfile = (ImageButton) findViewById(R.id.profileButton);
        btnmyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this,MyProfileActivity.class);
                startActivity(intent);
            }
        });

        btnSearch = (ImageButton) findViewById(R.id.searchButton);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });


        btnHome = (ImageButton) findViewById(R.id.homeButton);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        btnMap = (ImageButton) findViewById(R.id.mapButton);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });
    }

    private String[][] fetchByCategory(String category) {
        int rowCount = 10;
        String[][] postInfo = new String[rowCount][3];



        return postInfo;
    }

    public void categoryClick(View view) {
        int viewID = view.getId();
        String[][] postInfo;

        switch (viewID) {
            case R.id.mobileAppTextView:
                postInfo = fetchByCategory("mobile");
                break;
            case R.id.webAppTextView:
                postInfo = fetchByCategory("web");
                break;
            case R.id.dataScienceTextView:
                postInfo = fetchByCategory("data");
                break;
            case R.id.backendTextView:
                postInfo = fetchByCategory("backend");
                break;
            case R.id.graphicDesignTextView:
                postInfo = fetchByCategory("graphic");
                break;
            case R.id.hardwareTextView:
                postInfo = fetchByCategory("hardware");
                break;
            case R.id.testingTextView:
                postInfo = fetchByCategory("testing");
                break;
            case R.id.miscTextView:
                postInfo = fetchByCategory("misc");
                break;
        }
    }
}
