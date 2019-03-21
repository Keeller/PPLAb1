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

    private final int Count=999999;
    Context context;
    private static LayoutInflater inflater=null;
    private static Converter converter;

    public Model(Context context)
    {
        this.context=context;
        converter=new Converter();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public Object getItem(int position) {
        return converter.NumbertoWords((position+1));
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return this.Count;
    }




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

            text.setText(converter.NumbertoWords(position+1));

        return vi;
    }



}
