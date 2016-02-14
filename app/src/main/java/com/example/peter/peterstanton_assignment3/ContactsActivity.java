package com.example.peter.peterstanton_assignment3;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Intent i = getIntent();
    }

    public void summonContacts(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 1);
        }
    }


    public void Cancel(View view) {
        finish();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Uri contactUri = data.getData();
        }
    }
}