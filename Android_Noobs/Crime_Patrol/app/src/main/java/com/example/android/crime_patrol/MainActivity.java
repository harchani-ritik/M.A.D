package com.example.android.crime_patrol;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abhay(View v)
    {
        Intent i=new Intent(MainActivity.this,AbhayHelpline.class);
        startActivity(i);
    }
    public void sneha(View v)
    {
        Intent i=new Intent(MainActivity.this,sneha.class);
        startActivity(i);
    }
    public void makeCall(View v)
    {
        String phoneNumber="tel:911";
        Intent in=new Intent(Intent.ACTION_CALL);
        in.setData(Uri.parse(phoneNumber));
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
        else
            startActivity(in);
    }
    public void rules(View v)
    {
        Intent i=new Intent(MainActivity.this,ScrollingActivity.class);
        startActivity(i);
    }
}
