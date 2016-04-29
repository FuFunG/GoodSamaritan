package cs465.goodsamaritan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void notification(View v){
        startActivity(new Intent(MenuActivity.this, NotificationPage.class));
    }
    public void lifeThreateningClick(View v){
        startActivity(new Intent(MenuActivity.this, EmergencySelector.class));
    }
    public void register(View v){
        startActivity(new Intent(MenuActivity.this, RegistrationActivity.class));
    }
    public void signIn(View v){
        startActivity(new Intent(MenuActivity.this, Signin.class));
    }
    public void reward(View v){
        startActivity(new Intent(MenuActivity.this, RewardSamaritan.class));
    }
}
