package org.example;

public class Square extends Shape{

    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Square(int h, int w){
        height = h;
        width = w;
    }

    @Override
    public double calcArea() {
        return getHeight()*getWidth();
    }

}
