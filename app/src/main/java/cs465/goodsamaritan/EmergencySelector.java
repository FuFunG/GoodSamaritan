package cs465.goodsamaritan;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EmergencySelector extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_emergency_selector);
        }
         public void emergencyClick(View v){
             startActivity(new Intent(EmergencySelector.this, ResponderMessage.class));
        }
    }
