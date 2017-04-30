package com.example.gee.screw;

import android.content.Intent;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Create extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button btnsubmit;
    private static final String[] CATEGORIES = {"Mobile App", "Web App", "Data Science", "Backend", "Graphic Design", "Hardware", "Testing", "Misc"};
    private String chosenCategory = "Mobile App";
    private LinearLayout tagsLayout;
    private EditText tagsEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        btnsubmit = (Button) findViewById(R.id.submitButton);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Create.this,Home.class);
                startActivity(intent);
            }
        });

        Spinner categorySpinner = (Spinner) findViewById(R.id.categorySpinner);

        ArrayAdapter<String> categoryAdaptor = new ArrayAdapter<>(Create.this,
                android.R.layout.simple_spinner_item, CATEGORIES);
        categoryAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        categorySpinner.setAdapter(categoryAdaptor);
        categorySpinner.setOnItemSelectedListener(this);

        tagsLayout = (LinearLayout) findViewById(R.id.tagsLinearLayout);
        tagsEditText = (EditText) findViewById(R.id.tagsEditText);
        tagsEditText.setFocusableInTouchMode(true);
        tagsEditText.requestFocus();
        tagsEditText.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    TextView newTag = createTag(tagsEditText.getText().toString());
                    newTag.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            tagsLayout.removeView(v);
                        }
                    });
                    tagsLayout.addView(newTag);
                    tagsEditText.setText("");
                }
                return false;
            }
        });
    }

    private TextView createTag(String text) {
        TextView newTagView = new TextView(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(20, 0, 0, 0);
        params.weight = 1.0f;
        newTagView.setLayoutParams(params);
        newTagView.setText("x " + text);
        int textColor = ResourcesCompat.getColor(getResources(), R.color.colorPrimary, null);
        newTagView.setTextColor(textColor);
        return newTagView;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        chosenCategory = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void onCreatePost(View v) {
        // add to database
    }


    }

