package org.example;

public class Point {
    private int x;
    private int y;

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public double distance(){
        return Math.sqrt((this.x) * (this.x) + (this.y) * (this.y));
    }
    public double distance(Point p){
        return Math.sqrt((this.x  - p.getX()) * (this.x - p.getX()) + (this.y - p.getY()) * (this.y - p.getY()));
    }
    public double distance(int a, int b){
      return Math.sqrt((this.x  - a) * (this.x - a) + (this.y - b) * (this.y - b));
    }
}
