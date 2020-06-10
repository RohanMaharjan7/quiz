package com.brandlanerglobal.surveyapp.form_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.brandlanerglobal.surveyapp.R;

public class SanitaryActivity extends AppCompatActivity {

    RelativeLayout sauchalayaChhaView;
    Boolean isSac = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanitary);

        sauchalayaChhaView = findViewById(R.id.sauchalayaChhaView);

    }

    public void agadiBadnus(View view) {
        startActivity(new Intent(getApplicationContext(), ElectricityActivity.class));
    }

    public void sauchalyaChha(View view) {
        if (isSac){
            sauchalayaChhaView.setVisibility(View.GONE);
        }else{
            sauchalayaChhaView.setVisibility(View.VISIBLE);
        }

        isSac = !isSac;
    }
}