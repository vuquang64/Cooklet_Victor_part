package com.example.cooklet_victor_work;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Type_icon_adapter extends BaseAdapter {
    private Context context;
    private final int [] icons;


    public Type_icon_adapter(Context c, int[] icons)
    {
        this.context = c;
        this.icons = icons;
    }

    @Override
    public int getCount() {
        return icons.length;
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
        ImageView imageView;
        if(convertView==null)
        {
            imageView=new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(600,600));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5,5,5,5);
        }
        else{

            imageView=(ImageView)convertView;
        }
        imageView.setImageResource(icons[position]);
        return imageView;
    }
   /* private final int [] images;
    private final String [] values;
    private final String [] numbers;
    Context context;

    public Type_icon_adapter(int[] images, String[] values, String[] numbers) {
        this.images = images;
        this.values = values;
        this.numbers = numbers;
    }



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        return null;
    }*/
}
