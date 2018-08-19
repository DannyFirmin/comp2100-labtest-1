package me.dannyfeng.labtest1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class Q1View extends View implements View.OnTouchListener {

    float xt = 0.0f;
    float yt = 0.0f;
    ArrayList<Float> x = new ArrayList<>();
    ArrayList<Float> y = new ArrayList<>();

    public Q1View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.setOnTouchListener(this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        p.setStrokeWidth(10.0f);


        for (int i = 0; i < x.size(); i++) {
            canvas.drawCircle(x.get(i), y.get(i), 10, p);
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        xt = motionEvent.getX();
        yt = motionEvent.getY();
        x.add(xt);
        y.add(yt);

        invalidate();
        return true;
    }
}
