package com.example.danie.mydesignedapp32;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginBtn;
    Button registerBtn;
    EditText username;
    EditText password;
    ImageView spaceship;
    Animation myAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        registerBtn = findViewById(R.id.registerBtn);
        myAnimation = AnimationUtils.loadAnimation(this,R.anim.slide_animation);
        spaceship = findViewById(R.id.spaceship);



        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Animation vid knapptryck
                spaceship.startAnimation(myAnimation);

                Toast.makeText(MainActivity.this, "Du har loggat in!", Toast.LENGTH_SHORT).show();

            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Öppnar registeringssidan...", Toast.LENGTH_SHORT).show();
            }
        });



        //Animation lyssnare
        myAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
              //  Toast.makeText(MainActivity.this, "Animation Ended", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }






}
