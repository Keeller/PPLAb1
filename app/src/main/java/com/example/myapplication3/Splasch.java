package com.example.myapplication3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splasch extends AppCompatActivity {

private  AsynTask as;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splasch);


    }
    @Override
    protected void onStart()
    {
        super.onStart();
        as =new AsynTask();
        as.execute(this);
    }
    public void CallMainAndDie()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        as.cancel(true);
        super.onBackPressed();
    }
}
