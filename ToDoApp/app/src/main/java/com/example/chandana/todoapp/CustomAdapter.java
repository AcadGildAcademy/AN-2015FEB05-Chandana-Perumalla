package com.example.chandana.todoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Chandana on 25-03-2015.
 */
public class CustomAdapter extends ArrayAdapter<item> {
    private final Context context;
    private final ArrayList<item> itemsArrayList;

    public CustomAdapter(Context context, ArrayList<item> itemsArrayList) {

        super(context, R.layout.row, itemsArrayList);

        this.context = context;
        this.itemsArrayList = itemsArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater LI = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View RowView = LI.inflate(R.layout.row, parent, false);
        TextView TitleView = (TextView) RowView.findViewById(R.id.Title);
        TextView DesView = (TextView) RowView.findViewById(R.id.Description);
        TextView dateView = (TextView) RowView.findViewById(R.id.Due_date);
        TextView dateSepView = (TextView) RowView.findViewById(R.id.date_seperator);
        ImageView imageView = (ImageView) RowView.findViewById(R.id.status_image);
        TitleView.setText(itemsArrayList.get(position).getTodo_title());
        DesView.setText(itemsArrayList.get(position).getTodo_description());
        dateSepView.setText(itemsArrayList.get(position).getTodo_date());
        dateView.setText(itemsArrayList.get(position).getTodo_date());
        if(itemsArrayList.get(position).getTodo_action_status())
        imageView.setImageResource(R.drawable.complete);
        else
        imageView.setImageResource(R.drawable.incomplete);
        return RowView;
    }
}
