package com.example.asusrog.tp21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    //Declaration
    EditText etName,etMoyenne;
    Button bLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        //Récuperation
        etName=(EditText)findViewById(R.id.etName);
        etMoyenne=(EditText)findViewById(R.id.etMoyenne);
        bLogout=(Button) findViewById(R.id.BLogout);

        //Association Lisner
        bLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Traitment
                Intent intent = new Intent(Main.this,Login.class);
                startActivity(intent);
            }
        });

    }
}
