package com.example.ujianbrata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button button;
    VideoView video2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        video2 = (VideoView) findViewById(R.id.video2);

        String pathnya =  "android.resource://" + getPackageName()+"/" +R.raw.pidio;
        Uri uri = Uri.parse(pathnya);
        video2.setVideoURI(uri);
        video2.start();

        video2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnya = new Intent(MainActivity.this,MenuActivity.class);
                intentnya.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intentnya);
            }
        });
    }

    @Override
    protected void onResume(){
        video2.resume();
        super.onResume();
    }

    @Override
    protected void onPause(){
        video2.pause();
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        video2.stopPlayback();
        super.onDestroy();
    }
}