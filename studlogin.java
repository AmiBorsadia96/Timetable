package com.example.timetable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class studlogin extends AppCompatActivity {
    TextView tnm,tenro;
    EditText enm,enro;
    Button btnsub;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studlogin);
        tnm=findViewById(R.id.txtn);
        enm=findViewById(R.id.etenm);
        tenro=findViewById(R.id.txten);
        enro=findViewById(R.id.etennm);
        btnsub=findViewById(R.id.btnsub);
        Intent intent = getIntent();
    }

    public void submit(View view) {
        Toast.makeText(this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
    }

    public void newaccount(View view) {
        Intent intent =new Intent(this, studentreg.class);
        this.startActivity(intent);

    }
}
