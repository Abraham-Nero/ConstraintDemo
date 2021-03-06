package com.nero.constraintdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;

import com.nero.constraintdemo.IdUtils;

public class MyImageView extends android.support.v7.widget.AppCompatImageView implements LogableView{
    String TYPE = "ImageView";
    public MyImageView(Context context) {
        super(context);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(MEASURE, TYPE+": "+IdUtils.getInstance().id2str(getId()));
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.e(LAYOUT, TYPE+": "+IdUtils.getInstance().id2str(getId()));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e(DRAW, TYPE+": "+IdUtils.getInstance().id2str(getId()));
    }
}
