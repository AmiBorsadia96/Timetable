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

public class adminlogin extends AppCompatActivity {
    TextView tnm,tpwd;
    EditText enm,epwd;
    Button btnsub;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminlogin);
        tnm=findViewById(R.id.txtun);
        enm=findViewById(R.id.etunm);
        tpwd=findViewById(R.id.txtpwd);
        epwd=findViewById(R.id.etpwd);
        btnsub=findViewById(R.id.btnsub);
        Intent intent = getIntent();
    }
    public void submit(View view) {
        Toast.makeText(this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
    }


}
