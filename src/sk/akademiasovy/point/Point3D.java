package sk.akademiasovy.point;

import java.util.Random;

import static java.lang.Math.sqrt;

public class Point3D extends Point {


    private int z;

    public int getZ() {
        return z;
    }

    public Point3D(){
        z=0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public double getDistance(){
        return Math.sqrt(getX()*getX()+getY()*getY()+z*z);
    }

public void generateRandomCoord(){
        Random random = new Random();
        this.z=random.nextInt(41)-20;
        super.generateRandomCoord();
}

//public double getDistanceFromAnotherPoint(){
    //return Math.sqrt(Math.pov(getX()-other.getX(),2)+Math.pov(getY()-other.getY(),2)+Math.pov(z-other.getZ(),2));
//}

public double test(){
return 0;
}
}
