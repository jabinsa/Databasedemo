package com.example.shah.databasedemo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SqliteExxample extends Activity implements View.OnClickListener {
    Button update,vieww,modify,getinfo,delete;
    EditText name,text,sqlrow;
    boolean diditwork=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        update=(Button)findViewById(R.id.b1);
        name=(EditText)findViewById(R.id.editText);

        vieww=(Button)findViewById(R.id.b2);
        text=(EditText)findViewById(R.id.editText2);

        sqlrow=(EditText)findViewById(R.id.editText3);
        getinfo=(Button)findViewById(R.id.b3);
        modify=(Button)findViewById(R.id.b4);
        delete=(Button)findViewById(R.id.b5);


        update.setOnClickListener(this);
        vieww.setOnClickListener(this);
        getinfo.setOnClickListener(this);
        modify.setOnClickListener(this);
        delete.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.b1:
              try {
               /*   //double as[]={12.5,}
                  String aa=String.valueOf(2.2);
                  String bb=String.valueOf(3.4);
                  String personname = name.getText().toString();
                  String personnumber = text.getText().toString();*/

                  Newclass entry = new Newclass(SqliteExxample.this);
                  entry.open();
                  entry.createEntry(String.valueOf(12.5),String.valueOf(0.4));
                  entry.createEntry(String.valueOf(10.5),String.valueOf(0.6));
                  entry.createEntry(String.valueOf(8.5),String.valueOf(1.0));
                  entry.createEntry(String.valueOf(7.5),String.valueOf(1.4));
                  entry.createEntry(String.valueOf(6.5),String.valueOf(1.8));
                  entry.createEntry(String.valueOf(5.8),String.valueOf(2.0));
                  entry.createEntry(String.valueOf(5.0),String.valueOf(2.2));
                  entry.createEntry(String.valueOf(4.5),String.valueOf(2.8));
                  entry.createEntry(String.valueOf(4.0),String.valueOf(3.0));
                  entry.createEntry(String.valueOf(3.5),String.valueOf(3.5));
                  entry.close();


                  entry.open();
                  entry.createEntry1(String.valueOf(3.6));
                  entry.createEntry1(String.valueOf(6.5));
                  entry.createEntry1(String.valueOf(10));
                  entry.createEntry1(String.valueOf(13));
                  entry.createEntry1(String.valueOf(16));
                  entry.createEntry1(String.valueOf(19.5));

                  entry.close();



              }catch (Exception e)
              {
                  diditwork=false;
                  String error=e.toString();
                  Dialog d=new Dialog(this);
                  d.setTitle("Not working");
                  TextView tv=new TextView(this);
                  tv.setText(error);
                  d.setContentView(tv);
                  d.show();
              }finally {
                  Dialog d=new Dialog(this);
                  d.setTitle("working");
                  TextView tv=new TextView(this);
                  tv.setText("Success");
                  d.setContentView(tv);
                  d.show();
              }
                break;
            case R.id.b2:
                Intent i=new Intent(SqliteExxample.this,Sqlview.class);
                startActivity(i);
                break;

            case R.id.b3:
                String s=sqlrow.getText().toString();
                long l=Long.parseLong(s);
                Newclass n=new Newclass(this);
                n.open();
                String returnedName=n.getName(l);
                String returnedNumber=n.getNumber(l);
                n.close();
                name.setText(returnedName);
                text.setText(returnedNumber);

                break;

            case R.id.b4:
                String ss=sqlrow.getText().toString();
                long ll=Long.parseLong(ss);
                String personnamemodify = name.getText().toString();
                String personnumbermodify = text.getText().toString();

                Newclass ex=new Newclass(this);
                ex.open();
                ex.updateEntry(ll,personnamemodify,personnumbermodify);
                ex.close();

                break;

            case R.id.b5:
                Intent ii=new Intent(SqliteExxample.this,splitterview.class);
                startActivity(ii);
                break;





        }

    }

}
