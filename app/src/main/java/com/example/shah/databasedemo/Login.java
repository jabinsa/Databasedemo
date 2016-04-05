package com.example.shah.databasedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by shahnawaz on 3/24/15.
 */
public class Login extends Activity implements View.OnClickListener {

    EditText e1, e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_layout);

        e1 = (EditText) findViewById(R.id.etnammme);
        e2 = (EditText) findViewById(R.id.etpasssword);
        b1 = (Button) findViewById(R.id.button22);

        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button22:
                String name = e1.getText().toString();
                String Pass = e2.getText().toString();
            //    Toast.makeText(getBaseContext(), " " + name, Toast.LENGTH_SHORT).show();
             //   Toast.makeText(getBaseContext(), " " + Pass, Toast.LENGTH_SHORT).show();
                Newclass entry = new Newclass(Login.this);
                entry.open();
                String Password = entry.getNumber(name);
              //  Toast.makeText(getBaseContext(), " " + Password, Toast.LENGTH_SHORT).show();

                if (Password==null) {
                    Toast.makeText(getApplicationContext(), "Username not found Login first!!", Toast.LENGTH_LONG).show();
                    return;
                } else {
                    if (Pass.matches(Password)) {
                        Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_LONG).show();
                        entry.close();
                        Intent i = new Intent(Login.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Username or Password not found !!", Toast.LENGTH_LONG).show();
                        return;
                    }

                }
                break;
        }


    }
}


