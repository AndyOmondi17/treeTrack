package com.example.capstone;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainScreen extends AppCompatActivity implements View.OnClickListener {
//    @BindView(R.id.account) TextView mAccount;
//    @BindView(R.id.sin) TextView mSignIn;

//    @BindView(R.id.signupforfree) TextView mSignUp;
//    @BindView(R.id.sin) TextView mSignIn;
        private TextView mAccount;
        private TextView mSignIn;
        private TextView mSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAccount = (TextView) findViewById(R.id.account);
        mSignIn = (TextView) findViewById(R.id.sin);
        mSignUp = (TextView) findViewById(R.id.signupforfree);
        mSignUp.setOnClickListener(this);
        mSignIn.setOnClickListener(this);
        mAccount.setOnClickListener(this);
//        ButterKnife.bind(this);
    }
    @Override
    public void onClick(View v){
        if(v == mAccount ){
            Intent intent = new Intent(this,Log_In.class);
            startActivity(intent);

        }else if(v == mSignUp) {

            Intent intent = new Intent(this, Sign_Up.class);
            startActivity(intent);

        }else if(v == mSignIn){
            Intent intent = new Intent(this,Log_In.class);
            startActivity(intent);

        }else{}

    }

}
