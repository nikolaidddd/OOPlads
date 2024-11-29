package hometask03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppTriangle {
    public static void main(String[] args) {
        List<Triangle> triangles = new ArrayList<>();
        List<Triangle> equilaterals = new ArrayList<>();
        List<Triangle> isosceles = new ArrayList<>();
        List<Triangle> rects = new ArrayList<>();
        List<Triangle> arbitraries = new ArrayList<>();
        TriangleUtil.startInit(triangles);
        boolean isNeedToRun = true;
        Scanner sc = new Scanner(System.in);
        while (isNeedToRun) {
            try {
                TriangleUtil.viewText();
                String s = sc.nextLine();
                int choice = Integer.parseInt(s);
                switch (choice) {
                    case 1: {
                        String text = "Текущий список треугольников: ";
                        TriangleUtil.output(triangles, text);
                    }
                    break;
                    case 2: {
                        System.out.println("Введите количество новых треугольников: ");
                        int n = TriangleUtil.inputInt(sc);
                        TriangleUtil.addRandomNTriangles(triangles, n);
                    }
                    break;
                    case 3: {
                        TriangleUtil.inputTriangle(triangles, sc);
                    }
                    break;
                    case 4: {

                        equilaterals = TriangleUtil.findEquilateral(triangles);
                        String text = "Cписок равносторонних треугольников: ";
                        TriangleUtil.output(equilaterals, text);
                        System.out.println("Итого " + equilaterals.size() + " равносторонних треугольников");
                        System.out.println();

                        isosceles = TriangleUtil.findIsosceles(triangles);
                        text = "Cписок равнобедренных треугольников: ";
                        TriangleUtil.output(isosceles, text);
                        System.out.println("Итого " + isosceles.size() + " равнобедренных треугольников");
                        System.out.println();

                        rects = TriangleUtil.findRect(triangles);
                        text = "Cписок прямоугольных треугольников: ";
                        TriangleUtil.output(rects, text);
                        System.out.println("Итого " + rects.size() + " прямоугольных треугольников");
                        System.out.println();

                        arbitraries = TriangleUtil.findArbitrary(triangles);
                        text = "Cписок произвольных треугольников: ";
                        TriangleUtil.output(arbitraries, text);
                        System.out.println("Итого " + arbitraries.size() + " произвольных треугольников");
                        System.out.println();
                    }
                    break;
                    case 5: {
                        Triangle maxSEquilateral = TriangleUtil.findMaxSTriangle(equilaterals);
                        if (maxSEquilateral.isNotTriangle()) {
                            System.out.println("Треугольник не найден, т.к. список равносторонних треугольников пуст.");
                        } else {
                            System.out.println("Равносторонний треугольник с максимальной площадью: " +
                                    maxSEquilateral.toString() + ", площадь: " + maxSEquilateral.findSquare());
                        }

                        Triangle maxSIsosceles = TriangleUtil.findMaxSTriangle(isosceles);
                        if (maxSIsosceles.isNotTriangle()) {
                            System.out.println("Треугольник не найден, т.к. список равнобедренных треугольников пуст.");
                        } else {
                            System.out.println("Равнобедренный треугольник с максимальной площадью: " +
                                    maxSIsosceles.toString() + ", площадь: " + maxSIsosceles.findSquare());
                        }

                        Triangle maxSRect = TriangleUtil.findMaxSTriangle(rects);
                        if (maxSRect.isNotTriangle()) {
                            System.out.println("Треугольник не найден, т.к. список прямоугольных треугольников пуст.");
                        } else {
                            System.out.println("Прямоугольный треугольник с максимальной площадью: " +
                                    maxSRect.toString() + ", площадь: " + maxSRect.findSquare());
                        }

                        Triangle maxSArbitrary = TriangleUtil.findMaxSTriangle(arbitraries);
                        if (maxSArbitrary.isNotTriangle()) {
                            System.out.println("Треугольник не найден, т.к. список произвольных треугольников пуст.");
                        } else {
                            System.out.println("Произвольный треугольник с максимальной площадью: " +
                                    maxSArbitrary.toString() + ", площадь: " + maxSArbitrary.findSquare());
                        }
                    }
                    break;
                    case 6: {
                        Triangle minSEquilateral = TriangleUtil.findMinSTriangle(equilaterals);
                        if (minSEquilateral.isNotTriangle()) {
                            System.out.println("Треугольник не найден, т.к. список равносторонних треугольников пуст.");
                        } else {
                            System.out.println("Равносторонний треугольник с минимальной площадью: " +
                                    minSEquilateral.toString() + ", площадь: " + minSEquilateral.findSquare());
                        }

                        Triangle minSIsosceles = TriangleUtil.findMinSTriangle(isosceles);
                        if (minSIsosceles.isNotTriangle()) {
                            System.out.println("Треугольник не найден, т.к. список равнобедренных треугольников пуст.");
                        } else {
                            System.out.println("Равнобедренный треугольник с минимальной площадью: " +
                                    minSIsosceles.toString() + ", площадь: " + minSIsosceles.findSquare());
                        }

                        Triangle minSRect = TriangleUtil.findMinSTriangle(rects);
                        if (minSRect.isNotTriangle()) {
                            System.out.println("Треугольник не найден, т.к. список прямоугольных треугольников пуст.");
                        } else {
                            System.out.println("Прямоугольный треугольник с минимальной площадью: " +
                                    minSRect.toString() + ", площадь: " + minSRect.findSquare());
                        }

                        Triangle minSArbitrary = TriangleUtil.findMinSTriangle(arbitraries);
                        if (minSArbitrary.isNotTriangle()) {
                            System.out.println("Треугольник не найден, т.к. список произвольных треугольников пуст.");
                        } else {
                            System.out.println("Произвольный треугольник с минимальной площадью: " +
                                    minSArbitrary.toString() + ", площадь: " + minSArbitrary.findSquare());
                        }
                    }
                    break;
                    case 7: {
                        isNeedToRun = false;
                    }
                    break;
                    default: {
                        System.out.println("Неправильный ввод! Пожалуйста, повторите.");
                    }
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Ошибка формата ввода!");
            }
        }
        sc.close();
    }
}
