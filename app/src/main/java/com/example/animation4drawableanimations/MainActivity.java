package com.example.animation4drawableanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AnimationDrawable animacion_robot;
    ImageView imgRobot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageView a la que se añadirá la animación
        imgRobot= (ImageView) findViewById(R.id.robot);
        imgRobot.setOnClickListener(this);
        imgRobot.setBackgroundResource(R.drawable.robot0);
        //Listener para touch,.ñlñ
    }



    @Override
    public void onClick(View v) {
        imgRobot.setBackgroundResource(R.drawable.animation);
        animacion_robot= (AnimationDrawable) imgRobot.getBackground();
        animacion_robot.start();
    }
}