package com.example.shah.databasedemo;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shah on 6/1/15.
 */
public class CouplerGain extends Activity {

    TableLayout t1;
    RadioGroup rg;
    Cursor cursor;
    TableRow tr1,tr2,tr3,tr4,tr5,tr6,tr7,tr8,tr9,tr10,tr11;
    TextView etA1,etA2,etA3,etA4,etA5,etA6,etA7,etA8,etA9,etA10;
    TextView etB1,etB2,etB3,etB4,etB5,etB6,etB7,etB8,etB9,etB10;
    Button bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coupler_gain_layout);
        String a=getIntent().getExtras().getString("myExtra");
   //     Toast.makeText(getBaseContext(), getIntent().getExtras().getString("myExtra"),Toast.LENGTH_SHORT).show();
     //   Toast.makeText(getBaseContext(), " "+a,Toast.LENGTH_SHORT).show();
        final double num= Double.parseDouble(a);
       // Toast.makeText(getBaseContext()," "+num,Toast.LENGTH_SHORT).show();

        Toast.makeText(getBaseContext(), " Select Radio Group:Gain/Loss " , Toast.LENGTH_LONG).show();

        rg=(RadioGroup)findViewById(R.id.cgrgroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                RadioButton r1;
                r1 = (RadioButton) findViewById(R.id.cgrB1);
                if (r1.isChecked()) {
                   // Toast.makeText(getBaseContext(), "Gainchecked", Toast.LENGTH_LONG).show();


                    Newclass n = new Newclass(CouplerGain.this);

                    t1 = (TableLayout) findViewById(R.id.cgtable);
                    //1
                    TableRow tr1 = (TableRow) findViewById(R.id.ctr1);
                    TableRow tr2 = (TableRow) findViewById(R.id.ctr2);

                    etA1 = (TextView) findViewById(R.id.cgr2c2);
                    etB1 = (TextView) findViewById(R.id.cgr2c3);
                    String s = String.valueOf(1);
                    long l = Long.parseLong(s);

                    n.open();
                    String returnedName = n.getName(l);
                    String returnedNumber = n.getNumber(l);
                    n.close();
                    double A1 = num + Double.parseDouble(returnedName);
                    double B1 = num + Double.parseDouble(returnedNumber);
                    etA1.setText(String.valueOf(A1));
                    etB1.setText(String.valueOf(B1));

//2

                    TableRow tr3 = (TableRow) findViewById(R.id.ctr3);

                    etA2 = (TextView) findViewById(R.id.cgr3c2);
                    etB2 = (TextView) findViewById(R.id.cgr3c3);
                    String s2 = String.valueOf(2);
                    long l2 = Long.parseLong(s2);

                    n.open();
                    String returnedName2 = n.getName(l2);
                    String returnedNumber2 = n.getNumber(l2);
                    n.close();
                    double A2 = num + Double.parseDouble(returnedName2);
                    double B2 = num + Double.parseDouble(returnedNumber2);
                    etA2.setText(String.valueOf(A2));
                    etB2.setText(String.valueOf(B2));
//3
                    etA3 = (TextView) findViewById(R.id.cgr4c2);
                    etB3 = (TextView) findViewById(R.id.cgr4c3);
                    String s3 = String.valueOf(3);
                    long l3 = Long.parseLong(s3);

                    n.open();
                    String returnedName3 = n.getName(l3);
                    String returnedNumber3 = n.getNumber(l3);
                    n.close();
                    double A3 = num + Double.parseDouble(returnedName3);
                    double B3 = num + Double.parseDouble(returnedNumber3);
                    etA3.setText(String.valueOf(A3));
                    etB3.setText(String.valueOf(B3));

                    //4
                    etA4 = (TextView) findViewById(R.id.cgr5c2);
                    etB4 = (TextView) findViewById(R.id.cgr5c3);
                    String s4 = String.valueOf(4);
                    long l4 = Long.parseLong(s4);

                    n.open();
                    String returnedName4 = n.getName(l4);
                    String returnedNumber4 = n.getNumber(l4);
                    n.close();
                    double A4 = num + Double.parseDouble(returnedName4);
                    double B4 = num + Double.parseDouble(returnedNumber4);
                    etA4.setText(String.valueOf(A4));
                    etB4.setText(String.valueOf(B4));

                    //5
                    etA5 = (TextView) findViewById(R.id.cgr6c2);
                    etB5 = (TextView) findViewById(R.id.cgr6c3);
                    String s5 = String.valueOf(5);
                    long l5 = Long.parseLong(s5);

                    n.open();
                    String returnedName5 = n.getName(l5);
                    String returnedNumber5 = n.getNumber(l5);
                    n.close();
                    double A5 = num + Double.parseDouble(returnedName5);
                    double B5 = num + Double.parseDouble(returnedNumber5);
                    etA5.setText(String.valueOf(A5));
                    etB5.setText(String.valueOf(B5));

                    //6
                    etA6 = (TextView) findViewById(R.id.cgr7c2);
                    etB6 = (TextView) findViewById(R.id.cgr7c3);
                    String s6 = String.valueOf(6);
                    long l6 = Long.parseLong(s6);

                    n.open();
                    String returnedName6 = n.getName(l6);
                    String returnedNumber6 = n.getNumber(l6);
                    n.close();
                    double A6 = num + Double.parseDouble(returnedName6);
                    double B6 = num + Double.parseDouble(returnedNumber6);
                    etA6.setText(String.valueOf(A6));
                    etB6.setText(String.valueOf(B6));

                    //7
                    etA7 = (TextView) findViewById(R.id.cgr8c2);
                    etB7 = (TextView) findViewById(R.id.cgr8c3);
                    String s7 = String.valueOf(7);
                    long l7 = Long.parseLong(s7);

                    n.open();
                    String returnedName7 = n.getName(l7);
                    String returnedNumber7 = n.getNumber(l7);
                    n.close();
                    double A7 = num + Double.parseDouble(returnedName7);
                    double B7 = num + Double.parseDouble(returnedNumber7);
                    etA7.setText(String.valueOf(A7));
                    etB7.setText(String.valueOf(B7));

                    //8
                    etA8 = (TextView) findViewById(R.id.cgr9c2);
                    etB8 = (TextView) findViewById(R.id.cgr9c3);
                    String s8 = String.valueOf(8);
                    long l8 = Long.parseLong(s8);

                    n.open();
                    String returnedName8 = n.getName(l8);
                    String returnedNumber8 = n.getNumber(l8);
                    n.close();
                    double A8 = num + Double.parseDouble(returnedName8);
                    double B8 = num + Double.parseDouble(returnedNumber8);
                    etA8.setText(String.valueOf(A8));
                    etB8.setText(String.valueOf(B8));

                    //9
                    etA9 = (TextView) findViewById(R.id.cgr10c2);
                    etB9 = (TextView) findViewById(R.id.cgr10c3);
                    String s9 = String.valueOf(9);
                    long l9 = Long.parseLong(s9);

                    n.open();
                    String returnedName9 = n.getName(l9);
                    String returnedNumber9 = n.getNumber(l9);
                    n.close();
                    double A9 = num + Double.parseDouble(returnedName9);
                    double B9 = num + Double.parseDouble(returnedNumber9);
                    etA9.setText(String.valueOf(A9));
                    etB9.setText(String.valueOf(B9));

                    //10
                    etA10 = (TextView) findViewById(R.id.cgr11c2);
                    etB10 = (TextView) findViewById(R.id.cgr11c3);
                    String s10 = String.valueOf(10);
                    long l10 = Long.parseLong(s10);

                    n.open();
                    String returnedName10 = n.getName(l10);
                    String returnedNumber10 = n.getNumber(l10);
                    n.close();
                    double A10 = num + Double.parseDouble(returnedName10);
                    double B10 = num + Double.parseDouble(returnedNumber10);
                    etA10.setText(String.valueOf(A10));
                    etB10.setText(String.valueOf(B10));
                }//end of first radiobutton
else{

                //    Toast.makeText(getBaseContext(), "Loss Checked", Toast.LENGTH_SHORT).show();


                    Newclass n = new Newclass(CouplerGain.this);

                    t1 = (TableLayout) findViewById(R.id.cgtable);
                    //1
                    TableRow tr1 = (TableRow) findViewById(R.id.ctr1);
                    TableRow tr2 = (TableRow) findViewById(R.id.ctr2);

                    etA1 = (TextView) findViewById(R.id.cgr2c2);
                    etB1 = (TextView) findViewById(R.id.cgr2c3);
                    String s = String.valueOf(1);
                    long l = Long.parseLong(s);

                    n.open();
                    String returnedName = n.getName(l);
                    String returnedNumber = n.getNumber(l);
                    n.close();
                    double A1 = num - Double.parseDouble(returnedName);
                    double B1 = num - Double.parseDouble(returnedNumber);
                    etA1.setText(String.valueOf(A1));
                    etB1.setText(String.valueOf(B1));

//2

                    TableRow tr3 = (TableRow) findViewById(R.id.ctr3);

                    etA2 = (TextView) findViewById(R.id.cgr3c2);
                    etB2 = (TextView) findViewById(R.id.cgr3c3);
                    String s2 = String.valueOf(2);
                    long l2 = Long.parseLong(s2);

                    n.open();
                    String returnedName2 = n.getName(l2);
                    String returnedNumber2 = n.getNumber(l2);
                    n.close();
                    double A2 = num - Double.parseDouble(returnedName2);
                    double B2 = num - Double.parseDouble(returnedNumber2);
                    etA2.setText(String.valueOf(A2));
                    etB2.setText(String.valueOf(B2));
//3
                    etA3 = (TextView) findViewById(R.id.cgr4c2);
                    etB3 = (TextView) findViewById(R.id.cgr4c3);
                    String s3 = String.valueOf(3);
                    long l3 = Long.parseLong(s3);

                    n.open();
                    String returnedName3 = n.getName(l3);
                    String returnedNumber3 = n.getNumber(l3);
                    n.close();
                    double A3 = num - Double.parseDouble(returnedName3);
                    double B3 = num - Double.parseDouble(returnedNumber3);
                    etA3.setText(String.valueOf(A3));
                    etB3.setText(String.valueOf(B3));

                    //4
                    etA4 = (TextView) findViewById(R.id.cgr5c2);
                    etB4 = (TextView) findViewById(R.id.cgr5c3);
                    String s4 = String.valueOf(4);
                    long l4 = Long.parseLong(s4);

                    n.open();
                    String returnedName4 = n.getName(l4);
                    String returnedNumber4 = n.getNumber(l4);
                    n.close();
                    double A4 = num - Double.parseDouble(returnedName4);
                    double B4 = num - Double.parseDouble(returnedNumber4);
                    etA4.setText(String.valueOf(A4));
                    etB4.setText(String.valueOf(B4));

                    //5
                    etA5 = (TextView) findViewById(R.id.cgr6c2);
                    etB5 = (TextView) findViewById(R.id.cgr6c3);
                    String s5 = String.valueOf(5);
                    long l5 = Long.parseLong(s5);

                    n.open();
                    String returnedName5 = n.getName(l5);
                    String returnedNumber5 = n.getNumber(l5);
                    n.close();
                    double A5 = num - Double.parseDouble(returnedName5);
                    double B5 = num - Double.parseDouble(returnedNumber5);
                    etA5.setText(String.valueOf(A5));
                    etB5.setText(String.valueOf(B5));

                    //6
                    etA6 = (TextView) findViewById(R.id.cgr7c2);
                    etB6 = (TextView) findViewById(R.id.cgr7c3);
                    String s6 = String.valueOf(6);
                    long l6 = Long.parseLong(s6);

                    n.open();
                    String returnedName6 = n.getName(l6);
                    String returnedNumber6 = n.getNumber(l6);
                    n.close();
                    double A6 = num - Double.parseDouble(returnedName6);
                    double B6 = num - Double.parseDouble(returnedNumber6);
                    etA6.setText(String.valueOf(A6));
                    etB6.setText(String.valueOf(B6));

                    //7
                    etA7 = (TextView) findViewById(R.id.cgr8c2);
                    etB7 = (TextView) findViewById(R.id.cgr8c3);
                    String s7 = String.valueOf(7);
                    long l7 = Long.parseLong(s7);

                    n.open();
                    String returnedName7 = n.getName(l7);
                    String returnedNumber7 = n.getNumber(l7);
                    n.close();
                    double A7 = num - Double.parseDouble(returnedName7);
                    double B7 = num - Double.parseDouble(returnedNumber7);
                    etA7.setText(String.valueOf(A7));
                    etB7.setText(String.valueOf(B7));

                    //8
                    etA8 = (TextView) findViewById(R.id.cgr9c2);
                    etB8 = (TextView) findViewById(R.id.cgr9c3);
                    String s8 = String.valueOf(8);
                    long l8 = Long.parseLong(s8);

                    n.open();
                    String returnedName8 = n.getName(l8);
                    String returnedNumber8 = n.getNumber(l8);
                    n.close();
                    double A8 = num - Double.parseDouble(returnedName8);
                    double B8 = num - Double.parseDouble(returnedNumber8);
                    etA8.setText(String.valueOf(A8));
                    etB8.setText(String.valueOf(B8));

                    //9
                    etA9 = (TextView) findViewById(R.id.cgr10c2);
                    etB9 = (TextView) findViewById(R.id.cgr10c3);
                    String s9 = String.valueOf(9);
                    long l9 = Long.parseLong(s9);

                    n.open();
                    String returnedName9 = n.getName(l9);
                    String returnedNumber9 = n.getNumber(l9);
                    n.close();
                    double A9 = num - Double.parseDouble(returnedName9);
                    double B9 = num - Double.parseDouble(returnedNumber9);
                    etA9.setText(String.valueOf(A9));
                    etB9.setText(String.valueOf(B9));

                    //10
                    etA10 = (TextView) findViewById(R.id.cgr11c2);
                    etB10 = (TextView) findViewById(R.id.cgr11c3);
                    String s10 = String.valueOf(10);
                    long l10 = Long.parseLong(s10);

                    n.open();
                    String returnedName10 = n.getName(l10);
                    String returnedNumber10 = n.getNumber(l10);
                    n.close();
                    double A10 = num - Double.parseDouble(returnedName10);
                    double B10 = num - Double.parseDouble(returnedNumber10);
                    etA10.setText(String.valueOf(A10));
                    etB10.setText(String.valueOf(B10));
                }
            }
        });
    }


}