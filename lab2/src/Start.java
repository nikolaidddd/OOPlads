import javax.swing.*;
import java.awt.*;

public class Start {

    private JFrame f = new JFrame("Лабораторная работа №2");

    private JButton but0 = new JButton("Назад");
    private JButton but1 = new JButton("Линия");
    private JButton but2 = new JButton("Окружность");
    private JButton but3 = new JButton("Прямоугольник");
    private JButton but4 = new JButton("Треугольник");
    private JButton but5 = new JButton("Кольцо");
    private JButton but6 = new JButton("Создать");
    private JButton but7 = new JButton("Переместить");
    private JButton but8 = new JButton("Удалить");
    private JButton but9 = new JButton("Повернуть на 45");
    private JButton but10 = new JButton("Изменить радиус");
    private JButton but11 = new JButton("Изменить размер");
    private JButton but12 = new JButton("Сделать видимым/невидимым");
    private JButton but13 = new JButton("Массив");

    private JPanel cP = centerPanel();
    private JPanel sP = southPanel();
    private JPanel line = null;
    private Line [] lines = null;
    private JPanel circle = null;
    private Circle [] circles = null;
    private JPanel rectangle = null;
    private Rectangle [] rectangles = null;
    private JPanel triangle = null;
    private Triangle [] triangles = null;
    private JPanel ring = null;
    private int numbut, ch1, ch2, ch3, ch4, ch5 = 0;
    private boolean VISION = true, VISION2 = true, VISION3 = true, VISION4 = true, VISION5 = true;

