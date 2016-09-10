package com.aitians.authentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Output extends AppCompatActivity {

    private TextView mName;
    private TextView mPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String pwd  = intent.getStringExtra("pwd");

        mName = (TextView) findViewById(R.id.textView);
        mPwd  = (TextView) findViewById(R.id.textView2);

        mName.setText(name);
        mPwd.setText(pwd);
    }
}
