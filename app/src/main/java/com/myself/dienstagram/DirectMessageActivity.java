package com.myself.dienstagram;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class DirectMessageActivity extends AppCompatActivity {

    ImageButton DMprofile1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directmessage);

        DMprofile1 = (ImageButton) findViewById(R.id.dmbtn1);

        DMprofile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(),dmchatActivity.class);
                startActivity(intent);
            }
        });

    }

}