    private Start() {                                   //создаем основное окно
        f.setLayout(new BorderLayout());
        f.setSize(1280,680);
        f.add(cP, BorderLayout.CENTER);
        f.add(sP, BorderLayout.SOUTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    //панель с рисунками
    private JPanel centerPanel () {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setBackground(Color.white);
        return p;
    }

    //панель с кнопками
    private JPanel southPanel () {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.setBackground(Color.GRAY);
        p.add(but1);
        p.add(but2);
        p.add(but3);
        p.add(but4);
        p.add(but5);

        //кнопка "Назад"
        but0.addActionListener(e -> {
            if (numbut == 1 || numbut == 2 || numbut == 3 || numbut == 4 || numbut == 5) {
                sP.removeAll();
                sP.add(but1);
                sP.add(but2);
                sP.add(but3);
                sP.add(but4);
                sP.add(but5);
            }
            if (numbut == 11 || numbut == 12 || numbut == 13 || numbut == 14) {
                if (numbut == 11) { sP.add(but9); numbut = 1;}
                if (numbut == 12) { sP.add(but10); numbut = 2;}
                if (numbut == 13) { sP.add(but11);numbut = 3;}
                if (numbut == 14) { sP.add(but11);numbut = 4;}
                sP.add(but13);
            }
            sP.revalidate();
            sP.repaint();
        });

        //кнопка "Линия"
        but1.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but6);
            sP.add(but7);
            sP.add(but8);
            sP.add(but9);
            sP.add(but12);
            sP.add(but13);
            sP.revalidate();
            sP.repaint();
            numbut = 1;
        });
        //кнопка "Окружность"
        but2.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but6);
            sP.add(but7);
            sP.add(but8);
            sP.add(but10);
            sP.add(but12);
            sP.add(but13);
            sP.revalidate();
            sP.repaint();
            numbut = 2;
        });
        //кнопка "Прямоугольник"
        but3.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but6);
            sP.add(but7);
            sP.add(but8);
            sP.add(but11);
            sP.add(but12);
            sP.add(but13);
            sP.revalidate();
            sP.repaint();
            numbut = 3;
        });
        //кнопка "Треугольник"
        but4.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but6);
            sP.add(but7);
            sP.add(but8);
            sP.add(but11);
            sP.add(but12);
            sP.add(but13);
            sP.revalidate();
            sP.repaint();
            numbut = 4;
        });
        //кнопка "Кольцо"
        but5.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but6);
            sP.add(but7);
            sP.add(but8);
            sP.add(but10);
            sP.add(but12);
            sP.revalidate();
            sP.repaint();
            numbut = 5;
        });

        //кнопка "Массив"
        but13.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but6);
            sP.add(but7);
            sP.add(but8);
            sP.add(but12);
            if (numbut == 1 ) {
                sP.add(but9); numbut = 11;
                JOptionPane.showMessageDialog(f, "Следующие действия будут выполнены для массива линий");
            }
            if (numbut == 2 ) {
                sP.add(but10); numbut = 12;
                JOptionPane.showMessageDialog(f, "Следующие действия будут выполнены для массива окружностей");
            }
            if (numbut == 3 ) {
                sP.add(but11); numbut = 13;
                JOptionPane.showMessageDialog(f, "Следующие действия будут выполнены для массива прямоугольников");
            }
            if (numbut == 4 ) {
                sP.add(but11); numbut = 14;
                JOptionPane.showMessageDialog(f, "Следующие действия будут выполнены для массива треугольников");
            }
            sP.revalidate();
            sP.repaint();
        });

        //кнопка "Создать"
        but6.addActionListener(e -> {
            if (numbut == 1) {
                if (line == null) {
                    ch1 = 100 + (int) (Math.random() * 800);
                    ch2 = 100 + (int) (Math.random() * 400);
                    ch3 = 100 + (int) (Math.random() * 800);
                    ch4 = 100 + (int) (Math.random() * 400);
                    VISION = true;
                    line = new Line (ch1, ch2, ch3, ch4, Color.RED);
                    ((Line) line).Show(VISION);
                    cP.add(line, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Линия уже нарисована");
                }
            }
            else if (numbut == 11) {
                if (lines == null) {
                    lines = new Line[10];
                    VISION = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        ch4 = (int) (Math.random() * 300);
                        lines[i] = new Line (ch1, ch2, ch3, ch4, Color.RED);
                        System.out.println("Line №" + (i+1) + " координаты:: " + ch1 +", "+ ch2 +", "+ ch3 +", "+ ch4);
                        lines[i].Show(VISION);
                        cP.add(lines[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив линий уже создан");
                }
            }
            else if (numbut == 2) {
                if (circle == null) {
                    ch1 = 100 + (int) (Math.random() * 800);
                    ch2 = 100 + (int) (Math.random() * 400);
                    ch3 = 100 + (int) (Math.random() * 400);
                    VISION2 = true;
                    circle = new Circle (ch1, ch2, ch3, Color.GREEN);
                    ((Circle) circle).Show(VISION2);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.revalidate();
                } else {
                    JOptionPane.showMessageDialog(f, "Окружность уже нарисована");
                }
            }
            else if (numbut == 12) {
                if (circles == null) {
                    circles = new Circle[10];
                    VISION2 = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        circles[i] = new Circle (ch1, ch2, ch3, Color.GREEN);
                        System.out.println("Circle №" + (i+1) + " координаты центра:: " + ch1 +", "+ ch2 +", диаметр:"+ ch3);
                        circles[i].Show(VISION2);
                        cP.add(circles[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей уже создан");
                }
            }
            else if (numbut == 3) {
                if (rectangle == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 500);
                    ch3 = 100 + (int) (Math.random() * 500);
                    ch4 = 100 + (int) (Math.random() * 250);
                    VISION3 = true;
                    rectangle = new Rectangle (ch1, ch2, ch3, ch4, Color.BLUE);
                    ((Rectangle) rectangle).Show(VISION3);
                    cP.add(rectangle, BorderLayout.CENTER);
                    cP.revalidate();
                } else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник уже нарисован");
                }
            }
            else if (numbut == 13) {
                if (rectangles == null) {
                    rectangles = new Rectangle[10];
                    VISION3 = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        ch4 = (int) (Math.random() * 300);
                        rectangles[i] = new Rectangle (ch1, ch2, ch3, ch4, Color.BLUE);
                        System.out.println("Rectangle №" + (i+1) + " координаты начальной точки: " + ch1 +", "+ ch2 +", длина:"+ ch3 + ", ширина:"+ ch4);
                        rectangles[i].Show(VISION3);
                        cP.add(rectangles[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Прямоугольников уже создан");
                }
            }
            else if (numbut == 4) {
                if (triangle == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 500);
                    ch3 = 100 + (int) (Math.random() * 500);
                    ch4 = 100 + (int) (Math.random() * 250);
                    ch5 = (int) (Math.random() * 500);
                    VISION4 = true;
                    triangle = new Triangle(ch1, ch2, ch3, ch4, ch5, Color.BLACK);
                    ((Triangle) triangle).Show(VISION4);
                    cP.add(triangle, BorderLayout.CENTER);
                    cP.revalidate();
                } else {
                    JOptionPane.showMessageDialog(f, "Треугольник уже нарисован");
                }
            }
            else if (numbut == 14) {
                if (triangles == null) {
                    triangles = new Triangle[10];
                    VISION4 = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        ch4 = (int) (Math.random() * 300);
                        ch5 = (int) (Math.random() * 300);
                        triangles[i] = new Triangle(ch1, ch2, ch3, ch4, ch5, Color.BLACK);
                        System.out.println("Triangle №" + (i+1));
                        triangles[i].Show(VISION4);
                        cP.add(triangles[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Прямоугольников уже создан");
                }
            }
            else if (numbut == 5) {
                if (ring == null) {
                    ch1 = 100 + (int) (Math.random() * 800);
                    ch2 = 100 + (int) (Math.random() * 400);
                    ch3 = 100 + (int) (Math.random() * 400);
                    VISION5 = true;
                    ring  = new Ring(ch1, ch2, ch3, Color.BLACK);
                    ((Ring) ring).Show(VISION5);
                    cP.add(ring, BorderLayout.CENTER);
                    cP.revalidate();
                } else {
                    JOptionPane.showMessageDialog(f, "Кольцо уже нарисовано");
                }
            }
            ch1 = ch2 = ch3 = ch4 = ch5 = 0;
        });
        //кнопка "Переместить"
        but7.addActionListener(e -> {
            ch1 = -30 + (int) (Math.random() * 100);
            ch2 = -30 + (int) (Math.random() * 100);
            if (numbut == 1) {
                if (line != null) {
                    ((Line) line).MoveTo(ch1, ch2);
                    ((Line) line).Show(VISION);
                    cP.add(line, BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Линия не найдена");
                }
            }
            else if (numbut == 11) {
                if (lines != null) {
                    for (int i=0; i<10; i++) {
                        lines[i].MoveTo(ch1, ch2);
                        lines[i].Show(VISION);
                        cP.repaint();
                        System.out.println("перемещение Линии №" + (i+1));
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив линий не найден");
                }
            }
            else if (numbut == 2) {
                if (circle != null) {
                    ((Circle) circle).MoveTo(ch1, ch2);
                    ((Circle) circle).Show(VISION2);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
            else if (numbut == 12) {
                if (circles != null) {
                    for (int i=0; i<10; i++) {
                        circles[i].MoveTo(ch1, ch2);
                        circles[i].Show(VISION2);
                        cP.repaint();
                        System.out.println("перемещение Окружности №" + (i+1));
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив окружностей не найден");
                }
            }
            else if (numbut == 3) {
                if (rectangle != null) {
                    ((Rectangle) rectangle).MoveTo(ch1, ch2);
                    ((Rectangle) rectangle).Show(VISION3);
                    cP.add(rectangle, BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
            else if (numbut == 13) {
                if (rectangles != null) {
                    for (int i=0; i<10; i++) {
                        rectangles[i].MoveTo(ch1, ch2);
                        rectangles[i].Show(VISION3);
                        cP.repaint();
                        System.out.println("перемещение Прямоугольника №" + (i+1));
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Прямоугольников не найден");
                }
            }
            else if (numbut == 4) {
                if (triangle != null) {
                    ((Triangle) triangle).MoveTo(ch1, ch2);
                    ((Triangle) triangle).Show(VISION4);
                    cP.add(triangle, BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Треугольник не найден");
                }
            }
            else if (numbut == 14) {
                if (triangles != null) {
                    for (int i=0; i<10; i++) {
                        triangles[i].MoveTo(ch1, ch2);
                        triangles[i].Show(VISION3);
                        cP.repaint();
                        System.out.println("перемещение Треугольника №" + (i+1));
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Треугольников не найден");
                }
            }
            else if (numbut == 5) {
                if (ring != null) {
                    ((Ring) ring).MoveTo(ch1, ch2);
                    ((Ring) ring).Show(VISION5);
                    cP.add(ring, BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Кольцо не найдено");
                }
            }
            ch1 = ch2 = 0;
        });
        //кнопка "Удалить"
        but8.addActionListener(e -> {
            if (numbut == 1) {
                if (line != null) {
                    cP.remove(line);
                    ((Line) line).Show(false);
                    line = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Линия не найдена");
                }
            }
            else if (numbut == 11) {
                if (lines != null) {
                    for (int i=0; i<10; i++) {
                        cP.remove(lines[i]);
                        lines[i].Show(false);
                    }
                    lines = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив линий не найден");
                }
            }
            else if (numbut == 2) {
                if (circle != null) {
                    cP.remove(circle);
                    ((Circle) circle).Show(false);
                    circle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
            else if (numbut == 12) {
                if (circles != null) {
                    for (int i=0; i<10; i++) {
                        cP.remove(circles[i]);
                        circles[i].Show(false);
                    }
                    circles = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей не найден");
                }
            }
            else if (numbut == 3) {
                if (rectangle != null) {
                    cP.remove(rectangle);
                    ((Rectangle) rectangle).Show(false);
                    rectangle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
            else if (numbut == 13) {
                if (rectangles != null) {
                    for (int i=0; i<10; i++) {
                        cP.remove(rectangles[i]);
                        rectangles[i].Show(false);
                    }
                    rectangles = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Прямоугольников не найден");
                }
            }
            else if (numbut == 4) {
                if (triangle != null) {
                    cP.remove(triangle);
                    ((Triangle) triangle).Show(false);
                    triangle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Треугольник не найден");
                }
            }
            else if (numbut == 14) {
                if (triangles != null) {
                    for (int i=0; i<10; i++) {
                        cP.remove(triangles[i]);
                        triangles[i].Show(false);
                    }
                    triangles = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Треугольников не найден");
                }
            }
            else if (numbut == 5) {
                if (ring != null) {
                    cP.remove(ring);
                    ((Ring) ring).Show(false);
                    ring = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Кольцо не найдено");
                }
            }
        });

        //кнопка "Повернуть на 45"
        but9.addActionListener(e -> {
            if (numbut == 1) {
                if (line != null) {
                    ((Line) line).Turn();
                    ((Line) line).Show(VISION);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Линия не найдена");
                }
            }
            else if (numbut == 11) {
                if (lines != null) {
                    for (int i = 0; i < 10; i++) {
                        lines[i].Turn();
                        lines[i].Show(VISION);
                    }
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Массив не создан");
                }
            }
        });

        //кнопка "Изменить радиус"
        but10.addActionListener(e -> {
            if (numbut == 2) {
                ch1 = 50 + (int) (Math.random() * 150);
                if (circle != null) {
                    ((Circle) circle).chRad(ch1);
                    ((Circle) circle).Show(VISION2);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
            else if (numbut == 12) {
                if (circles != null) {
                    for (int i = 0; i < 10; i++) {
                        ch1 = 50 + (int) (Math.random() * 150);
                        circles[i].chRad(ch1);
                        circles[i].Show(VISION2);
                        cP.repaint();
                    }
                    cP.revalidate();

                } else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей не создан");
                }
            }
            else if (numbut == 5) {
                ch1 = (int) (Math.random() * 150);
                if (ring != null) {
                    ((Ring) ring).chRad(ch1);
                    ((Ring) ring).Show(VISION5);
                    cP.add(ring, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Кольцо не найдено");
                }
            }
            ch1 = 0;
        });
        //кнопка "Изменить размер"
        but11.addActionListener(e -> {
            ch1 = -25 + (int) (Math.random() * 50);
            ch2 = -25 + (int) (Math.random() * 50);
            if (numbut == 3) {
                if (rectangle != null) {
                    ((Rectangle) rectangle).chSize(ch1, ch2);
                    ((Rectangle) rectangle).Show(VISION3);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
            else if (numbut == 13) {
                if (rectangles != null) {
                    for (int i = 0; i < 10; i++) {
                        rectangles[i].chSize(ch1, ch2);
                        rectangles[i].Show(VISION3);
                        cP.revalidate();
                        cP.repaint();
                    }
                } else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей не создан");
                }
            }
            else if (numbut == 4) {
                if (triangle != null) {
                    ((Triangle) triangle).chSize(ch1, ch2);
                    ((Triangle) triangle).Show(VISION4);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Треугольник не найден");
                }
            }
            else if (numbut == 14) {
                if (triangles != null) {
                    for (int i = 0; i < 10; i++) {
                        triangles[i].chSize(ch1, ch2);
                        triangles[i].Show(VISION4);
                    }
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей не создан");
                }
            }
            ch1 = ch2 = 0;
        });

        // кнопка "Сделать видимым/невидимым"
        but12.addActionListener(e -> {
            if (numbut == 1) {
                if (line != null) {
                    VISION = !VISION;
                    System.out.println("Видимость: " + VISION);
                    ((Line) line).Show(VISION);
                    cP.revalidate(); cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Линия не найдена");
                }
            }
            else if (numbut == 11) {
                if (lines != null) {
                    VISION = !VISION;
                    System.out.println("Видимость: " + VISION);
                    for (int i=0; i<10; i++) {
                        lines[i].Show(VISION);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив линий не найден");
                }
            }
            else if (numbut == 2) {
                if (circle != null) {
                    VISION2 = !VISION2;
                    System.out.println("Видимость: " + VISION2);
                    ((Circle) circle).Show(VISION2);
                    cP.revalidate(); cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
            else if (numbut == 12) {
                if (circles != null) {
                    VISION2 = !VISION2;
                    System.out.println("Видимость: " + VISION2);
                    for (int i=0; i<10; i++) {
                        circles[i].Show(VISION2);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей не найден");
                }
            }
            else if (numbut == 3) {
                if (rectangle != null) {
                    VISION3 = !VISION3;
                    System.out.println("Видимость: " + VISION3);
                    ((Rectangle) rectangle).Show(VISION3);
                    cP.revalidate(); cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
            else if (numbut == 13) {
                if (rectangles != null) {
                    VISION3 = !VISION3;
                    System.out.println("Видимость: " + VISION3);
                    for (int i=0; i<10; i++) {
                        rectangles[i].Show(VISION3);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Прямоугольников не найден");
                }
            }
            else if (numbut == 4) {
                if (triangle != null) {
                    VISION4 = !VISION4;
                    System.out.println("Видимость: " + VISION4);
                    ((Triangle) triangle).Show(VISION4);
                    cP.revalidate(); cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Треугольник не найден");
                }
            }
            else if (numbut == 14) {
                if (triangles != null) {
                    VISION4 = !VISION4;
                    System.out.println("Видимость: " + VISION4);
                    for (int i=0; i<10; i++) {
                        triangles[i].Show(VISION4);
                        cP.repaint();
                    }
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Массив Треугольников не найден");
                }
            }
            else if (numbut == 5) {
                if (ring != null) {
                    VISION5 = !VISION5;
                    System.out.println("Видимость: " + VISION5);
                    ((Ring) ring).Show(VISION5);
                    cP.add(ring, BorderLayout.CENTER);
                    cP.revalidate(); cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Кольцо не найдено");
                }
            }
        });

        return p;
    }

    public static void main (String[] argc) {
        SwingUtilities.invokeLater(Start::new);
    }
}
