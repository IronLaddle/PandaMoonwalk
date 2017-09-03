package com.example.taz.pandacomel;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


/**
 * created By IronLadle
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = (Button) findViewById(R.id.button);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ImageView panda = (ImageView)findViewById(R.id.imageView);
                panda.setImageResource(R.drawable.panda);
                AnimationDrawable runningCat = (AnimationDrawable)panda.getDrawable();
                runningCat.start();
            }
        });
    }
}
