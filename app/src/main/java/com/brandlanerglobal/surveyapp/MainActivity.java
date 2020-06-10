package com.brandlanerglobal.surveyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.brandlanerglobal.surveyapp.form_activity.WaterActivityFirst;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agadiBadnus(View view) {
        startActivity(new Intent(getApplicationContext(), WaterActivityFirst.class));
    }
}