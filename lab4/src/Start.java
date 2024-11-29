import javax.swing.*;
import java.awt.*;

public class Start {

    private JFrame f = new JFrame("Лабораторная работа №4");

    private JButton but0 = new JButton("Назад");
    private JButton but1 = new JButton("Окружности");
    private JButton but2 = new JButton("Четырехугольники");
    private JButton but3 = new JButton("Окружность");
    private JButton but4 = new JButton("Эллипс");
    private JButton but5 = new JButton("Четырехугольник");
    private JButton but6 = new JButton("Прямоугольник");
    private JButton but7 = new JButton("Ромб");
    private JButton but8 = new JButton("Трапециия");
    private JButton but9 = new JButton("Создать");
    private JButton but10 = new JButton("Переместить");
    private JButton but11 = new JButton("Удалить");
    private JButton but12 = new JButton("Сделать видимым/невидимым");
    private JButton but13 = new JButton("Изменить радиус");
    private JButton but14 = new JButton("Повернуть на 90");
    private JButton but15 = new JButton("Изменить размер");
    private JButton but16 = new JButton("Массив");

    private JPanel cP = centerPanel();
    private JPanel sP = southPanel();
    private JPanel circle = null;
    private TCircle [] circles = null;
    private JPanel ellipse = null;
    private JPanel quadrangle = null;
    private JPanel rectangle = null;
    private TRectangle [] rectangles = null;
    private JPanel romb = null;
    private JPanel trapeze = null;

    private int numbut, numbut2, ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8 = 0;
    private boolean VISION1 = true, VISION2 = true, VISION3 = true, VISION4 = true, VISION5 = true, VISION6 = true;

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

