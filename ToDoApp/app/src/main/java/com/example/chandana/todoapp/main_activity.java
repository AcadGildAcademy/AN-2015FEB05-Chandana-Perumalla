package com.example.chandana.todoapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by Chandana on 24-03-2015.
 */
public class main_activity extends ActionBarActivity {
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

        items = db.getAllTasks();
        if(!items.isEmpty()) {
            helper.sortTasks(items);

            CustomAdapter adapter = new CustomAdapter(getApplicationContext(), items);
            listView.setAdapter(adapter);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               final item To_do_item = db.getTo_do_item(items.get(i).getId());
               boolean task_status = To_do_item.getTodo_action_status();
               if(task_status){
                   To_do_item.setTodo_action_status(0);
               }
               else{
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
                               title.addTextChangedListener(new TextWatcher() {
                                   @Override
                                   public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                                   }

                                   @Override
                                   public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                                   }

                                   @Override
                                   public void afterTextChanged(Editable editable) {
                                       To_do_item.setTodo_title(title.getText().toString());
                                   }
                               });

                               description.addTextChangedListener(new TextWatcher() {
                                   @Override
                                   public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                                   }

                                   @Override
                                   public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

                                   }

                                   @Override
                                   public void afterTextChanged(Editable editable) {
                                       To_do_item.setTodo_description(description.getText().toString());
                                   }
                               });

                               datePicker.init(datePicker.getYear(),datePicker.getMonth(),datePicker.getDayOfMonth(), new OnDateChangedListener(){
                                   public void onDateChanged (DatePicker view,int year, int month,int day){
                                        To_do_item.setTodo_date(helper.getDateString(year,month,day));
                                   }
                               });

                           }

                       });

                       AD.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialogInterface, int i) {

                           }
                       });
                       title.setText(To_do_item.getTodo_title());
                       description.setText(To_do_item.getTodo_description());
                       Date date = helper.getDate(To_do_item.getTodo_date());
                       datePicker.updateDate(date.getYear(),date.getMonth(),date.getDay());
                       final AlertDialog dialog = AD.create();
                       dialog.show();

               }
                db.updateTo_do_action(To_do_item);
                ArrayList<item> items = db.getAllTasks();
                helper.sortTasks(items);
                CustomAdapter adapter = new CustomAdapter(getApplicationContext(), items);
                listView.setAdapter(adapter);
            }
        });

         listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
             @Override
             public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                 final item To_do_item = db.getTo_do_item(items.get(i).getId());
                 To_do_item.setTodo_action_status(1);
                 db.updateTo_do_action(To_do_item);
                 ArrayList<item> items = db.getAllTasks();
                 helper.sortTasks(items);
                 CustomAdapter adapter = new CustomAdapter(getApplicationContext(), items);
                 listView.setAdapter(adapter);
                 return true;
             }
         });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menu_inflater = getMenuInflater();
        menu_inflater.inflate(R.menu.menu,menu);
        menu.getItem(0).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.getItem(1).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

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
                });

                AD.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface dialogInterface, int i) {

                      }
                  });
                 final AlertDialog dialog = AD.create();
                 dialog.show();
                dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        boolean dismiss = true;
                        String des = description.getText().toString();
                        String t   = title.getText().toString();
                        if(des.equals("") || t.equals("") || des.equalsIgnoreCase("Description")|| t.equalsIgnoreCase("Title")){
                            Toast.makeText(getApplicationContext(),"Please Enter valid Data in the Title and Description Fields",Toast.LENGTH_LONG).show();
                            dismiss = false;
                        }
                        else {
                            db.addTodoAction (new item(t, des, helper.getDateString(datePicker), false));
                            ArrayList<item> items = db.getAllTasks();
                            helper.sortTasks(items);
                            CustomAdapter adapter = new CustomAdapter(getApplicationContext(), items);
                            listView = (ListView) findViewById(R.id.to_do_list);
                            listView.setAdapter(adapter);
                        }
                        if(dismiss){
                            dialog.dismiss();
                        }
                    }
                });
                break;
            case R.id.complete:
                Intent intent = new Intent(main_activity.this, completed_list_activity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }



}
