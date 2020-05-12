package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this,Icon_Menu.class);
                    EditText etUserName = (EditText) findViewById(R.id.email);
                    String strUserName = etUserName.getText().toString();

                    if(TextUtils.isEmpty(strUserName)) {
                        etUserName.setError("This field cannot be empty");
                        return;
                    }
                    EditText password = (EditText) findViewById(R.id.password);
                    String pass_check = password.getText().toString();

                    if(TextUtils.isEmpty(pass_check)) {
                        password.setError("This field cannot be empty");
                        return;
                    }
                    startActivity(intent);finish();
                }
                catch (Exception e){}
            }
        });
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }
}
