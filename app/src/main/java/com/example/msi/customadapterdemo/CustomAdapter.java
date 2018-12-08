package com.example.msi.customadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {


    int [] flags;
    String [] cnames;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter (Context cont,String[] cname,int[] flag)
    {
        context = cont;
        cnames = cname;
        flags = flag;
    }

    @Override
    public int getCount() {
        return cnames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
        {
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_view,parent,false);
        }


        ImageView iv = convertView.findViewById(R.id.ivID);
        TextView tv =convertView.findViewById(R.id.countrynameID);

        iv.setImageResource(flags[position]);
        tv.setText(cnames[position]);

        return convertView;
    }
}
