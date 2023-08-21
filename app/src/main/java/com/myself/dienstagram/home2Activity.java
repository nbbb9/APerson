package com.myself.dienstagram;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class home2Activity extends AppCompatActivity {

    ImageButton Dmbtn2;
    NotificationManager manager;
    NotificationCompat.Builder builder;

    private static String CHANNEL_ID = "channel2";
    private static String CHANEL_NAME = "Channel2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home2);

        showNoti();

        Dmbtn2 = findViewById(R.id.dmbtn2);

        Dmbtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent;
                intent = new Intent(getApplicationContext(), DirectMessageActivity2.class);
                startActivity(intent);
            }
        });

    }

    public void showNoti(){
        builder = null;
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        //버전 오레오 이상일 경우
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            manager.createNotificationChannel(
                    new NotificationChannel(CHANNEL_ID, CHANEL_NAME, NotificationManager.IMPORTANCE_DEFAULT)
            );
            builder = new NotificationCompat.Builder(this,CHANNEL_ID);
            //하위 버전일 경우
        }
        //알림창 제목
        builder.setContentTitle("단체 채팅(친구들)");
        //알림창 메시지
        builder.setContentText("(한세희 님이 사진을 1장 공유했습니다.");
        //알림창 아이콘
        builder.setSmallIcon(R.drawable.message);
        //진동 실행
        builder.setVibrate(new long[]{0, 500, 200, 500});//0초 대기, 0.5초 진동, 0.2초 대기, 0.5초 진동.

        Notification notification = builder.build();
        //알림창 실행
        manager.notify(1,notification);
        MediaPlayer alert = MediaPlayer.create(this, R.raw.alert);
        alert.start();

    }

}
