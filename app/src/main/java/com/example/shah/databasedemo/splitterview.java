package com.example.shah.databasedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shah on 14/1/15.
 */
public class splitterview  extends Activity implements View.OnClickListener{
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sview);
        TextView tv=(TextView)findViewById(R.id.tinfo);
        Newclass info=new Newclass(this);
        info.open();
        String data=info.getdata1();
        info.close();
       // Toast.makeText(getBaseContext(), " " + data, Toast.LENGTH_SHORT).show();
        tv.setText(data);

        b1=(Button)findViewById(R.id.beditss);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.beditss:
                  Intent i=new Intent(splitterview.this,EditSpiltrstnd.class);
                startActivity(i);

        }

    }

}
