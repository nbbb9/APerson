package com.myself.dienstagram;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class D_12vidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_12vid);

        VideoView mVideoView = (VideoView) findViewById(R.id.screenVideoView2);
        Button startbtn = (Button)findViewById(R.id.startbtn2);

        mVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.d12));
        mVideoView.start();

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(),home3Activity.class);
                startActivity(intent);
            }
        });

    }

}
