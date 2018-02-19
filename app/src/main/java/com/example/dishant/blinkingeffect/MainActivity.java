package com.example.dishant.blinkingeffect;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    /**
     * Creating TextView and Button object
     */
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");

        
         textView = (TextView) findViewById(R.id.txt);
         button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Declaring Blinking effect method
                 */
                BlinkingEffect();
            }
        });
    }

    /**
     * Creating a new method for the blinking effects animation
     */
        public void BlinkingEffect(){

            ObjectAnimator anim = ObjectAnimator.ofInt(textView,"backgroundColor", Color.GREEN,Color.RED,Color.CYAN,Color.MAGENTA,Color.WHITE);
            anim.setDuration(1200);
            anim.setEvaluator(new ArgbEvaluator());
           anim.setRepeatMode(ValueAnimator.REVERSE);
            anim.setRepeatCount(Animation.INFINITE);
            anim.start();

    }


}
