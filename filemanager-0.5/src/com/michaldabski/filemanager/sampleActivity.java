package com.michaldabski.filemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.michaldabski.filemanager.about.AboutActivity;

public class sampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }
    public void onclick(View view){
        Intent intent =new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}