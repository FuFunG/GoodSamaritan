package cs465.goodsamaritan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InitialScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_screen);
    }
    public void mainMenu(View v){
        startActivity(new Intent(InitialScreen.this, MenuActivity.class));
    }
    public void lifeThreatening(View v){
        startActivity(new Intent(InitialScreen.this, EmergencySelector.class));
    }
}
