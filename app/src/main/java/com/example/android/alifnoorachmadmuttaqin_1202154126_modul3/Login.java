package com.example.android.alifnoorachmadmuttaqin_1202154126_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText user;
    private EditText pwd;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = findViewById(R.id.user);
        //membuat referensi EditText
        pwd = findViewById(R.id.pwd);
        //membuat referensi EditText
        login = findViewById(R.id.login);
        //membuat referensi button
    }
    public void onClick(View view) {
        //action untuk button login
        if (user.getText().toString().equals("EAD")&& pwd.getText().toString().equals("MOBILE") ) {
            //set password dan username
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show();
            //jika user dan password benar maka muncul toast
            Intent intentlogin = new Intent(this, MainActivity.class);
            //dan melanjutkan ke next activity
            startActivity(intentlogin);
        } else {
            Toast.makeText(this,"Login Gagal", Toast.LENGTH_SHORT).show();
            //jika user dan password salah dan muncul toast gagal login
        }
    }
}