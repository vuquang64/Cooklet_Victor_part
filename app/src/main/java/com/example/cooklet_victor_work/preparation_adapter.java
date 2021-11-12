package com.example.cooklet_victor_work;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;

public class preparation_adapter extends BaseAdapter {
    private Context context;
    private final String [] name;
    private final double[] value;
    private final String[] measurement;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public preparation_adapter(Context c, String[] name, double[] value, String[] measurement)
    {
        this.context = c;
        this.name = name;
        this.value = value;
        this.measurement = measurement;
    }

    @Override
    public int getCount() {
        return name.length;
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
        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.adapter_view_layout, parent, false);
            viewHolder.name_txt = (TextView) convertView.findViewById(R.id.ingredientName1);
            viewHolder.value_txt = (TextView) convertView.findViewById(R.id.ingredientAmount1);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.name_txt.setText(name[position]);
        viewHolder.value_txt.setText(df.format(value[position])+measurement[position]);
        return convertView;

    }

    private static class ViewHolder {

        TextView name_txt;
        TextView value_txt;

    }
}
