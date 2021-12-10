package com.example.ujianbrata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MenuActivity extends AppCompatActivity {
    VideoView videobackground;
    Button btnBack,btnUjian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnUjian = (Button) findViewById(R.id.btnUjian);
        videobackground = (VideoView) findViewById(R.id.videobackground);

        String path = "android.resource://" + getPackageName() +"/" + R.raw.pidio;
        Uri yuri = Uri.parse(path);
        videobackground.setVideoURI(yuri);
        videobackground.start();

        videobackground.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

        btnUjian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,Brata10Desember.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume(){
        videobackground.resume();
        super.onResume();
    }

    @Override
    protected void onPause(){
        videobackground.pause();
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        videobackground.stopPlayback();
        super.onDestroy();
    }

}