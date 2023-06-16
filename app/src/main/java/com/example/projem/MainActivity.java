package com.example.projem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_tcno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et_tcno=findViewById(R.id.tcNo);
        Button btnGiris=findViewById(R.id.btnGiris);
        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tcler=et_tcno.getText().toString();
            Intent i= new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("key", tcler);
                startActivity(i);
            }
        });
    }
}