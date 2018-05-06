package com.example.asus.third2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;

import android.support.v7.widget.AppCompatButton;

public class Main2Activity extends AppCompatButton {
    public Main2Activity(Context context , AttributeSet set){
        super(context , set);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode , event);
        Log.v("com.sise" , "the onKeyDown in MyButton");
        return true;
    }
}

