package com.myself.dienstagram;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class home3Activity extends AppCompatActivity {

    ImageButton han_like2;
    NotificationManager manager;
    NotificationCompat.Builder builder;

    private static String CHANNEL_ID = "channel2";
    private static String CHANEL_NAME = "Channel2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home3);

        han_like2 = findViewById(R.id.han_like);

        han_like2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(), Na6Activity.class);
                startActivity(intent);
            }
        });

    }
}
