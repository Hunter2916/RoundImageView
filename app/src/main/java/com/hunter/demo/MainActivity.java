package com.hunter.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.hunter.roundimageview.RoundImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RoundImageView r2 = findViewById(R.id.r2);

        RequestOptions requestOptions = new RequestOptions()
                .override(100,100); //override指定加载图片大小

        Glide.with(this)
                .load(R.drawable.move)
                .apply(requestOptions)
                .transform(new RoundedCorners(1))
                .into(r2);
    }
}
