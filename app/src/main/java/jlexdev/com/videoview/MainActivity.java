package jlexdev.com.videoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoDemo;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoDemo = (VideoView)findViewById(R.id.video_demo);
        videoDemo.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video_fab);

        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoDemo);

        videoDemo.setMediaController(mediaController);
        videoDemo.start();
    }
}
