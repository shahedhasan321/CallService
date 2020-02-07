package com.example.callservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class operatoractivity extends AppCompatActivity {
    private Button gpbtn,blbtn,robibtn,airbtn,telbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operatoractivity);
        gpbtn = (Button)findViewById(R.id.gpbtn);
        blbtn = (Button)findViewById(R.id.blbtn);
        robibtn = (Button)findViewById(R.id.robibtn);
        airbtn = (Button)findViewById(R.id.airbtn);
        telbtn = (Button)findViewById(R.id.telbtn);

        gpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(operatoractivity.this,gpfirstactivity.class);
                startActivity(intent);
            }
        });
        blbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(operatoractivity.this,banglalinkfirstactivity.class);
                startActivity(intent);
            }
        });
        robibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(operatoractivity.this,robifirstactivity.class);
                startActivity(intent);
            }
        });
        airbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(operatoractivity.this,airtelfirstactivity.class);
                startActivity(intent);
            }
        });
        telbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(operatoractivity.this,teletalkfirstactivity.class);
                startActivity(intent);
            }
        });
    }
}
