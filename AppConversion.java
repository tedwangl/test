package com.annaru.wanglei.test;

import android.databinding.BindingConversion;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/**
 * Created by wanglei on 2018/2/27.
 */

public class AppConversion {

    @BindingConversion
    public static Drawable color2Drawable(String color){
        return new ColorDrawable(Color.parseColor(color));
    }
}
