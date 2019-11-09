package com.example.videodemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button clk;
    VideoView videoView;
    MediaController mediaC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clk = (Button) findViewById(R.id.button);
        videoView = (VideoView) findViewById(R.id.videoView);
        mediaC =  new MediaController(this);
    }
    public void videoPlayy(View view){
        String VideoPath=("android.resource://com.example.videodemo/"+R.raw.samplevideo);
        Uri uri = Uri.parse(VideoPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
    }
}
