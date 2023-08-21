package com.myself.dienstagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Na4Activity extends AppCompatActivity {
    Button nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.na4);

        nextbtn = findViewById(R.id.btn5);

        nextbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent it;
                it = new Intent(getApplicationContext(), ImageView1.class);
                startActivity(it);
            }
        });

    }

}
