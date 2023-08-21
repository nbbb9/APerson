package com.myself.dienstagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class DirectMessageActivity3 extends AppCompatActivity {

    ImageButton jo_dmbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directmessage3);

        jo_dmbtn = (ImageButton) findViewById(R.id.jo_dmbtn);

        jo_dmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(), DMActivity7.class);
                startActivity(intent);
            }
        });

    }

}