package com.myself.dienstagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Na10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.na10);

        Button nextbtn = findViewById(R.id.btn11);

        nextbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent it;
                it = new Intent(getApplicationContext(), DMActivity10.class);
                startActivity(it);
            }
        });

    }

}