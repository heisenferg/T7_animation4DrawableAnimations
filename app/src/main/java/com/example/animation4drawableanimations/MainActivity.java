package com.example.animation4drawableanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements ImageView.OnTouchListener {

    AnimationDrawable animacion_robot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageView a la que se añadirá la animación
        ImageView imgRobot = (ImageView) findViewById(R.id.robot);
        imgRobot.setBackgroundResource(R.drawable.animation);
        animacion_robot= (AnimationDrawable) imgRobot.getBackground();
        //Listener para touch
        imgRobot.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        /* Al tocar la pantalla comenzará la animación*/
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            animacion_robot.start();
            return true;
        }
        return false;
    }

}