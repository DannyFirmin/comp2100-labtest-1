package me.dannyfeng.labtest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goQ1 (View view){
        Intent intent = new Intent (this, Q1.class);
        startActivity(intent);
    }
    public void goQ2 (View view){
        Intent intent = new Intent (this, Q2.class);
        startActivity(intent);
    }
    public void goQ3 (View view){
        Intent intent = new Intent (this, Q3.class);
        startActivity(intent);
    }
    public void goQ4 (View view){
        Intent intent = new Intent (this, Q4.class);
        startActivity(intent);
    }
    public void goQ5 (View view){
        Intent intent = new Intent (this, Q5.class);
        startActivity(intent);
    }

}
