package com.company;

public class Rectangle {
    private float w, h;

    public Rectangle(float w, float h){
        this.w = w;
        this.h = h;
    }

    public float computeArea(){
        return this.w * this.h;
    }

    public void setW(float w) {
        this.w = w;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getH() {
        return h;
    }

    public float getW() {
        return w;
    }
}
