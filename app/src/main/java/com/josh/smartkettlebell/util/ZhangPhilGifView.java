package com.josh.smartkettlebell.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.DrawableRes;
import androidx.annotation.RawRes;

import com.josh.smartkettlebell.R;

public class ZhangPhilGifView extends androidx.appcompat.widget.AppCompatImageView {

    private Movie mMovie;
    private long mMovieStart = 0;

    public ZhangPhilGifView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mMovie = Movie.decodeStream(getResources().openRawResource(R.drawable.swing_gif));

    }

    public void setGif(@DrawableRes int id){
        mMovie = Movie.decodeStream(getResources().openRawResource(id));
    }

    @Override
    public void onDraw(Canvas canvas) {

        long now = android.os.SystemClock.uptimeMillis();

        if (mMovieStart == 0) {
            mMovieStart = now;
        }

        if (mMovie != null) {
            int dur = mMovie.duration();

            if (dur == 0) {
                dur = 1000;
            }
            int relTime = (int) ((now - mMovieStart) % dur);
            mMovie.setTime(relTime);
            float mWidth = mMovie.width();
            float mHeight = mMovie.height();
            float r = mWidth/mHeight;
            int cHeight = getMeasuredHeight();
            int cWidth = getMeasuredWidth();
            int real_width = (int) (cHeight*r);
            int real_height = getHeight();

//            System.out.println(cHeight);
//            System.out.println(cWidth);
//            System.out.println(mMovie.height());
//            System.out.println(mMovie.width());
            mMovie.draw(canvas, 0, 0);

            invalidate();
        }
    }
}

//        版权声明：本文为CSDN博主「zhangphil」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/zhangphil/article/details/50441944