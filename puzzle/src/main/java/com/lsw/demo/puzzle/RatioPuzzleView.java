package com.lsw.demo.puzzle;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Create by liushuwei on 2020/12/16
 */
public class RatioPuzzleView extends PuzzleView {
  public RatioPuzzleView(Context context) {
    super(context);
  }

  public RatioPuzzleView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public RatioPuzzleView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    int width = getMeasuredWidth();
    int height = (width * 4) / 3;
    setMeasuredDimension(width, height);
  }
}
