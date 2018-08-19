package me.dannyfeng.labtest1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class Q2View extends View implements View.OnTouchListener, Runnable {
    Handler timer;
    int count = 10;

    public Q2View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setOnTouchListener(this);
        timer = new Handler();
        timer.postDelayed(this, 1000);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint p = new Paint();
        p.setTextSize(100.0f);
        canvas.drawText("Count Down: " + count, 100, 100, p);
    }

    @Override
    public void run() {

        count--;
        this.invalidate();
        timer.postDelayed(this, 1000);

        if (count <= 0) {
            count = 0;
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        count = 10;
        this.invalidate();
        return true;
    }
}
