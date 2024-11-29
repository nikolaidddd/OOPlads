package hometask03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TriangleUtil {

    public TriangleUtil() {}

    public static void startInit(List<Triangle> triangles){
        // Треугольник №1
        Triangle temp = new Triangle();
        temp.setA(new Point(0,0));
        temp.setB(new Point(6,0));
        temp.setC(new Point(3,5));
        if (!temp.isNotTriangle())
            triangles.add(temp);
        // Треугольник №2
        temp = new Triangle();
        temp.setA(new Point(0,0));
        temp.setB(new Point(0,4));
        temp.setC(new Point(3,2));
        if (!temp.isNotTriangle())
            triangles.add(temp);
        // Треугольник №3
        temp = new Triangle();
        temp.setA(new Point(0,0));
        temp.setB(new Point(10,0));
        temp.setC(new Point(5,10*Math.sin(Math.PI/3)));
        if (!temp.isNotTriangle())
            triangles.add(temp);
        // Треугольник №4
        temp = new Triangle();
        temp.setA(new Point(-7,0));
        temp.setB(new Point(7,0));
        temp.setC(new Point(0,14*Math.sin(Math.PI/3)));
        if (!temp.isNotTriangle())
            triangles.add(temp);
        // Треугольник №5
        temp = new Triangle();
        temp.setA(new Point(0,0));
        temp.setB(new Point(8,0));
        temp.setC(new Point(0,6));
        if (!temp.isNotTriangle())
            triangles.add(temp);
        // Треугольник №6
        temp = new Triangle();
        temp.setA(new Point(-7,0));
        temp.setB(new Point(-3,0));
        temp.setC(new Point(-3,2));
        if (!temp.isNotTriangle())
            triangles.add(temp);
        // Треугольник №7
        temp = new Triangle();
        temp.setA(new Point(0,0));
        temp.setB(new Point(5,2));
        temp.setC(new Point(2,6));
        if (!temp.isNotTriangle())
            triangles.add(temp);
        // Треугольник №8
        temp = new Triangle();
        temp.setA(new Point(-7,-5));
        temp.setB(new Point(-3,4));
        temp.setC(new Point(-2,8));
        if (!temp.isNotTriangle())
            triangles.add(temp);
    }

    // finds triangle in list with max square
    public static Triangle findMaxSTriangle(List<Triangle> triangles) {
        if (triangles.size()>0) {
            Triangle maxS = triangles.get(0);
            for (Triangle triangle : triangles) {
                if (maxS.findSquare()<triangle.findSquare()) {
                    maxS = triangle;
                }
            }
            return maxS;
        }
        else return new Triangle();
    }

    // finds triangle in list with min square
    public static Triangle findMinSTriangle(List<Triangle> triangles) {
        if (triangles.size()>0) {
            Triangle minS = triangles.get(0);
            for (Triangle triangle : triangles) {
                if (minS.findSquare() > triangle.findSquare()) {
                    minS = triangle;
                }
            }
            return minS;
        }
        else return new Triangle();
    }

    // return list of arbitrary triangles
    public static List<Triangle> findArbitrary(List<Triangle> triangles) {
        List<Triangle> res = new ArrayList<>();
        for (Triangle triangle : triangles) {
            if (triangle.isArbitrary()) {
                res.add(triangle);
            }
        }
        return res;
    }

    // return list of rectangular triangles
    public static List<Triangle> findRect(List<Triangle> triangles) {
        List<Triangle> res = new ArrayList<>();
        for (Triangle triangle : triangles) {
            if (triangle.isRect()) {
                res.add(triangle);
            }
        }
        return res;
    }

    // return list of isosceles triangles
    public static List<Triangle> findIsosceles(List<Triangle> triangles) {
        List<Triangle> res = new ArrayList<>();
        for (Triangle triangle : triangles) {
            if (triangle.isIsosceles()) {
                res.add(triangle);
            }
        }
        return res;
    }

    // return list of equilateral triangles
    public static List<Triangle> findEquilateral(List<Triangle> triangles) {
        List<Triangle> res = new ArrayList<>();
        for (Triangle triangle : triangles) {
            if (triangle.isEquilateral()) {
                res.add(triangle);
            }
        }
        return res;
    }

    // inputs points of triangle from keyboard
    public static void inputTriangle(List<Triangle> triangles, Scanner sc) {
        System.out.println("Введите координаты точек треугольника: ");
        System.out.println("Точка A: ");
        Point pA = TriangleUtil.inputPoint(sc);
        System.out.println("Точка B: ");
        Point pB = TriangleUtil.inputPoint(sc);
        System.out.println("Точка C: ");
        Point pC = TriangleUtil.inputPoint(sc);
        try {
            Triangle newTriangle = new Triangle(pA, pB, pC);
            triangles.add(newTriangle);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "Треугольник не создан!");
        }
    }

    // inputs point coordinates from keyboard
    private static Point inputPoint(Scanner sc) {
        System.out.println("Введите координату x: ");
        double x = inputDouble(sc);
        System.out.println("Введите координату y: ");
        double y = inputDouble(sc);
        return new Point(x,y);
    }

    // addes N random triangles to list
    public static void addRandomNTriangles(List<Triangle> triangles, int n) {
        Random rand = new Random();
        int i = 0;
        while (i < n) {
            Point pa = new Point(rand);
            Point pb = new Point(rand);
            Point pc = new Point(rand);
            try {
                Triangle temp = new Triangle(pa, pb, pc);
                i++;
                triangles.add(temp);
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // prints triangle list to console
    public static void output(List<Triangle> triangles, String s) {
        System.out.println(s);
        int k=0;
        for (Triangle triangle : triangles) {
            System.out.println("Треугольник №"+ ++k + ": " +triangle);
        }
    }

    // provides correct input of double
    public static double inputDouble(Scanner sc) {
        double value = 0;
        boolean isNotSuccess = true;
        while (isNotSuccess) {
            try {
                String s = sc.nextLine();
                value = Double.parseDouble(s);
                isNotSuccess = false;
            }
            catch (NumberFormatException e) {
                System.out.println("Ошибка формата ввода! Введите ещё раз:");
            }
        }
        return value;
    }

    // provides correct input of int
    public static int inputInt(Scanner sc) {
        int value = 0;
        boolean isNotSuccess = true;
        while (isNotSuccess) {
            try {
                String s = sc.nextLine();
                value = Integer.parseInt(s);
                isNotSuccess = false;
            }
            catch (NumberFormatException e) {
                System.out.println("Ошибка формата ввода! Введите ещё раз:");
            }
        }
        return value;
    }

    // outputs menu
    public static void viewText() {
        System.out.println("Введите Ваш выбор: ");
        System.out.println("1 - вывести текущий список на экран");
        System.out.println("2 - сгенерировать N новых треугольников");
        System.out.println("3 - добавить в список треугольник вручную");
        System.out.println("4 - вывести количество треугольников по группам (равносторонние " +
                "равнобедренные, прямоугольные, произвольные)");
        System.out.println("5 - для каждой группы найти наибольший треугольник по площади " +
                "(сначала нужно выполнить п. 4)");
        System.out.println("6 - для каждой группы найти наименьший треугольник по площади " +
                "(сначала нужно выполнить п. 4)");
        System.out.println("7 - выход");
    }
}
