package com.example.shah.databasedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by shah on 14/1/15.
 */
public class EditSpiltrstnd extends Activity implements View.OnClickListener{

    EditText e1,e2,e3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splitteredit);

        e1=(EditText)findViewById(R.id.etid);
        e2=(EditText)findViewById(R.id.etaxb);

        Button b=(Button)findViewById(R.id.buttonmodify);
        b.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonmodify:
                String ss=e1.getText().toString();
                long ll=Long.parseLong(ss);
                String personnamemodify = e2.getText().toString();


                Newclass ex=new Newclass(this);
                ex.open();
                ex.updateEntry1(ll,personnamemodify);
                ex.close();
                Intent i=new Intent(EditSpiltrstnd.this,splitterview.class);
                startActivity(i);
                finish();
        }

    }
}
