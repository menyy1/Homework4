package com.example.erasable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by manuellopez on 4/5/18.
 */

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.erasable.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view){
        // Do something in response to button
        Intent intent = new Intent(this, MapsActivity.class);
//        EditText editText =(EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
        if(view.getId() == R.id.B_search) {
            EditText address_loc = (EditText) findViewById(R.id.edit_message);
            String location = address_loc.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, location);
            startActivity(intent);
        }
    }

}
