package com.example.myapplication3;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class Model extends BaseAdapter
{
    private ArrayList<String> ColorList=new ArrayList<String>();
    private boolean IsMod2=false;
    private int Current=0;
    Context context;
    private static LayoutInflater inflater=null;

    public Model(Context context)
    {
        this.context=context;
        Converter converter=new Converter();
        for(int i=1;i<1000001;i++)
            ColorList.add(converter.NumbertoWords(i));
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public Object getItem(int position) {
        return ColorList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return ColorList.size();
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
    public String[] getArr(){return (String[]) ColorList.toArray();}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.list, null);
        TextView text = (TextView) vi.findViewById(R.id.text);
        if (position % 2 == 0) {
            vi.setBackgroundColor(0xFFCCCCCC);
        } else {
            vi.setBackgroundColor(0xFFFFFFFF);
        }
        text.setText(ColorList.get(position));
        return vi;
    }



}
