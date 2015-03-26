package com.example.chandana.todoapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Chandana on 24-03-2015.
 */
public class main_activity extends ActionBarActivity {
    ArrayList<String> to_do_actions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_launch);
        //getActionBar().setBackgroundDrawable(new ColorDrawable(Color.GRAY));
        getActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menu_inflater = getMenuInflater();
        menu_inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_new_task:
                LayoutInflater LI = LayoutInflater.from(main_activity.this);
                View promptsView = LI.inflate(R.layout.dialog, null);
                AlertDialog.Builder AD = new AlertDialog.Builder(main_activity.this);
                AD.setView(promptsView);
                final EditText title = (EditText)promptsView.findViewById(R.id.Title);
                final EditText description = (EditText)promptsView.findViewById(R.id.Description);
                final DatePicker datePicker = (DatePicker)promptsView.findViewById(R.id.datePicker);

                AD.setPositiveButton("SAVE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        

                    }
                })
                  .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface dialogInterface, int i) {

                      }
                  });
                AD.show();
                break;
            case R.id.complete:
                Intent intent = new Intent(main_activity.this, completed_list_activity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
