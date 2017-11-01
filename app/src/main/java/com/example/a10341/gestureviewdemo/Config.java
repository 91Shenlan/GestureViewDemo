package com.example.a10341.gestureviewdemo;

/**
 * Created by jasoncai on 2017/11/1.
 */

public class Config {
//    /row = (int) Math.sqrt(circle_count);
//    column = row;
//    rowBlock = width/ row;
//    columnBlock = height/ column;
////    circleX = rowBlock / 2;
//TypedArray tr = context.obtainStyledAttributes(attrs, R.styleable.MyGestureView);
//    select_color = tr.getColor(R.styleable.MyGestureView_select_color, select_color);
//    circle_count = tr.getInteger(R.styleable.MyGestureView_circle_conut, circle_count);
//    defCircleColor = tr.getColor(R.styleable.MyGestureView_defCirCleColor, defCircleColor);
//    outCircleRadius = tr.getFloat(R.styleable.MyGestureView_outCircleRadius, outCircleRadius);
//    interCircleRadius=tr.getFloat(R.styleable.MyGestureView_interCircleRadius,interCircleRadius);
//    circleY = columnBlock / 2;
    protected int circle_count;
    private int row;
    private int column;
    private float circlrX;
    private float circleY;
    private int defCircleColor;

    public int getCircle_count() {
        return circle_count;
    }

    public void setCircle_count(int circle_count) {
        this.circle_count = circle_count;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public float getCirclrX() {
        return circlrX;
    }

    public void setCirclrX(float circlrX) {
        this.circlrX = circlrX;
    }

    public float getCircleY() {
        return circleY;
    }

    public void setCircleY(float circleY) {
        this.circleY = circleY;
    }
}
