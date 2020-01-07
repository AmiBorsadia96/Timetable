package com.example.timetable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class mainlogin extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlogin);
        Intent intent=getIntent();
    }

    public void studentlogin(View view) {
        Intent i =new Intent(this,studlogin.class);
        this.startActivity(i);

    }
    public void facultylogin(View view) {
        Intent i =new Intent(this,facultylogin.class);
        this.startActivity(i);

    }
    public void adminlogin(View view) {
        Intent i =new Intent(this,adminlogin.class);
        this.startActivity(i);

    }
}
