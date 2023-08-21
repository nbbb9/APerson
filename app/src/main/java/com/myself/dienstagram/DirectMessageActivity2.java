package com.myself.dienstagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class DirectMessageActivity2 extends AppCompatActivity {

    ImageButton DMprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directmessage2);

        DMprofile = (ImageButton) findViewById(R.id.dmbtn2);

        DMprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(), Na4Activity.class);
                startActivity(intent);
            }
        });

    }

}