package com.example.chandana.todoapp;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;


/**
 * Created by Chandana on 25-03-2015.
 */
public class completed_list_activity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_launch);
        getActionBar();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        menu.getItem(0).setVisible(false);
        menu.getItem(1).setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }


}
