package cs465.goodsamaritan;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.widget.MediaController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.VideoView;

public class CPR_Tutorial extends AppCompatActivity {
    AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);
        final ImageButton play = (ImageButton) findViewById(R.id.imageButton);
        final MediaController mediaController = new MediaController(this);
        assert play != null;
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

        dialogBuilder.setTitle("Are you sure?")
                .setMessage("Are you sure you wish to end the current emergency?");

        dialogBuilder.setPositiveButton("End Emergency", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(CPR_Tutorial.this, MenuActivity.class));
            }
        });

        dialogBuilder.setNegativeButton("Return to Tutorial", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
    }

    public void tutorialFinished(View v) {
        AlertDialog dialog = dialogBuilder.create();
        dialog.show();
    }

    public void tutorialZoom(View v) {
        startActivity(new Intent(CPR_Tutorial.this, tutorialZoom.class));
    }
}