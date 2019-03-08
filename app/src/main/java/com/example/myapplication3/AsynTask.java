package com.example.myapplication3;

import android.os.AsyncTask;

public class AsynTask extends AsyncTask<Splasch, Void, Void>
{

    @Override
    protected Void doInBackground(Splasch... splasches) {

        try {


            Thread.sleep(2000);
            Splasch s=splasches[0];
            s.CallMainAndDie();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
