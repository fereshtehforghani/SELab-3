package com.company;

public class Square extends Rectangle{
    Square(float a){
        super(a, a);
    }

    public void setA(float w) {
        this.setW(w);
    }
    public float getA() {
        return this.getW();
    }

    public float computeArea(){
        return super.computeArea();
    }

    public void setW(float w) {
        this.w = w;
        this.h = w;
    }

    public void setH(float h) {
        this.h = h;
        this.w = h;
    }

}