        //кнопка "Назад"
        but0.addActionListener(e -> {
            sP.removeAll();
            if (numbut2 == 1) {
                sP.add(but1);
                sP.add(but2);
                numbut2=0;
            }
            if (numbut2 == 2) {
                sP.add(but0);
                sP.add(but3);
                sP.add(but4);
                numbut2 = 1;
            }
            if (numbut2 == 3) {
                sP.add(but0);
                sP.add(but5);
                sP.add(but6);
                sP.add(but7);
                sP.add(but8);
                numbut2 = 1;
            }
            if (numbut2 == 21) {
                sP.add(but0);
                sP.add(but9);
                sP.add(but10);
                sP.add(but11);
                sP.add(but12);
                sP.add(but13);
                sP.add(but16);
                numbut = 1;
                numbut2 = 2;
            }
            if (numbut2 == 24) {
                sP.add(but0);
                sP.add(but9);
                sP.add(but10);
                sP.add(but11);
                sP.add(but12);
                sP.add(but15);
                sP.add(but16);
                numbut = 4;
                numbut2 = 3;
            }
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Окружности"
        but1.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but3);
            sP.add(but4);
            numbut2 = 1;
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Четырехугольники"
        but2.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but5);
            sP.add(but6);
            sP.add(but7);
            sP.add(but8);
            numbut2 = 1;
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Окружность"
        but3.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but12);
            sP.add(but13);
            sP.add(but16);
            numbut = 1;
            numbut2 = 2;
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Эллипс"
        but4.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but12);
            sP.add(but14);
            numbut = 2;
            numbut2 = 2;
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Четырехугольник"
        but5.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but12);
            sP.add(but15);
            numbut = 3;
            numbut2 = 3;
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Прямоугольник"
        but6.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but12);
            sP.add(but15);
            sP.add(but16);
            numbut = 4;
            numbut2 = 3;
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Ромб"
        but7.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but12);
            sP.add(but15);
            numbut = 5;
            numbut2 = 3;
            sP.revalidate();
            sP.repaint();
        });
        //кнопка "Трапециия"
        but8.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but12);
            sP.add(but15);
            numbut = 6;
            numbut2 = 3;
            sP.revalidate();
            sP.repaint();
        });

        //кнопка "Массив"
        but16.addActionListener(e -> {
            sP.removeAll();
            sP.add(but0);
            sP.add(but9);
            sP.add(but10);
            sP.add(but11);
            sP.add(but12);
            if (numbut == 1) {
                sP.add(but13); numbut = 11; numbut2 = 21;
                JOptionPane.showMessageDialog(f, "Следующие действия будут выполнены для массива окружностей");
            }
            if (numbut == 4) {
                sP.add(but15); numbut = 14; numbut2 = 24;
                JOptionPane.showMessageDialog(f, "Следующие действия будут выполнены для массива прямоугольников");
            }
            sP.revalidate();
            sP.repaint();
        });

        //кнопка "Создать"
        but9.addActionListener(e -> {
            if (numbut == 1) {
                if (circle == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 300);
                    ch3 = (int) (Math.random() * 200);
                    VISION1 = true;
                    circle = new TCircle(ch1, ch2, ch3, Color.BLACK);
                    ((TCircle) circle).Show(VISION1);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.revalidate();
                } else {
                    JOptionPane.showMessageDialog(f, "Окружность уже нарисована");
                }
            }
            else if (numbut == 11) {
                if (circles == null) {
                    circles = new TCircle[10];
                    VISION2 = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        circles[i] = new TCircle (ch1, ch2, ch3, Color.GREEN);
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
            else if (numbut == 2) {
                if (ellipse == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 300);
                    ch3 = (int) (Math.random() * 200);
                    ch4 = (int) (Math.random() * 100);
                    VISION2 = true;
                    ellipse = new TEllipse(ch1, ch2, ch3, ch4, Color.RED);
                    ((TEllipse) ellipse).Show(VISION2);
                    cP.add(ellipse, BorderLayout.CENTER);
                    cP.revalidate();
                } else {
                    JOptionPane.showMessageDialog(f, "Эллипс уже нарисован");
                }
            }
            else if (numbut == 3) {
                if (quadrangle == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 500);
                    ch3 = (int) (Math.random() * 500);
                    ch4 = (int) (Math.random() * 500);
                    ch5 = (int) (Math.random() * 500);
                    ch6 = (int) (Math.random() * 500);
                    ch7 = (int) (Math.random() * 500);
                    ch8 = (int) (Math.random() * 500);
                    VISION3 = true;
                    quadrangle = new TQuadrangle(ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8, Color.BLACK);
                    ((TQuadrangle) quadrangle).Show(VISION3);
                    cP.add(quadrangle, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Четырехугольник уже нарисован");
                }
            }
            else if (numbut == 4) {
                if (rectangle == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 500);
                    ch3 = 100 + (int) (Math.random() * 500);
                    ch4 = 100 + (int) (Math.random() * 250);
                    VISION4 = true;
                    rectangle = new TRectangle(ch1, ch2, ch3, ch4, Color.BLUE);
                    ((TRectangle) rectangle).Show(VISION4);
                    cP.add(rectangle, BorderLayout.CENTER);
                    cP.revalidate();
                } else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник уже нарисован");
                }
            }
            else if (numbut == 14) {
                if (rectangles == null) {
                    rectangles = new TRectangle[10];
                    VISION3 = true;
                    for (int i=0; i<10; i++) {
                        ch1 = (int) (Math.random() * 300);
                        ch2 = (int) (Math.random() * 300);
                        ch3 = (int) (Math.random() * 300);
                        ch4 = (int) (Math.random() * 300);
                        rectangles[i] = new TRectangle (ch1, ch2, ch3, ch4, Color.RED);
                        System.out.println("Rectangle №" + (i+1));
                        rectangles[i].Show(VISION3);
                        cP.add(rectangles[i], BorderLayout.CENTER);
                        cP.validate();
                        cP.repaint();
                    }
                    cP.revalidate();
                }
            }
            else if (numbut == 5) {
                if (romb == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 500);
                    ch3 = 100 + (int) (Math.random() * 500);
                    ch4 = 100 + (int) (Math.random() * 250);
                    VISION5 = true;
                    romb = new TRomb(ch1, ch2, ch3, ch4, Color.CYAN);
                    ((TRomb) romb).Show(VISION5);
                    cP.add(romb, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Ромб уже нарисован");
                }
            }
            else if (numbut == 6) {
                if (trapeze == null) {
                    ch1 = (int) (Math.random() * 500);
                    ch2 = (int) (Math.random() * 500);
                    ch3 = 100 + (int) (Math.random() * 500);
                    ch4 = 100 + (int) (Math.random() * 250);
                    ch5 = 10 + (int) (Math.random() * 50);
                    VISION6 = true;
                    trapeze = new TTrapeze(ch1, ch2, ch3, ch4, ch5, Color.GREEN);
                    ((TTrapeze) trapeze).Show(VISION6);
                    cP.add(trapeze, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Трапеция уже нарисована");
                }
            }
            ch1 = ch2 = ch3 = ch4 = ch5 = ch6 = ch7 = ch8 = 0;
        });
        //кнопка "Переместить"
        but10.addActionListener(e -> {
            ch1 = -30 + (int) (Math.random() * 100);
            ch2 = -30 + (int) (Math.random() * 100);
            if (numbut == 1) {
                if (circle != null) {
                    ((TCircle) circle).MoveTo(ch1, ch2);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
            else if (numbut == 11) {
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
            else if (numbut == 2) {
                if (ellipse  != null) {
                    ((TEllipse) ellipse ).MoveTo(ch1, ch2);
                    cP.add(ellipse , BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Эллипс не найден");
                }
            }
            else if (numbut == 3) {
                if (quadrangle != null) {
                    ((TQuadrangle) quadrangle).MoveTo(ch1,ch2);
                    cP.add(quadrangle, BorderLayout.CENTER);
                    cP.revalidate();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Четырехугольник не найден");
                }
            }
            else if (numbut == 4) {
                if (rectangle != null) {
                    ((TRectangle) rectangle).MoveTo(ch1, ch2);
                    cP.add(rectangle, BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
            else if (numbut == 14) {
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
            else if (numbut == 5) {
                if (romb != null) {
                    ((TRomb) romb).MoveTo(ch1,ch2);
                    cP.add(romb, BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Ромб не найден");
                }
            }
            else if (numbut == 6) {
                if (trapeze != null) {
                    ((TTrapeze) trapeze).MoveTo(ch1,ch2);
                    cP.add(trapeze, BorderLayout.CENTER);
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Трапеция не найдена");
                }
            }
            ch1 = ch2 = 0;
        });
        //кнопка "Удалить"
        but11.addActionListener(e -> {
            if (numbut == 1) {
                if (circle != null) {
                    cP.remove(circle);
                    ((TCircle) circle).Show(false);
                    circle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
            else if (numbut == 11) {
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
            else if (numbut == 2) {
                if (ellipse  != null) {
                    cP.remove(ellipse);
                    ((TEllipse) ellipse ).Show(false);
                    ellipse  = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Эллипс не найден");
                }
            }
            else if (numbut == 3) {
                if (quadrangle != null) {
                    cP.remove(quadrangle);
                    ((TQuadrangle) quadrangle).Show(false);
                    quadrangle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Четырехугольник не найден");
                }
            }
            else if (numbut == 4) {
                if (rectangle != null) {
                    cP.remove(rectangle);
                    ((TRectangle) rectangle).Show(false);
                    rectangle = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
            else if (numbut == 14) {
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
            else if (numbut == 5) {
                if (romb != null) {
                    cP.remove(romb);
                    ((TRomb) romb).Show(false);
                    romb = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Ромб не найден");
                }
            }
            else if (numbut == 6) {
                if (trapeze != null) {
                    cP.remove(trapeze);
                    ((TTrapeze) trapeze).Show(false);
                    trapeze = null;
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Трапеция не найдена");
                }
            }
        });
        // кнопка "Сделать видимым/невидимым"
        but12.addActionListener(e -> {
            if (numbut == 1) {
                if (circle != null) {
                    VISION1 = !VISION1;
                    ((TCircle) circle).Show(VISION2);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.revalidate(); cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
            else if (numbut == 11) {
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
                    JOptionPane.showMessageDialog(f, "Массив линий не найден");
                }
            }
            else if (numbut == 2) {
                if (ellipse  != null) {
                    VISION2 = !VISION2;
                    ((TEllipse) ellipse ).Show(VISION5);
                    cP.add(ellipse , BorderLayout.CENTER);
                    cP.revalidate(); cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Эллипс не найден");
                }
            }
            else if (numbut == 3) {
                if (quadrangle != null) {
                    VISION3 = !VISION3;
                    ((TQuadrangle) quadrangle).Show(VISION3);
                    cP.add(quadrangle, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Четырехугольник не найден");
                }
            }
            else if (numbut == 4) {
                if (rectangle != null) {
                    VISION4 = !VISION4;
                    ((TRectangle) rectangle).Show(VISION4);
                    cP.add(rectangle, BorderLayout.CENTER);
                    cP.revalidate(); cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
            else if (numbut == 14) {
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
            else if (numbut == 5) {
                if (romb != null) {
                    VISION5 = !VISION5;
                    ((TRomb) romb).Show(VISION5);
                    cP.add(romb, BorderLayout.CENTER);
                    cP.revalidate(); cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Ромб не найден");
                }
            }
            else if (numbut == 6) {
                if (trapeze != null) {
                    VISION6 = !VISION6;
                    ((TTrapeze) trapeze).Show(VISION6);
                    cP.add(trapeze, BorderLayout.CENTER);
                    cP.revalidate(); cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Трапеция не найдена");
                }
            }
        });

        //кнопка "Изменить радиус"
        but13.addActionListener(e -> {
            if (numbut == 1) {
                ch1 = 50 + (int) (Math.random() * 150);
                if (circle != null) {
                    ((TCircle) circle).chRad(ch1);
                    ((TCircle) circle).Show(VISION1);
                    cP.add(circle, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
            else if (numbut == 11) {
                if (circles != null) {
                    for (int i = 0; i < 10; i++) {
                        ch1 = 50 + (int) (Math.random() * 150);
                        circles[i].chRad(ch1);
                        circles[i].Show(VISION2);
                    }
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей не создан");
                }
            }
            ch1 = 0;
        });
        //кнопка "Повернуть на 90"
        but14.addActionListener(e -> {
            if (ellipse  != null) {
                ((TEllipse) ellipse ).Turn();
                ((TEllipse) ellipse ).Show(VISION2);
                cP.add(ellipse , BorderLayout.CENTER);
                cP.revalidate();
                cP.repaint();
            } else {
                JOptionPane.showMessageDialog(f, "Эллипс не найден");
            }
        });
        //кнопка "Изменить размер"
        but15.addActionListener(e -> {
            ch1 = -25 + (int) (Math.random() * 50);
            ch2 = -25 + (int) (Math.random() * 50);
            if (numbut == 3) {
                if (quadrangle != null) {
                    ((TQuadrangle) quadrangle).chSize(ch1,ch2);
                    ((TQuadrangle) quadrangle).Show(VISION3);
                    cP.add(quadrangle, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Четырехугольник не найден");
                }
            }
            else if (numbut == 4) {
                if (rectangle != null) {
                    ((TRectangle) rectangle).chSize(ch1, ch2);
                    ((TRectangle) rectangle).Show(VISION4);
                    cP.add(rectangle, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
            else if (numbut == 14) {
                if (rectangles != null) {
                    for (int i = 0; i < 10; i++) {
                        rectangles[i].chSize(ch1, ch2);
                        rectangles[i].Show(VISION3);
                    }
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Массив Окружностей не создан");
                }
            }
            else if (numbut == 5) {
                if (romb != null) {
                    ((TRomb) romb).chSize(ch1, ch2);
                    ((TRomb) romb).Show(VISION5);
                    cP.add(romb, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Ромб не найден");
                }
            }
            else if (numbut == 6) {
                if (trapeze != null) {
                    ((TTrapeze) trapeze).chSize(ch1, ch2);
                    ((TTrapeze) trapeze).Show(VISION6);
                    cP.add(trapeze, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(f, "Трапеция не найдена");
                }
            }
            ch1 = ch2 = 0;
        });

        return p;
    }

    public static void main (String[] argc) {
        SwingUtilities.invokeLater(Start::new);
    }
}
