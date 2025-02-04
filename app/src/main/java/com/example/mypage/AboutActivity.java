package com.example.mypage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void openMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openHome(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void openServices(View view) {
        Intent intent = new Intent(this, ServicesActivity.class);
        startActivity(intent);
    }

    public void openContact(View view) {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }
}