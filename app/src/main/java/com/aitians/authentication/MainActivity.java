package com.aitians.authentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Variables
    private Button mButton;
    private EditText mName,mPassword;
    private String name,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton     = (Button)  findViewById(R.id.submit);
        mName       = (EditText)findViewById (R.id.name);
        mPassword   = (EditText)findViewById(R.id.password);


        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                name = mName.getText().toString();
                password = mPassword.getText().toString();
                showOutput(password,name);
            }
        });
    }

    public void showOutput(String pwd , String inName){
        Intent intent = new Intent(this,Output.class);
        intent.putExtra("name",inName);
        intent.putExtra("pwd",pwd);
        startActivity(intent);
    }


}
