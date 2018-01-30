package sk.akademiasovy.point;

public class Triangle implements InterfaceTriangle{

    private Point a;
    private Point b;
    private Point c;
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSideA(){
        return b.getDistanceFromAnotherPoint(c);
    }
    public double getSideB(){
        return c.getDistanceFromAnotherPoint(a);
    }
    public double getSideC(){
        return a.getDistanceFromAnotherPoint(b);
    }

    public double getPerimeter(){
        return getSideA()+getSideB()+getSideC();
    }

    @Override
    public double getArea() {
        double s=getPerimeter()/2;
        double area=Math.sqrt(s*(s-getSideA())*(s-getSideB())*(s-getSideC()));
        return area;
    }

    @Override
    public boolean isRectangular() {
        double A=c.getDistanceFromAnotherPoint(b);
        double B=a.getDistanceFromAnotherPoint(c);
        double C=a.getDistanceFromAnotherPoint(b);
        if((C*C)==(A*A)+(B*B)){
            return true;
        }
        if((B*B)==(A*A)+(C*C)){
            return true;
        }
        if((A*A)==(B*B)+(C*C)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isEquilateral() {
        double sideA=c.getDistanceFromAnotherPoint(b);
        double sideB=a.getDistanceFromAnotherPoint(c);
        double sideC=a.getDistanceFromAnotherPoint(b);
        if((sideA==sideB)&&(sideB==sideC)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isIsosceles() {
        return getSideA()==getSideB() || getSideB()==getSideC() || getSideC()==getSideA();
    }

    //public double getArea(){

    //}
}
