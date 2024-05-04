package com.java.streamingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
public class Register_activity extends AppCompatActivity {
    TextView btn;
    private EditText InputUsername, Inputpwd, InputEmail, InputConfirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        InputUsername = findViewById(R.id.inputUsername);
        InputEmail = findViewById(R.id.InputEmail);
        Inputpwd = findViewById(R.id.InputPassword);
        InputConfirmPassword = findViewById(R.id.InputConfirmPaswword);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register_activity.this, AddNoteActivity.class));
            }
        });
    }
}