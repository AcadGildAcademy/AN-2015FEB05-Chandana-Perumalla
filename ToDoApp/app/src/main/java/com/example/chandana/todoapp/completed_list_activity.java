package com.example.chandana.todoapp;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by Chandana on 25-03-2015.
 */
public class completed_list_activity extends ActionBarActivity {

    DataBaseHandler db;
    Helper helper;
    ListView listView;
    ArrayList<item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_launch);
        getActionBar();

        db = new DataBaseHandler(this);
        listView = (ListView) findViewById(R.id.to_do_list);
        helper = new Helper();

        items = db.getAllCompletedTasks();
        if(!items.isEmpty()) {
            helper.sortTasks(items);

            CustomAdapter adapter = new CustomAdapter(getApplicationContext(), items);
            listView.setAdapter(adapter);
        }

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                 db.deleteItem(items.get(i));
                items = db.getAllCompletedTasks();
                if(!items.isEmpty()) {
                    helper.sortTasks(items);

                    CustomAdapter adapter = new CustomAdapter(getApplicationContext(), items);
                    listView.setAdapter(adapter);
                }
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        menu.getItem(0).setVisible(false);
        menu.getItem(1).setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }


}
