package com.temperance2015.morsecode.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.temperance2015.morsecode.R;

/**
 * Created by Isabel on 2015/11/7.
 */
public class StartActivity extends BaseActivity {

    private Button toMor;
    private Button toEn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_layout);
        toMor = (Button) findViewById(R.id.morse);
        toEn = (Button) findViewById(R.id.english);
        toMor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,MorseActivity.class);
                startActivity(intent);
            }
        });
        toEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,EnglishActivity.class);
                startActivity(intent);
            }
        });

    }
}
