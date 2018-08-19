package me.dannyfeng.labtest1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class Q3View extends View {
    public Q3View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        p.setStrokeWidth(10.0f);
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            float x1 = rand.nextInt(this.getWidth()) + 1;
            float y1 = rand.nextInt(this.getHeight()) + 1;
            float x2 = rand.nextInt(this.getWidth()) + 1;
            float y2 = rand.nextInt(this.getHeight()) + 1;
            canvas.drawLine(x1, y1, x2, y2, p);
        }
    }

}
