package com.example.chandana.hideandseek;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Chandana on 15-03-2015.
 */
public class HideSeek extends Activity{
    Button hide_seek;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rs);
        hide_seek = (Button)findViewById(R.id.hide_seek);
        image = (ImageView)findViewById(R.id.imageView);
        hide_seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String button_val = hide_seek.getText().toString();

                if(button_val.equalsIgnoreCase("Hide")){
                    hide_seek.setText("Seek");
                    image.setVisibility(View.INVISIBLE);
                }
                else if(button_val.equalsIgnoreCase("Seek")){
                    hide_seek.setText("Hide");
                    image.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
