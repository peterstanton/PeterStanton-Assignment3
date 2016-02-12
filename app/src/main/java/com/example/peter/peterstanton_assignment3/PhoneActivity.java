package com.example.peter.peterstanton_assignment3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.os.Parcelable;


public class PhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        Intent i = getIntent();
    }


    public void dialNumber (View view)
    {
        Intent intent = new Intent (Intent.ACTION_DIAL);

        EditText phoneEditText = (EditText) findViewById(R.id.phoneNumber);
        int inputNumber = Integer.parseInt(phoneEditText.getText().toString());
        intent.setData(Uri.parse("tel:" + inputNumber));
        if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivityForResult(intent, 0);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        finish();
    }

}
