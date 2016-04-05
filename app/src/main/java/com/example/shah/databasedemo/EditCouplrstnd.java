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
public class EditCouplrstnd  extends Activity implements View.OnClickListener{
    EditText e1,e2,e3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editcouplrstnd);

        e1=(EditText)findViewById(R.id.editText6);
        e2=(EditText)findViewById(R.id.editText4);
        e3=(EditText)findViewById(R.id.editText5);
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                String ss=e1.getText().toString();
                long ll=Long.parseLong(ss);
                String personnamemodify = e2.getText().toString();
                String personnumbermodify = e3.getText().toString();

                Newclass ex=new Newclass(this);
                ex.open();
                ex.updateEntry(ll,personnamemodify,personnumbermodify);
                ex.close();
                Intent i=new Intent(EditCouplrstnd.this,Sqlview.class);
                startActivity(i);
                 finish();
        }

    }
}
