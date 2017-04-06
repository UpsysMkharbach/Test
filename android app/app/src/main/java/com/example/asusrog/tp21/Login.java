package com.example.asusrog.tp21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //Declaration
    EditText etLogin,etPassword;
    Button bLogin;
    TextView tvRegister;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Récuperation
        etLogin=(EditText)findViewById(R.id.etLogin);
        etPassword=(EditText)findViewById(R.id.etPassword);
        bLogin=(Button) findViewById(R.id.BLogin);
        tvRegister=(TextView)findViewById(R.id.tvRegister);

        //Association Lisner
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Traitment
                //Toast.makeText(Login.this,"text",Toast.LENGTH_LONG).show();
                if(etLogin.getText().toString().equals("toto") && etPassword.getText().toString().equals("123"))
                {
                    Intent intent = new Intent(Login.this, Main.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Login.this,"Error! login or password are wrong",Toast.LENGTH_LONG).show();
                }
            }
        });

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });


    }


}
