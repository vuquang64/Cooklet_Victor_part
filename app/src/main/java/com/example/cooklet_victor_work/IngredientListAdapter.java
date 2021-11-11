package com.example.cooklet_victor_work;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class IngredientListAdapter extends ArrayAdapter<Ingredients> {
    private Context mContext;
    int mResource;

    public IngredientListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Ingredients> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getIngredientName();
        double amount = getItem(position).getIngredientAmount();
        String unit = getItem(position).getIngredientUnit();
        String type = getItem(position).getIngredientType();

        Ingredients ingredient = new Ingredients(name,amount,unit,type);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.ingredientName1);
        TextView tvAmount = (TextView) convertView.findViewById(R.id.ingredientAmount1);

        tvName.setText(name);
        tvAmount.setText(amount+" "+unit);

        return convertView;
    }
}
