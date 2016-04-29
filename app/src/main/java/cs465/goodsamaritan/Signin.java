package cs465.goodsamaritan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }
    public void signUp(View v){
        startActivity(new Intent(Signin.this, RegistrationActivity.class));
    }
    public void signIn(View v){
        startActivity(new Intent(Signin.this, MenuActivity.class));
    }
}
