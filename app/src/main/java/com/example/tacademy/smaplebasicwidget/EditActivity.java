package com.example.tacademy.smaplebasicwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity {

    EditText emailView, passView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        emailView = (EditText)findViewById(R.id.emailView);
        passView = (EditText)findViewById(R.id.passView);

        emailView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND){
                    String email = emailView.getText().toString();
                    String pass =  passView.getText().toString();
                    if(Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                        Toast.makeText(EditActivity.this, "send email & password", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                    else{
                        Toast.makeText(EditActivity.this, "incorrect emailadress", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                }
                return false;
            }
        });

    }
}
