package com.company;

public class Circle {

    private double radius;
    private double centerX;
    private double centerY;

    public Circle(double radius, double centerX, double centerY){
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public void setRadius(double radius) {this.radius = radius;}
    public void setCenterX(double centerX) {this.centerX = centerX;}
    public void setCenterY(double centerY) {this.centerY = centerY;}


    public double getRadius() {return radius;}
    public double getCenterX() {return centerX;}
    public double getCenterY() {return centerY;}

    public void computeArea(){
        System.out.println(getRadius()*3.14159*getRadius());
    }
}
