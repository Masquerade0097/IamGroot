package com.tutorial.masquerade.sampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameEditText = findViewById(R.id.nameEditText);

        findViewById(R.id.hiButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hi  " + nameEditText.getText().toString()
                        + "\nI'm Groot", Toast.LENGTH_LONG).show();
            }
        });
    }
}
