package com.firtstprojectsuvojitsarker.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout laysong1, laysong2, laysong3, laysong4, laysong5, laysong6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        laysong1 = findViewById(R.id.laysong1);
        laysong2 = findViewById(R.id.laysong2);
        laysong3 = findViewById(R.id.laysong3);
        laysong4 = findViewById(R.id.laysong4);
        laysong5 = findViewById(R.id.laysong5);
        laysong6 = findViewById(R.id.laysong6);

        laysong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.video_url="https://www.youtube.com/embed/wgRJCQNxZ_M";
                Intent intent = new Intent(MainActivity.this , VideoPlayer.class);
                startActivity(intent);
            }
        });

        laysong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.video_url="https://www.youtube.com/embed/wnfUpOch510";
                Intent intent = new Intent(MainActivity.this , VideoPlayer.class);
                startActivity(intent);
            }
        });

        laysong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.video_url="https://www.youtube.com/embed/wnfUpOch510";
                Intent intent = new Intent(MainActivity.this , VideoPlayer.class);
                startActivity(intent);
            }
        });

        laysong4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.video_url="https://www.youtube.com/embed/wnfUpOch510";
                Intent intent = new Intent(MainActivity.this , VideoPlayer.class);
                startActivity(intent);
            }
        });

        laysong5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.video_url="https://www.youtube.com/embed/wnfUpOch510";
                Intent intent = new Intent(MainActivity.this , VideoPlayer.class);
                startActivity(intent);
            }
        });

        laysong6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.video_url="https://www.youtube.com/embed/wnfUpOch510";
                Intent intent = new Intent(MainActivity.this , VideoPlayer.class);
                startActivity(intent);
            }
        });
    }
}