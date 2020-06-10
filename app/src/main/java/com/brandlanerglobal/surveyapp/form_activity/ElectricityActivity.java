package com.brandlanerglobal.surveyapp.form_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.brandlanerglobal.surveyapp.MainActivity;
import com.brandlanerglobal.surveyapp.R;

public class ElectricityActivity extends AppCompatActivity {

    LinearLayout BijuliChhaView;
    Boolean isEle = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);

        BijuliChhaView = findViewById(R.id.BijuliChhaView);

    }

    public void agadiBadnus(View view) {
        startActivity(new Intent(getApplicationContext(), IrrigationActivity.class));
    }

    public void bijulicha(View view) {
        if (isEle){
            BijuliChhaView.setVisibility(View.GONE);
        }else{
            BijuliChhaView.setVisibility(View.VISIBLE);
        }

        isEle = !isEle;
    }
}