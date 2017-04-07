package com.kingofaustell.whatsyourname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void submit(View view){
        EditText myTextField = (EditText) findViewById(R.id.textField);
        Toast.makeText(getApplicationContext(),"whats up " + myTextField.getText().toString(),Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
