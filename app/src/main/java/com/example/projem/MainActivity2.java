package com.example.projem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv_tc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_tc =findViewById(R.id.tv);
        Intent intent;
        intent = getIntent();

        String tv=intent.getStringExtra("key");


        tv_tc.setText(tv.toString());

        Button Mv= findViewById(R.id.btnMv);
        Mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(MainActivity2.this,MainActivity3.class);
                i2.putExtra("key", tv);
                startActivity(i2);
            }
        });
        Button Cb= findViewById(R.id.btnCb);
        Cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3= new Intent(MainActivity2.this,MainActivity4.class);
                i3.putExtra("key", tv);
                startActivity(i3);
            }
        });
        Button ilet= findViewById(R.id.btnIletisim);
        ilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4= new Intent(MainActivity2.this, harita_Activity.class);
                i4.putExtra("key", tv);
                startActivity(i4);
            }
        });
       /* Button btn3part= findViewById(R.id.btn3partlibrary);
        btn3part.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn3partl= new Intent(MainActivity2.this,MainActivity4.class);
                btn3partl.putExtra("key", tv);
                startActivity(i3);
            }
        });*/
    }
}