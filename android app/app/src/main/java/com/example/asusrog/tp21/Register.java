package com.example.asusrog.tp21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    //Declaration
    EditText etName,etLogin,etPassword;
    Button bRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regester);

        //Récuperation
        etName=(EditText)findViewById(R.id.etName);
        etLogin=(EditText)findViewById(R.id.etLogin);
        etPassword=(EditText)findViewById(R.id.etPassword);
        bRegister=(Button) findViewById(R.id.BRegister);

        //Association Lisner
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Traitment
                if(!etName.getText().toString().equals("") && !etLogin.getText().toString().equals("") && !etPassword.getText().toString().equals(""))
                {
                    Intent intent = new Intent(Register.this,Login.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Register.this,"Error ! some field are empty",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
