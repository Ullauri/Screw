package com.example.gee.screw;

/**
 * Created by Gee on 4/30/17.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            // after 3 sec
            Thread.sleep(3000);
//            Go to Login
            startActivity(new Intent(SplashActivity.this, Login.class));
            finish();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
