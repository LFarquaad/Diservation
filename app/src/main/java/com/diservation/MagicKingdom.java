package com.diservation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MagicKingdom extends AppCompatActivity implements Park {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic_kingdom);
        setTitle("Magic Kingdom");
    }


}