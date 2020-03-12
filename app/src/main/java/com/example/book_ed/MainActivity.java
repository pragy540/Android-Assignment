package com.example.book_ed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logIn(View view){
        //we will handle the click on log in button over here
        //we will build an intent to open another activity
        Intent intent= new Intent(this, secondActivity.class);
        EditText editText1= findViewById(R.id.editText1);
        EditText editText2= findViewById(R.id.editText2);
        TextView textView2= findViewById(R.id.textView2);
        String Id= editText1.getText().toString();
        String password= editText2.getText().toString();
       if(Id.equals("Book")){
            if(password.equals("1234")){
                startActivity(intent);
           }
            else {
                textView2.setText("Password is wrong.");
            }
        }
       else{
           textView2.setText("Invalid ID");
        }
    }
}
