package com.example.bootcampandroid.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bootcampandroid.HomeActivity;
import com.example.bootcampandroid.R;

public class RegistrationActivity extends AppCompatActivity {



    TextView welcomeTV;
    EditText nameEDT,emailEDT,passwordEDT,confirmPasswordEDT;
    Button registrationButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registration);


        nameEDT = findViewById(R.id.registrationName);
        emailEDT = findViewById(R.id.registrationEmail);
        passwordEDT = findViewById(R.id.registrationPassword);
        confirmPasswordEDT = findViewById(R.id.registrationConfirmPassword);



        registrationButton = findViewById(R.id.signUpButton);

        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameEDT.getText().toString();

                String email = emailEDT.getText().toString();
                String password = passwordEDT.getText().toString();
                String confirm_password = confirmPasswordEDT.getText().toString();


                String msg = name + " " + email + " " + password;

                if (TextUtils.isEmpty(name)){
                    nameEDT.setError("required");
                    return;
                }
                if (TextUtils.isEmpty(email)){
                    emailEDT.setError("required");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    passwordEDT.setError("required");
                    return;
                }
                if (TextUtils.isEmpty(confirm_password)){
                    confirmPasswordEDT.setError("required");
                    return;
                }


                if (!password.equals(confirm_password)){
                    Toast.makeText(RegistrationActivity.this, "Mismatch Password", Toast.LENGTH_SHORT).show();
                    return;
                }


                Intent intent = new Intent(RegistrationActivity.this, HomeActivity.class);

                startActivity(intent);



            }
        });





    }
}