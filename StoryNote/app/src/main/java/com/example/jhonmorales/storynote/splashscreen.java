package com.example.jhonmorales.storynote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

       /* new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent intent= new Intent(splashscreen.this, MainActivity.class);
                startActivity(intent);
            }
        },4500);
    */
    }
}
