package cs465.goodsamaritan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void registrationFinished(View v){
        startActivity(new Intent(RegistrationActivity.this, Signin.class));
    }

    public void paypalLinkAccount(View v) {
        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.paypal.com/signin/"));
        startActivity(viewIntent);
    }
}
