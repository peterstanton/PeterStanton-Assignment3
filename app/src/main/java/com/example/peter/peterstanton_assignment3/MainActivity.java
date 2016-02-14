package com.example.peter.peterstanton_assignment3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public final static int TIMER_REQUEST_CODE = 0;
    public final static int ALARM_REQUEST_CODE = 1;
    public final static int PHONE_REQUEST_CODE = 2;
    public final static int CONTACTS_REQUEST_CODE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void toAlarm (View view)
    {
        //alarm intent here
        Intent intent = new Intent (this, AlarmActivity.class);
        startActivityForResult(intent, ALARM_REQUEST_CODE);
    }

    public void toTimer (View view)
    {
        //timer intent here
        Intent intent = new Intent (this, TimerActivity.class);
        startActivityForResult(intent, TIMER_REQUEST_CODE);
    }

    public void toPhone (View view)
    {
        //phone intent here
        Intent intent = new Intent (this, PhoneActivity.class);
        startActivityForResult(intent, PHONE_REQUEST_CODE);
    }

    public void toContacts (View view)
    {
        //contacts intent here
        Intent intent = new Intent (this, ContactsActivity.class);
        startActivityForResult(intent, CONTACTS_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        int x = 0;
    }
}
