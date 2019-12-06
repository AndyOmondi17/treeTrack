package com.example.capstone;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Log_In extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG = Log_In.class.getSimpleName();
    private FirebaseAuth mAuth;

//    @BindView(R.id.passwordLoginButton) Button mPasswordLoginButton;
//    @BindView(R.id.emailEditText) EditText mEmailEditText;
//    @BindView(R.id.passwordEditText) EditText mPasswordEditText;
//    @BindView(R.id.registerTextView) TextView mRegisterTextView;

        private Button mButton;
        private EditText mEmail;
        private EditText mPassword;
        private FirebaseAuth.AuthStateListener mAuthListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        mPassword = findViewById(R.id.pswrd);
        mEmail = findViewById(R.id.mail);
        mButton = findViewById(R.id.sin);
        mAuth = FirebaseAuth.getInstance();

        mButton.setOnClickListener(this);
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    Intent intent = new Intent(Log_In.this, HomePage.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();
                }
            }


        };
    }

    @Override
    public void onClick(View view) {
        if (view == mButton) {
            loginWithPassword();
//            Intent intent = new Intent(Log_In.this, HomePage.class);
//            startActivity(intent);
//            finish();
        }
    }

    private void loginWithPassword(){
        String email = mEmail.getText().toString().trim();
        String password = mPassword.getText().toString().trim();
        if (email.equals("")) {
            mEmail.setError("Please enter your email");
            return;
        }
        if (password.equals("")) {
            mPassword.setError("Password cannot be blank");
            return;
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }


}
