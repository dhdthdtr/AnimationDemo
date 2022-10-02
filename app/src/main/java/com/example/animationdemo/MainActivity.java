package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.image_view);
        Button btn_rotate = findViewById(R.id.btn_rotate);
        Button btn_bounce = findViewById(R.id.btn_bounce);
        Button btn_sequential = findViewById(R.id.btn_sequential);
        Button btn_together = findViewById(R.id.btn_together);
        btn_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                img.startAnimation(animation);
            }
        });

        btn_bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                img.startAnimation(animation);
            }
        });

        btn_sequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential);
                img.startAnimation(animation);
            }
        });

        btn_together.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation;
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together);
                img.startAnimation(animation);
            }
        });
    }
}