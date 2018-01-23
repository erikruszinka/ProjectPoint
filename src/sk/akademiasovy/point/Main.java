package sk.akademiasovy.point;

public class Main {
    public static void main(String[] args) {
        Point p1= new Point(8,12);
        System.out.println("Point p1 is in "+p1.getQuadrant()+" quadrant");
        Point p2 = new Point();
        p2.generateRandomCoord();
        System.out.println("Point p2 is in "+p2.getQuadrant()+" quadrant");
        System.out.println("Distance of "+p1.getDistance()+ " from center");
        System.out.println("Distance of "+p2.getDistance()+ " from center");
        p2.print();

        Point3D p31=new Point3D(8,6,-7);
        Point3D p32=new Point3D();
        p32.generateRandomCoord();
        p31.print();
        p32.print();

        Object o1=new Point();
        Point p3=new Point3D();
        ((Point3D)p3).test();


        Geometry g1;
        g1=new Point(5,9);

        Point3D[] Array= new Point3D[10];

        for( int i=0;i<10;i++)
        {
            Point3D p=new Point3D();
            p.generateRandomCoord();
            Array[i]=p;
            }
            for(Point3D g:Array){
                ((Point3D)g).print();
            }

            Point bod15=new Point(2,5);
            Line line1=new Line(bod15, new Point(10,5));
            Line line2=new Line(1,2,3,4);

            Triangle triangle1= new Triangle(new Point(3,8),new Point(5,6),new Point(3,5));

        System.out.println("Perimeter of triangle1 is "+triangle1.getPerimeter());
        System.out.println("Area of triangle1 is "+triangle1.getArea());
        System.out.println("Is triangle1 equilateral is "+triangle1.isEquilateral());
    }
}
