package com.testright.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Initialise the Main Activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialise the Button Variable
        btn = findViewById(R.id.button_home);

        // Configure the button to start camera activity on click
        setHomeClickListener();


    }

    private void setHomeClickListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CameraActivity.class));
            }
        });
    }
}