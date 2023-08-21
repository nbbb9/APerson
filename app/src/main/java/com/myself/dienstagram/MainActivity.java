package com.myself.dienstagram;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView mVideoView = (VideoView) findViewById(R.id.screenVideoView);
        Button startbtn = (Button)findViewById(R.id.startbtn);

        mVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.d14));
        mVideoView.start();

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(),WarningActivity.class);
                startActivity(intent);
            }
        });

    }

}