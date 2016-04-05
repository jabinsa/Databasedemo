package com.example.shah.databasedemo;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shah on 14/1/15.
 */
public class SplitterGain  extends Activity{

    TableLayout t1;
    RadioGroup rg;


    TextView etA1,etA2,etA3,etA4,etA5,etA6,etA7,etA8,etA9,etA10;
    double d1,d2,d3,d4,d5,d6,d7,d8;

TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splitter_gain_layout);



        String a=getIntent().getExtras().getString("myExtra");
        //     Toast.makeText(getBaseContext(), getIntent().getExtras().getString("myExtra"),Toast.LENGTH_SHORT).show();
        //   Toast.makeText(getBaseContext(), " "+a,Toast.LENGTH_SHORT).show();
        final double num= Double.parseDouble(a);
     //   Toast.makeText(getBaseContext(), " " + num, Toast.LENGTH_SHORT).show();
        Toast.makeText(getBaseContext(), " Select Radio Group:Gain/Loss " , Toast.LENGTH_LONG).show();
        rg=(RadioGroup)findViewById(R.id.csrgroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                RadioButton r1;
                r1 = (RadioButton) findViewById(R.id.csrB11);
                if (r1.isChecked()) {
                  //  Toast.makeText(getBaseContext(), "Gainchecked", Toast.LENGTH_SHORT).show();


                    Newclass n = new Newclass(SplitterGain.this);
                //1
                   n.open();
                        String returnedName = n.getName1(1);

                          Double ans=num+Double.parseDouble(returnedName);

                                  n.close();

                  etA2=(TextView)findViewById(R.id.textView9);
                    etA2.setText(String.valueOf(ans));

                    //2

                    n.open();
                    String returnedName1 = n.getName1(2);

                    Double ans1=num+Double.parseDouble(returnedName1);

                    n.close();

                    etA3=(TextView)findViewById(R.id.textView11);
                    etA3.setText(String.valueOf(ans1));

         //3
                    n.open();
                    String returnedName2 = n.getName1(3);

                    Double ans2=num+Double.parseDouble(returnedName2);

                    n.close();

                    etA4=(TextView)findViewById(R.id.textView15);
                    etA4.setText(String.valueOf(ans2));

         //4
                    n.open();
                    String returnedName3 = n.getName1(4);

                    Double ans3=num+Double.parseDouble(returnedName3);

                    n.close();

                    etA4=(TextView)findViewById(R.id.textView17);
                    etA4.setText(String.valueOf(ans3));

         //5
                    n.open();
                    String returnedName4 = n.getName1(5);

                    Double ans4=num+Double.parseDouble(returnedName4);

                    n.close();

                    etA5=(TextView)findViewById(R.id.textView19);
                    etA5.setText(String.valueOf(ans4));

         //6
                    n.open();
                    String returnedName5 = n.getName1(6);

                    Double ans5=num+Double.parseDouble(returnedName5);

                    n.close();

                    etA6=(TextView)findViewById(R.id.textView13);
                    etA6.setText(String.valueOf(ans5));
                }
                else {
                //    Toast.makeText(getBaseContext(), "Loss checked", Toast.LENGTH_SHORT).show();


                    Newclass n = new Newclass(SplitterGain.this);
                    //1
                    n.open();
                    String returnedName = n.getName1(1);

                    Double ans=num-Double.parseDouble(returnedName);

                    n.close();

                    etA2=(TextView)findViewById(R.id.textView9);
                    etA2.setText(String.valueOf(ans));

                    //2

                    n.open();
                    String returnedName1 = n.getName1(2);

                    Double ans1=num-Double.parseDouble(returnedName1);

                    n.close();

                    etA3=(TextView)findViewById(R.id.textView11);
                    etA3.setText(String.valueOf(ans1));

                    //3
                    n.open();
                    String returnedName2 = n.getName1(3);

                    Double ans2=num-Double.parseDouble(returnedName2);

                    n.close();

                    etA4=(TextView)findViewById(R.id.textView15);
                    etA4.setText(String.valueOf(ans2));

                    //4
                    n.open();
                    String returnedName3 = n.getName1(4);

                    Double ans3=num-Double.parseDouble(returnedName3);

                    n.close();

                    etA4=(TextView)findViewById(R.id.textView17);
                    etA4.setText(String.valueOf(ans3));

                    //5
                    n.open();
                    String returnedName4 = n.getName1(5);

                    Double ans4=num-Double.parseDouble(returnedName4);

                    n.close();

                    etA5=(TextView)findViewById(R.id.textView19);
                    etA5.setText(String.valueOf(ans4));

                    //6
                    n.open();
                    String returnedName5 = n.getName1(6);

                    Double ans5=num-Double.parseDouble(returnedName5);

                    n.close();

                    etA6=(TextView)findViewById(R.id.textView13);
                    etA6.setText(String.valueOf(ans5));
                }
            }
        });
    }
}
