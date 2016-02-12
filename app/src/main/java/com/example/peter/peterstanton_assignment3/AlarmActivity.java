package com.example.peter.peterstanton_assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.*;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

public class AlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        Intent i = getIntent();
    }


    public void summonAlarm (View view)
    {
        EditText hourEditText = (EditText) findViewById(R.id.hoursEntry);
        int hour = Integer.parseInt(hourEditText.getText().toString());

        EditText minutesEditText = (EditText) findViewById(R.id.minutesEntry);
        int minutes = Integer.parseInt(minutesEditText.getText().toString());

        // create an implicit intent with extras for a count down timer
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent,0);
         }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
      int x = 0;
      finish();
    }
}
