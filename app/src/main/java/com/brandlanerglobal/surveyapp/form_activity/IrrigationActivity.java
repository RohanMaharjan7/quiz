package com.brandlanerglobal.surveyapp.form_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.brandlanerglobal.surveyapp.MainActivity;
import com.brandlanerglobal.surveyapp.R;

public class IrrigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irrigation);
    }

    public void savegarnus(View view) {

        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }
}