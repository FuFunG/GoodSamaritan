package cs465.goodsamaritan;

import android.widget.MediaController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.VideoView;

public class CPR_Tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);

        final ImageButton play = (ImageButton) findViewById(R.id.imageButton);
        final MediaController mediaController = new MediaController(this);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VideoView videoView =
                        (VideoView) findViewById(R.id.videoView);
                videoView.setVideoPath("android.resource://cs465.goodsamaritan/" + R.raw.cpr);
                mediaController.setAnchorView(videoView);
                videoView.setMediaController(mediaController);
                play.setVisibility(View.GONE);
                videoView.start();
            }

        });
    }
}