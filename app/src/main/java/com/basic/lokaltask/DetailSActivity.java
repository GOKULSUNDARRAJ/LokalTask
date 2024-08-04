package com.basic.lokaltask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sactivity);

        // Retrieve the Intent that started this activity
        Intent intent = getIntent();

        // Get the data from the Intent
        String title = intent.getStringExtra("title");
        String cityLocation = intent.getStringExtra("city_location");
        String salaryMin = intent.getStringExtra("salary_min");
        String salaryMax = intent.getStringExtra("salary_max");
        String whatsappNo = intent.getStringExtra("whatsapp_no");
        String expireOn = intent.getStringExtra("expire_on");
        String openingsCount = intent.getStringExtra("openings_count" );
        String details = intent.getStringExtra("details");


        // Use the data (e.g., set it to TextViews)
        TextView titleTextView = findViewById(R.id.text_view_title);
        TextView locationTextView = findViewById(R.id.text_view_location);
        TextView salaryMinTextView = findViewById(R.id.sayarymin);
        TextView salaryMaxTextView = findViewById(R.id.salarymax);
        TextView phoneTextView = findViewById(R.id.text_view_phone);
        TextView experienceTextView = findViewById(R.id.experience);
        TextView openingsCountTextView = findViewById(R.id.onofopening);
        TextView others = findViewById(R.id.others);


        titleTextView.setText(title);
        locationTextView.setText(cityLocation);
        salaryMinTextView.setText("RS " + salaryMin + " -");
        salaryMaxTextView.setText(salaryMax);
        phoneTextView.setText(whatsappNo);
        experienceTextView.setText(expireOn);
        openingsCountTextView.setText("No of Openings: " + openingsCount);
        others.setText(details);
    }
}