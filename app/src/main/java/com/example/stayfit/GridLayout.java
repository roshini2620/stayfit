package com.example.stayfit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class GridLayout extends AppCompatActivity {
    ImageButton image1,image2,image3,image4,image5,image6,image7;
    Button showPopupBtn, closePopupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        //Binds the adapter with recyclerview

        image1=(ImageButton)findViewById(R.id.image1);
        image2=(ImageButton)findViewById(R.id.image2);
        image3=(ImageButton)findViewById(R.id.image3);
        image4=(ImageButton)findViewById(R.id.image4);
        image5=(ImageButton)findViewById(R.id.image5);
        image6=(ImageButton)findViewById(R.id.image6);
        image7=(ImageButton)findViewById(R.id.image7);
        showPopupBtn = (Button) findViewById(R.id.showPopupBtn);

        showPopupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food = new Intent(GridLayout.this,Signin.class);
                startActivity(food);
            }
        });

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food = new Intent(GridLayout.this,FoodLayout.class);
                startActivity(food);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent work = new Intent(GridLayout.this,WorkoutLayout.class);
                startActivity(work);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  bmi = new Intent(GridLayout.this,BMI.class);
                startActivity(bmi);
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  pedo = new Intent(GridLayout.this,Main.class);
                startActivity(pedo);
            }
        });

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  calc = new Intent(GridLayout.this,ApiActivity.class);
                startActivity(calc);
            }
        });

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  rem = new Intent(GridLayout.this,ReminderActivity.class);
                startActivity(rem);
            }
        });

        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  livechat = new Intent(GridLayout.this,Livechat.class);
                startActivity(livechat);
            }
        });



    }
    @Override
    public void onBackPressed() {
        finish();                                                                                   //Makes the user to exit form the app
        super.onBackPressed();

    }

}
