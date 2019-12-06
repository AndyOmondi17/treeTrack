package com.example.capstone;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;

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


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        mPassword = findViewById(R.id.pswrd);
        mEmail = findViewById(R.id.mail);
        mButton = findViewById(R.id.sin);

        mButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        if (view == mButton) {
            Intent intent = new Intent(Log_In.this, HomePage.class);
            startActivity(intent);
//            finish();
        }
    }


}
