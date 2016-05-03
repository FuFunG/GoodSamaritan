package cs465.goodsamaritan;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NotificationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
    }
    public void no(View v){
        startActivity(new Intent(NotificationPage.this, MainThread.class));
    }

    public void yes(View v){
        startActivity(new Intent(NotificationPage.this, AccidentAlertPage.class));
    }
}
