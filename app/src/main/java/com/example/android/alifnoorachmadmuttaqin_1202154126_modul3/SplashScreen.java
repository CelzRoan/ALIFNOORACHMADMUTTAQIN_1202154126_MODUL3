package com.example.android.alifnoorachmadmuttaqin_1202154126_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;
    //variabel untuk menentukan durasi splash screen, 5000 = 5 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            //menghandle tindakan untuk halaman selanjutnya
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashScreen.this, Login.class);
                //pindah ke halaman loginActivity
                startActivity(homeIntent);
                //mengaktifkan variabel intent agar berpindah halaman
                finish();

            }
        },SPLASH_TIME_OUT);
        //pindah ke halaman selanjutnya setelah 2 detik
    }
}
