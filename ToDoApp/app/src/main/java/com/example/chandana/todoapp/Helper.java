package com.example.chandana.todoapp;

import android.widget.DatePicker;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Chandana on 29-03-2015.
 */
public class Helper {


    public String getDateString(DatePicker dp){
        int month = dp.getMonth()+1;
        return dp.getDayOfMonth()+"/"+month+"/"+dp.getYear();
    }

    public String getDateString(int year,int month,int day){

        return day+"/"+month+"/"+year;
    }

    public Date getDate(String string){
        Date date = null;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = format.parse(string);
        }
        catch(ParseException p){

        }

        return date;
    }
    public void sortTasks(ArrayList<item> items){
        Collections.sort(items, new Comparator<item>() {
            DateFormat f = new SimpleDateFormat("dd/MM/yyyy");

            @Override
            public int compare(item o1, item o2) {
                String date1 = o1.getTodo_date();
                String date2 = o2.getTodo_date();
                try {
                    return f.parse(date1).compareTo(f.parse(date2));
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        });
    }
}
