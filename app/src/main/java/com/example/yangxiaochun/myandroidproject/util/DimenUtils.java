package com.example.yangxiaochun.myandroidproject.util;

import android.content.Context;

public class DimenUtils {
    public static int dp2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
