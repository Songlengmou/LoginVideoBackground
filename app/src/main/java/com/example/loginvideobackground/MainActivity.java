package com.example.loginvideobackground;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author admin
 * desc:登陆背景视频
 */
public class MainActivity extends AppCompatActivity {

    private CustomVideoView mVideoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mVideoview = findViewById(R.id.videoview);

        mVideoview.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.shi));
        //播放
        mVideoview.start();
        //循环播放
        mVideoview.setOnCompletionListener(mediaPlayer -> mVideoview.start());
    }
}
