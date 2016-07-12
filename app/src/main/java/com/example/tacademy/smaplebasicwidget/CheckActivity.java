package com.example.tacademy.smaplebasicwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckActivity extends AppCompatActivity {

    CheckBox checkView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        checkView = (CheckBox)findViewById(R.id.checkBox);

        checkView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckActivity.this, "Toast: "+ isChecked, Toast.LENGTH_SHORT).show();
            }
        });





    }
}
