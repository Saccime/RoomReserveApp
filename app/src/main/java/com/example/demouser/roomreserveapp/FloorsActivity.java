package com.example.demouser.roomreserveapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FloorsActivity extends AppCompatActivity {

    private Button secFloor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floors);



        secFloor = ((Button)findViewById(R.id.SecondFloorButton));
        secFloor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
