package cs465.goodsamaritan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RewardSamaritan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward_samaritan);
        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"Car accident: John Doe", "Drowning Accident: Mary Pots", "Heart Attack incident: Jack Nichols"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }

    public void paypalLogin(View v) {
        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.paypal.com/signin/"));
        startActivity(viewIntent);
    }

}



