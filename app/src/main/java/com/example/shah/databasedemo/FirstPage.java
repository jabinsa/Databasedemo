package com.example.shah.databasedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by shah on 26/1/15.
 */
public class FirstPage extends Activity implements View.OnClickListener {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page_layout);
        b1=(Button)findViewById(R.id.bsignin);
        b2=(Button)findViewById(R.id.bsignup);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }

    @Override
    public void onClick(View v) {
switch(v.getId()){

    case R.id.bsignin:
        Intent i=new Intent(FirstPage.this,Registration_Page.class);
        startActivity(i);

        break;

    case R.id.bsignup:
       Intent ii=new Intent(FirstPage.this,Login.class);

       startActivity(ii);

        break;
}
    }
}
