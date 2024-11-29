package hometask03;

import java.util.Random;

class Point {
    public static final double MAX = 100;
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Random rand) {
        x = (rand.nextDouble()-0.5)*2*MAX;
        y = (rand.nextDouble()-0.5)*2*MAX;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}

public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private double ab;
    private double bc;
    private double ac;
    public static final double EPS = 1e-6;


    public Triangle(Point a, Point b, Point c) throws IllegalArgumentException {
        ab = findDist(a,b);
        bc = findDist(b,c);
        ac = findDist(a,c);
        boolean isNot = isNotTriangle();
        if (isNot) {
            throw new IllegalArgumentException("Не может быть треугольником! ");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        a = new Point(0,0);
        b = new Point(0,0);
        c = new Point(0,0);
    }

    public boolean isNotTriangle() {
        return (ab > bc + ac || areEqual(ab, bc + ac) ||
                bc > ab + ac || areEqual(bc, ab + ac) ||
                ac > ab + bc || areEqual(ac, ab + bc) ||
                (ab==0 && bc==0 && ac==0));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", c=").append(c);
        sb.append('}');
        return sb.toString();
    }

    private double findDist(Point a, Point b) {
        double dx = b.getX()- a.getX();
        double dy = b.getY()- a.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double findPerimetr() {
        return findDist(a,b) + findDist(b,c) + findDist(c,a);
    }

    public double findSquare() {
        double p = findPerimetr()/2;
        return Math.sqrt(p * (p-ab) * (p-bc) * (p-ac));
    }

    public boolean isEquilateral() { // равносторонний
        return areEqual(ab, bc) && areEqual(bc, ac);
    }

    public boolean isIsosceles() {  // равнобедренный
        return (areEqual(ab, bc) || areEqual(bc, ac) || areEqual(ab, ac)) && (!isEquilateral());
    }

    public boolean isRect() { // прямоугольный
        double x = ab * ab;
        double y = bc * bc;
        double z = ac * ac;
        return (areEqual(x, y+z)) || (areEqual(y, x+z)) || (areEqual(z, x+y));
    }

    public boolean isArbitrary() { // произвольный
        return !isIsosceles() && !isEquilateral() && !isRect();
    }

    private boolean areEqual (double x, double y) {
        return Math.abs(x-y) < EPS;
    }

    public void setA(Point a) {
        this.a = a;
        ab = findDist(a,b);
        ac = findDist(a,c);
    }

    public void setB(Point b) {
        this.b = b;
        ab = findDist(a,b);
        bc = findDist(b,c);
    }

    public void setC(Point c) {
        this.c = c;
        bc = findDist(b,c);
        ac = findDist(a,c);
    }
}
