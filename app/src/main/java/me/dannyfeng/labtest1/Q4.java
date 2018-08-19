package me.dannyfeng.labtest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Q4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
    }

    public void buttionPress(View v) {
        Intent intent = new Intent(this, Q4_2.class);
        EditText et = (EditText) findViewById(R.id.editText);
        String name = et.getText().toString();
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
