package com.example.myapplication3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.*;

public class MainActivity extends AppCompatActivity  {

    private Model model=new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }



    public void change()
    {
        TextView t=(TextView) findViewById(R.id.textView);
        LinearLayout ll=(LinearLayout) findViewById(R.id.Layout);
        t.setText(model.getNumber());
        if(model.Ismod2())
            t.setBackgroundColor(Color.parseColor("#CCCCCC"));
        else
            t.setBackgroundColor(Color.parseColor("#FFFFFF"));


    }

    public void onBClick(android.view.View Viewer)
    {
        change();
        model.next();

    }



    @Override
    public void onBackPressed() {
        this.finish();
    }


}
