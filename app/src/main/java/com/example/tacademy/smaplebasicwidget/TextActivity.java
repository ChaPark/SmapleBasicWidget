package com.example.tacademy.smaplebasicwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    TextView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        messageView = (TextView)findViewById(R.id.textView);
        messageView.setMovementMethod(LinkMovementMethod.getInstance());

        Button btn = (Button)findViewById(R.id.btn_select);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageView.setSelected(!messageView.isSelected());
            }
        });

        btn = (Button)findViewById(R.id.btn_html);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = getResources().getString(R.string.text_message);
                messageView.setText(Html.fromHtml(text));
            }
        });

        btn = (Button)findViewById(R.id.btn_link);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = getResources().getString(R.string.link_text_auto);
                messageView.setText(Html.fromHtml(text));


            }
        });


    }
}
