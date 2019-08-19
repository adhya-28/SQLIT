package com.example.sqlit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(TextView)findViewById(R.id.textdb);
        DatabaseHandler db = new DatabaseHandler(this);
        // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Sumith", "9100000000","BCA"));
        db.addContact(new Contact("Shiyas", "9199999999","BBA"));
        db.addContact(new Contact("Tommy", "9522222222","BA"));
        db.addContact(new Contact("Karthik", "9533333333","BCA"));
        db.addContact(new Contact("Sarath","9833113223","BCA"));
        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            txt1.setText(cn.getID()+"  "+cn.getName()+"   "+cn.getPhoneNumber()+"  "+cn.get_course());
           String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Phone: " +
                  cn.getPhoneNumber()+"  ,course: "+cn.get_course();
           // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }
}