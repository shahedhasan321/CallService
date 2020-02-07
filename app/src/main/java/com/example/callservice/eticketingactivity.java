package com.example.callservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eticketingactivity extends AppCompatActivity {

    private Button trainbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eticketingactivity);

        trainbtn = (Button)findViewById(R.id.trainbtn);



        trainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eticketingactivity.this,trainactivity.class);
                startActivity(intent);
            }
        });
    }
}
