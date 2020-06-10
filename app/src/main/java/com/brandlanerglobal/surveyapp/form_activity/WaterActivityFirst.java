package com.brandlanerglobal.surveyapp.form_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.brandlanerglobal.surveyapp.R;

public class WaterActivityFirst extends AppCompatActivity {

    LinearLayout PaniChhaView;
    Boolean isPani = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_first);

        PaniChhaView = findViewById(R.id.PaniChhaView);

    }

    public void agadiBadnus(View view) {
        startActivity(new Intent(getApplicationContext(), SanitaryActivity.class));
    }

    public void panicha(View view) {
        if (isPani){
            PaniChhaView.setVisibility(View.GONE);
        }else{
            PaniChhaView.setVisibility(View.VISIBLE);
        }

        isPani = !isPani;
    }
}