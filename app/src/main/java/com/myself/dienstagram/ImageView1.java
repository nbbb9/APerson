package com.myself.dienstagram;

import static com.myself.dienstagram.R.raw.horrorsound1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class ImageView1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview1);

        MediaPlayer horrorsound = MediaPlayer.create(this, horrorsound1);
        horrorsound.start();

        ImageView gif1 = (ImageView) findViewById(R.id.gif1);

        GlideDrawableImageViewTarget gifImage = new GlideDrawableImageViewTarget(gif1);

        Glide.with(this).load(R.drawable.han_zom).into(gifImage);

        Button nextbtn = findViewById(R.id.nextbtn);

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it;
                it = new Intent(getApplicationContext(), DMActivity4.class);
                startActivity(it);
            }
        });

    }

}
