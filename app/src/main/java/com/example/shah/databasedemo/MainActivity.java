package com.example.shah.databasedemo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity{

    RadioGroup rg;
    Button bn,bb,blog;
    EditText et;
    int count=1;
boolean diditwork=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



if(count==1) {

    try {
        Newclass entry = new Newclass(MainActivity.this);
        entry.open();
        entry.createEntry(String.valueOf(12.5), String.valueOf(0.4));
        entry.createEntry(String.valueOf(10.5), String.valueOf(0.6));
        entry.createEntry(String.valueOf(8.5), String.valueOf(1.0));
        entry.createEntry(String.valueOf(7.5), String.valueOf(1.4));
        entry.createEntry(String.valueOf(6.5), String.valueOf(1.8));
        entry.createEntry(String.valueOf(5.8), String.valueOf(2.0));
        entry.createEntry(String.valueOf(5.0), String.valueOf(2.2));
        entry.createEntry(String.valueOf(4.5), String.valueOf(2.8));
        entry.createEntry(String.valueOf(4.0), String.valueOf(3.0));
        entry.createEntry(String.valueOf(3.5), String.valueOf(3.5));
        entry.close();


        entry.open();
        entry.createEntry1(String.valueOf(3.6));
        entry.createEntry1(String.valueOf(6.5));
        entry.createEntry1(String.valueOf(10));
        entry.createEntry1(String.valueOf(13));
        entry.createEntry1(String.valueOf(16));
        entry.createEntry1(String.valueOf(19.5));

        entry.close();


    } catch (Exception e) {
        diditwork = false;
        String error = e.toString();
        Dialog d = new Dialog(this);
        d.setTitle("Not working");
        TextView tv = new TextView(this);
        tv.setText(error);
        d.setContentView(tv);
       //  d.show();
    } finally {
        Dialog d = new Dialog(this);
        d.setTitle("Initialising");
        TextView tv = new TextView(this);
        tv.setText("Standard Values Initialised");
        d.setContentView(tv);
        // d.show();
    }

count++;
}




  final EditText et=(EditText)findViewById(R.id.eT);


                bb=(Button)findViewById(R.id.bbbb);
                bb.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                     //   Toast.makeText(getBaseContext(), "settings", Toast.LENGTH_SHORT).show();
                        Intent settngs=new Intent("com.example.shah.databasedemo.SqliteExxample");

                        startActivity(settngs);
                    }
                });

                rg=(RadioGroup)findViewById(R.id.rgroup);
                rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        // TODO Auto-generated method stub
                        RadioButton r1;
                        r1=(RadioButton)findViewById(R.id.rB1);
                        if(r1.isChecked())
                        {//Toast.makeText(getBaseContext(), "coupler checked", Toast.LENGTH_SHORT).show();
                            bn=(Button)findViewById(R.id.bn);
                            bn.setOnClickListener(new View.OnClickListener() {

                                @Override
                                public void onClick(View v) {
                                  // TODO Auto-generated method stub
                                    Intent i=new Intent(MainActivity.this,CouplerGain.class);
                                     i.putExtra("myExtra",et.getText().toString());
                                    startActivity(i);
                                }
                            });
                        }
                        else
                        {
                            //Toast.makeText(getBaseContext(), "splitter checked", Toast.LENGTH_SHORT).show();
					bn=(Button)findViewById(R.id.bn);
					bn.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
                            Intent ii=new Intent(MainActivity.this,SplitterGain.class);
                            ii.putExtra("myExtra",et.getText().toString());
                            startActivity(ii);
						}
					});
                        }

                    }
                });
        blog=(Button)findViewById(R.id.logoutbtn);
        blog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent ii=new Intent(MainActivity.this,FirstPage.class);
Toast.makeText(getBaseContext(), "Successfully logged out...!!", Toast.LENGTH_SHORT).show();
                startActivity(ii);
                finish();
            }
        });

            }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
