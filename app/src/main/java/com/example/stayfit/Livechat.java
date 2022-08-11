package com.example.stayfit;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import im.crisp.client.ChatActivity;
import im.crisp.client.Crisp;

public class Livechat extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Crisp.configure(getApplicationContext(), "4c0c6ac0-f99e-48df-9bbf-c9ecae25a047");
        Intent crispIntent = new Intent(this, ChatActivity.class);
        startActivity(crispIntent);
    }
}
