package com.example.book_ed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void lend(View view){
      Intent intent1=new Intent(this, LendActivity.class);
      startActivity(intent1);
    }
    public void borrow(View view){
        Intent intent2=new Intent(this, BorrowActivity.class);
        startActivity(intent2);
    }
}
