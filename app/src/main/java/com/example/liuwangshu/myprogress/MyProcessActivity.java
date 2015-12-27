package com.example.liuwangshu.myprogress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyProcessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_process);
        Intent myServiceIntent=new Intent(MyProcessActivity.this,MyService.class);
        this.startService(myServiceIntent);
    }
}
