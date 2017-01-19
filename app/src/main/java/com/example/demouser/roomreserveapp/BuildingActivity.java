package com.example.demouser.roomreserveapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class BuildingActivity extends AppCompatActivity {

        private Button prev_Button, next_Button;

        private Integer[] bImages = {R.drawable.shattuck, R.drawable.clapp, R.drawable.kendade,
                R.drawable.pratt_sum, R.drawable.ciruti };

        private int i = 0;

        private ImageSwitcher imageSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_opt);

        imageSwitcher = ((ImageSwitcher)findViewById(R.id.imageSwithcer));

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setLayoutParams(
                        new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));

                return imageView;
            }
        });

        Animation in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.in);
        Animation out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out);


        prev_Button = ((Button)findViewById(R.id.prevButton));
        next_Button = ((Button)findViewById(R.id.nextButton));

        prev_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( i > 0) {
                    i--;
                    imageSwitcher.setImageResource(bImages[i]);
                }
            }
        });

        next_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if( i < bImages.length - 1){
                        i++;
                        imageSwitcher.setImageResource(bImages[i]);
                }

            }
        });

    }
}
