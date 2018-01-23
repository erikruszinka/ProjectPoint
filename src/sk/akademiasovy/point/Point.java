package sk.akademiasovy.point;

import java.util.Random;

import static java.lang.Math.sqrt;

public class Point implements Geometry {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0,0);

        //x=0;
        //y=0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getQuadrant(){
        if(x>0 && y>0)
            return 1;
        else if(x<0 && y>0)
            return 2;
        else if (x<0 && y<0)
            return 3;
        else if(x>0 && y<0)
            return 4;
        else
            return 0;
    }

    public void generateRandomCoord(){
        Random random = new Random();
        this.x=random.nextInt(41)-20;
        this.y=random.nextInt(41)-20;
    }

    public double getDistance(){
        return sqrt((x*x)+(y*y));
    }
    public double getDistanceFromAnotherPoint(Point other){

        return Math.sqrt(Math.pow(x-other.getX(),2)+Math.pow(y-other.getY(),2));
    }

    public void print(){
        System.out.println("Point x, y: ["+x+","+y+"]; Quadrant: "+getQuadrant()+ "; Distance of x from y: "+getDistance());
    }
    public void doAxialSymmetry(char type)
    {
        if(type=='x'||type=='X')
            x=-x;
        else if(type=='y'||type=='Y')
            y=-y;
    }

    public void doCentralsymmetry(){
        x=-x;
        y=-y;
    }


}
