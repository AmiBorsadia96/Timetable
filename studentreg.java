package com.example.timetable;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class studentreg extends Activity implements View.OnClickListener {
    TextView tnm,ter,tsem,tdiv,tlab;
    EditText etnm,etenro,etsem,etdiv;
    Button btnsub;
    ImageView imv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentreg);
        Intent intent = getIntent();
        tlab=findViewById(R.id.txtlabel);
        imv=findViewById(R.id.imgstu);
        tnm=findViewById(R.id.txtnm);
        etnm=findViewById(R.id.etxtnm);
        ter=findViewById(R.id.etxteno);
        etenro=findViewById(R.id.etxteno);
        tsem=findViewById(R.id.txtsem);
        etsem=findViewById(R.id.etxtsem);
        tdiv=findViewById(R.id.txtdiv);
        etdiv=findViewById(R.id.etxtdiv);
        btnsub=findViewById(R.id.button);
        btnsub.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show();
    }
}
