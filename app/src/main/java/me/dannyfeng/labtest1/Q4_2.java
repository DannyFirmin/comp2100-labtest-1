package me.dannyfeng.labtest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Q4_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4_2);
        Intent intent = getIntent();
        String info = intent.getStringExtra("name");
        TextView tv = (TextView) findViewById(R.id.textView4);
        tv.setText(info);
    }
}
