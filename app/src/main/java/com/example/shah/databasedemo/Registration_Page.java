package com.example.shah.databasedemo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shah on 26/1/15.
 */
public class Registration_Page extends Activity implements View.OnClickListener {
EditText e1,e2,e3;
    Button b;
    boolean diditwork=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_layout);
        e1=(EditText)findViewById(R.id.etname);
        e2=(EditText)findViewById(R.id.etpassword);
        e3=(EditText)findViewById(R.id.etconfirmpass);
        b=(Button)findViewById(R.id.bssss);

        b.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bssss:
                String name=e1.getText().toString();
                String Pass=e2.getText().toString();
                String cpass=e3.getText().toString();
               // Newclass info=new Newclass(Registration_Page.this);
             //   info.open();
            //    String a=info.getNumber(name);
            //    info.close();
                if(name.matches("")||Pass.matches("")||cpass.matches("")) {
                    Toast.makeText(getApplicationContext(), "ENTER ALL THE DETAILS ", Toast.LENGTH_LONG).show();
                    return;
                }



                else {

                    if (!Pass.equals(cpass)) {
                        Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_LONG).show();
                        return;
                    }

                    else {
                        // Save the Data in Database
                     try{
                       Newclass entry = new Newclass(Registration_Page.this);

                   entry.open();
                      entry.createEntry2(name, Pass);
                  //      String a= entry.getdata3();
                  //       Toast.makeText(getApplicationContext(), " " + a, Toast.LENGTH_LONG).show();
                        entry.close();
                  } catch (Exception e) {
                        diditwork = false;
                        String error = e.toString();
                        Dialog d = new Dialog(this);
                        d.setTitle("Not working");
                        TextView tv = new TextView(this);
                        tv.setText(error);
                        d.setContentView(tv);
                        d.show();
                    } finally {
                        Dialog d = new Dialog(this);
                        d.setTitle("Initialising");
                        TextView tv = new TextView(this);
                        tv.setText("Standard Values Initialised");
                        d.setContentView(tv);
                        d.show();
                    }
                     Toast.makeText(getApplicationContext(), "Account Successfully Created ", Toast.LENGTH_LONG).show();
                      Intent i = new Intent(Registration_Page.this, MainActivity.class);
                       startActivity(i);
                      finish();
                    }

                break;
        }}

    }
}
