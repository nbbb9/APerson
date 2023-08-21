package com.myself.dienstagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class DMActivity3 extends AppCompatActivity {

    ScrollView dmscroll3;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dmchat3);

        dmscroll3 = findViewById(R.id.dmscroll3);
        next = findViewById(R.id.choice3btn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it;
                it = new Intent(getApplicationContext(), Na3Activity.class);
                startActivity(it);
            }
        });

    }

//    private void scrolldown(){
//        //스크롤 맨 아래로 이동.
//        dmscroll3.post(new Runnable(){
//            @Override
//            public void  run(){ dmscroll3.fullScroll(ScrollView.FOCUS_DOWN);}
//        });
//    }

}