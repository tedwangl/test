package com.annaru.wanglei.test;

import android.view.View;
import android.widget.Toast;

public class TestUtil {

    public void onBtnClick(View view){
        Toast.makeText(view.getContext(),"onBtnClick",Toast.LENGTH_SHORT).show();
    }

    public void onTextChanged(CharSequence s, int start, int before, int count){
        System.out.println(s);
    }

}