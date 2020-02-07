package com.example.callservice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class transactionactivity extends AppCompatActivity {
    private Button dbblbtn,bkashbtn;
    String dbbl = "tel:" + "*322%23";
    String bkash = "tel:" + "*247%23";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactionactivity);

        dbblbtn = (Button)findViewById(R.id.dbblbtn);
        bkashbtn = (Button)findViewById(R.id.bkashbtn);

        dbblbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(dbbl));
                startActivity(intent);
            }
        });
        bkashbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse(bkash));
                startActivity(intent);
            }
        });
    }
}
