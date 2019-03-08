package com.example.myapplication3;

import java.util.ArrayList;
import java.util.List;

public class Model
{
    private ArrayList<String> ColorList=new ArrayList<String>();
    private boolean IsMod2=false;
    private int Current=0;

    public Model()
    {
        Converter converter=new Converter();
        for(int i=1;i<1000001;i++)
            ColorList.add(converter.NumbertoWords(i));
    }

    public boolean Ismod2()
    {
        return IsMod2;
    }

    public void next()
    {
        IsMod2=!IsMod2;
        Current++;
    }

    public String getNumber()
    {
        return ColorList.get(Current);
    }




}
