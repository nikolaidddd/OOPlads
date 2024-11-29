import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Start {

    private JButton but0 = new JButton("Назад");
    private JButton but01 = new JButton("Работа с массивами объектов");
//    private JButton but02 = new JButton("Применить 'Уникальный метод' для всех");

    private JButton but1 = new JButton("Линия");
    private JButton but11 = new JButton("Массив Линий");
    private JButton but2 = new JButton("Окружность");
    private JButton but22 = new JButton("Массив Окружностей");
    private JButton but3 = new JButton("Прямоугольник");
    private JButton but33 = new JButton("Массив Прямоугольников");

    private JButton but4 = new JButton("Создать");
    private JButton but5 = new JButton("Переместить");
    private JButton but6 = new JButton("Удалить");
    private JButton but7 = new JButton("Повернуть на 45");
    private JButton but8 = new JButton("Изменить радиус");
    private JButton but9 = new JButton("Изменить размер");
    private JButton but10 = new JButton("Сделать видимым/невидимым");
    private JPanel cP = centerPanel();
    private JPanel sP = southPanel();
    private JPanel line = null;

    //    private JPanel lines [] = new Line[10];
    public Line [] lines = new Line[10];

    //    Meter[] meteor = new Meteor[10]
//    line2 = null;
    private JPanel circle = null;
    private JPanel rectangle = null;
    public int numbut, nummas, ch1, ch2, ch3, ch4 = 0;
    public int ch01, ch02, ch03, ch04 = 0;
    public int ch11, ch12, ch13, ch14 = 0;
    public int ch21, ch22, ch23, ch24 = 0;
    public boolean VISION = true, VISION2 = true, VISION3 = true;
    public JFrame f = new JFrame("Лаба 1"); //??

    private Start() {                                   //создаем основное окно
        f.setLayout(new BorderLayout()); //??
        f.setSize(1280,680);
        f.add(cP, BorderLayout.CENTER);
        f.add(sP, BorderLayout.SOUTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //??
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
        p.add(but01);
        p.add(but1);
        p.add(but2);
        p.add(but3);

        //кнопка "Действия со всеми объектами"
        but01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sP.remove(but01);
                sP.remove(but1);
                sP.remove(but2);
                sP.remove(but3);
                sP.add(but0);
                p.add(but11);
                p.add(but22);
                p.add(but33);
                sP.revalidate();
                sP.repaint();
            }
        });

//        //кнопка "Применить 'Уникальный метод' для всех"
//        but02.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (line != null || circle != null || rectangle != null) {
//                    ch1 = 50 + (int) (Math.random() * 150);
//                    ch2 = -25 + (int) (Math.random() * 50);
//                    ch3 = -25 + (int) (Math.random() * 50);
//                    if (line != null) {
//                        ((Line) line).Turn();
//                        ((Line) line).Show(VISION);
//                        cP.add(line, BorderLayout.CENTER);
//                    }
//                    if (circle != null) {
//                        ((Circle) circle).chRad(ch1);
//                        ((Circle) circle).Show(VISION2);
//                        cP.add(circle, BorderLayout.CENTER);
//                    }
//                    if (rectangle != null) {
//                        ((Rectangle) rectangle).chSize(ch2, ch3);
//                        ((Rectangle) rectangle).Show(VISION3);
//                        cP.add(rectangle, BorderLayout.CENTER);
//                    }
//                    ch1 = ch2 = ch3 = 0;
//                    cP.revalidate(); cP.repaint();
//                } else {
//                    JOptionPane.showMessageDialog(f, "Ни одна фигура не найдена");
//                }
//            }
//        });

        //кнопка "Линия"
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sP.remove(but01);
                sP.remove(but1);
                sP.remove(but2);
                sP.remove(but3);
                sP.add(but0);
                sP.add(but4);
                sP.add(but5);
                sP.add(but6);
                sP.add(but7);
                sP.add(but10);
                sP.revalidate();
                sP.repaint();
                numbut = 1;
            }
        });
        //кнопка "Массив Линий"
        but11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sP.remove(but01);
                sP.remove(but11);
                sP.remove(but22);
                sP.remove(but33);
                sP.add(but0);
                sP.add(but4);
                sP.add(but5);
                sP.add(but6);
                sP.add(but7);
                sP.add(but10);
                sP.revalidate();
                sP.repaint();
                numbut = 11;
                nummas = 1;
            }
        });
        //кнопка "Окружность"
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sP.remove(but01);
                sP.remove(but1);
                sP.remove(but2);
                sP.remove(but3);
                sP.add(but0);
                sP.add(but4);
                sP.add(but5);
                sP.add(but6);
                sP.add(but8);
                sP.add(but10);
                sP.revalidate();
                sP.repaint();
                numbut = 2;
            }
        });
        //кнопка "Массив Окружностей"
        but22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sP.remove(but01);
                sP.remove(but11);
                sP.remove(but22);
                sP.remove(but33);
                sP.add(but0);
                sP.add(but4);
                sP.add(but5);
                sP.add(but6);
                sP.add(but8);
                sP.add(but10);
                sP.revalidate();
                sP.repaint();
                numbut = 22;
                nummas = 1;
            }
        });
        //кнопка "Прямоугольник"
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sP.remove(but01);
                sP.remove(but1);
                sP.remove(but2);
                sP.remove(but3);
                sP.add(but0);
                sP.add(but4);
                sP.add(but5);
                sP.add(but6);
                sP.add(but9);
                sP.add(but10);
                sP.revalidate();
                sP.repaint();
                numbut = 3;
            }
        });
        //кнопка "Массив Прямоугольников"
        but33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sP.remove(but01);
                sP.remove(but11);
                sP.remove(but22);
                sP.remove(but33);
                sP.add(but0);
                sP.add(but4);
                sP.add(but5);
                sP.add(but6);
                sP.add(but9);
                sP.add(but10);
                sP.revalidate();
                sP.repaint();
                numbut = 33;
                nummas = 1;
            }
        });

        //кнопка "Создать"
        but4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (numbut == 1) {
                    if (line == null) {

                        ch1 = 0 + (int) (Math.random() * 300);
                        ch2 = 0 + (int) (Math.random() * 300);
                        ch3 = 0 + (int) (Math.random() * 300);
                        ch4 = 0 + (int) (Math.random() * 300);
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
                    System.out.println("Создаем Массив Линий");
                    VISION = true;

                    ch01 = 0 + (int) (Math.random() * 300);
                    ch02 = 0 + (int) (Math.random() * 300);
                    ch03 = 0 + (int) (Math.random() * 300);
                    ch04 = 0 + (int) (Math.random() * 300);
                    System.out.println("Коррдинаты " + 1 + "-й линии: " + ch01 + ", " + ch02 + "; " + ch03 + ", "+ ch04 + "; ");
                    lines[0] = new Line (ch01, ch02, ch03, ch04, Color.RED);
                    ((Line) lines[0]).Show(true);

                    cP.add(lines[0]);
                    cP.repaint();
                    cP.revalidate();


                    ch11 = 0 + (int) (Math.random() * 300);
                    ch12 = 0 + (int) (Math.random() * 300);
                    ch13 = 0 + (int) (Math.random() * 300);
                    ch14 = 0 + (int) (Math.random() * 300);
                    System.out.println("Коррдинаты " + 2 + "-й линии: " + ch11 + ", " + ch12 + "; " + ch13 + ", "+ ch14 + "; ");
                    lines[1] = new Line (ch11, ch12, ch13, ch14, Color.RED);
                    ((Line) lines[1]).Show(true);
                    cP.add(lines[1]);
                    cP.repaint();
                    cP.revalidate();


                    ch21 = 0 + (int) (Math.random() * 300);
                    ch22 = 0 + (int) (Math.random() * 300);
                    ch23 = 0 + (int) (Math.random() * 300);
                    ch24 = 0 + (int) (Math.random() * 300);
                    System.out.println("Коррдинаты " + 3 + "-й линии: " + ch21 + ", " + ch22 + "; " + ch23 + ", "+ ch24 + "; ");
                    lines[2] = new Line (ch21, ch22, ch23, ch24, Color.RED);
                    ((Line) lines[2]).Show(true);
                    cP.add(lines[2]);
                    cP.repaint();
                    cP.revalidate();


                }
                else if (numbut == 2) {
                    if (circle == null) {

                        ch1 = 0 + (int) (Math.random() * 300);
                        ch2 = 0 + (int) (Math.random() * 300);
                        ch3 = 0 + (int) (Math.random() * 300);

                        VISION2 = true;
                        circle = new Circle (ch1, ch2, ch3, Color.GREEN);
                        ((Circle) circle).Show(VISION2);
                        cP.add(circle, BorderLayout.CENTER);
                        cP.revalidate();
                    } else {
                        JOptionPane.showMessageDialog(f, "Окружность уже нарисована");
                    }
                } else if (numbut == 3) {
                    if (rectangle == null) {

                        ch1 = 0 + (int) (Math.random() * 300);
                        ch2 = 0 + (int) (Math.random() * 300);
                        ch3 = 0 + (int) (Math.random() * 300);
                        ch4 = 0 + (int) (Math.random() * 300);

                        VISION3 = true;
                        rectangle = new Rectangle (ch1, ch2, ch3, ch4, Color.BLUE);
                        ((Rectangle) rectangle).Show(VISION3);
                        cP.add(rectangle, BorderLayout.CENTER);
                        cP.revalidate();
                    } else {
                        JOptionPane.showMessageDialog(f, "Прямоугольник уже нарисован");
                    }
                }
                ch1 = ch2 = ch3 = ch4 = 0;
            }
        });

        //кнопка "Переместить"
        but5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch1 = -30 + (int) (Math.random() * 100);
                ch2 = -30 + (int) (Math.random() * 100);
                if (numbut == 1) {
                    if (line != null) {
                        ((Line) line).MoveTo(ch1, ch2);
                        ((Line) line).Show(VISION);
                        ch1 = ch2 = 0;
                        cP.add(line, BorderLayout.CENTER);
                        cP.repaint();
                    }
                    else {
                        JOptionPane.showMessageDialog(f, "Линия не найдена");
                    }
                } else if (numbut == 11) {

                    for (int i=0; i<3; i++) {
                        ((Line) lines[i]).MoveTo(ch1, ch2);
                        ((Line) lines[i]).Show(VISION);
                        cP.add(lines[i], BorderLayout.CENTER);
                        cP.repaint();
                    }
                    ch1 = ch2 = 0;
                }


                else if (numbut == 2) {
                    if (circle != null) {
                        ((Circle) circle).MoveTo(ch1, ch2);
                        ((Circle) circle).Show(VISION2);
                        ch1 = ch2 = 0;
                        cP.add(circle, BorderLayout.CENTER);
                        cP.repaint();
                    }
                    else {
                        JOptionPane.showMessageDialog(f, "Окружность не найдена");
                    }
                } else if (numbut == 3) {
                    if (rectangle != null) {
                        ((Rectangle) rectangle).MoveTo(ch1, ch2);
                        ((Rectangle) rectangle).Show(VISION3);
                        ch1 = ch2 = 0;
                        cP.add(rectangle, BorderLayout.CENTER);
                        cP.repaint();
                    }
                    else {
                        JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                    }
                }
            }
        });

        //кнопка "Удалить"
        but6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numbut == 1) {
                    if (line != null) {
                        cP.remove(line);
                        ((Line) line).n = 0;
                        line = null;
                        cP.revalidate();
                        cP.repaint();
                    }
                    else {
                        JOptionPane.showMessageDialog(f, "Линия не найдена");
                    }
                } else if (numbut == 2) {
                    if (circle != null) {
                        cP.remove(circle);
                        ((Circle) circle).n = 0;
                        circle = null;
                        cP.revalidate();
                        cP.repaint();
                    }
                    else {
                        JOptionPane.showMessageDialog(f, "Окружность не найдена");
                    }
                } else if (numbut == 3) {
                    if (rectangle != null) {
                        cP.remove(rectangle);
                        ((Rectangle) rectangle).n = 0;
                        rectangle = null;
                        cP.revalidate();
                        cP.repaint();
                    }
                    else {
                        JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                    }
                }
            }
        });

        //кнопка "Повернуть на 45"
        but7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (line != null) {
                    ((Line) line).Turn();
                    ((Line) line).Show(VISION);
                    cP.add(line, BorderLayout.CENTER);
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Линия не найдена");
                }
            }
        });
        //кнопка "Изменить радиус"
        but8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (circle != null) {
                    ch1 = 50 + (int) (Math.random() * 150);
                    ((Circle) circle).chRad(ch1);
                    ((Circle) circle).Show(VISION2);
                    cP.add(circle, BorderLayout.CENTER);
                    ch1 = 0;
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Окружность не найдена");
                }
            }
        });
        //кнопка "Изменить размер"
        but9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rectangle != null) {
                    ch1 = -25 + (int) (Math.random() * 50);
                    ch2 = -25 + (int) (Math.random() * 50);
                    ((Rectangle) rectangle).chSize(ch1, ch2);
                    ((Rectangle) rectangle).Show(VISION3);
                    cP.add(rectangle, BorderLayout.CENTER);
                    ch1 = ch2 = 0;
                    cP.revalidate();
                    cP.repaint();
                } else {
                    JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                }
            }
        });

        // кнопка "Сделать видимым/невидимым"
        but10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numbut == 1) {
                    if (line != null) {
                        if (VISION == true) { VISION = false; }
                        else {VISION = true;}
                        System.out.println("Видимость: " + VISION);
                        ((Line) line).Show(VISION);
                        cP.add(line, BorderLayout.CENTER);
                        cP.revalidate();
                        cP.repaint();
                    } else {
                        JOptionPane.showMessageDialog(f, "Линия не найдена");
                    }
                } else if (numbut == 2) {
                    if (circle != null) {
                        if (VISION2 == true) { VISION2 = false; }
                        else {VISION2 = true;}
                        System.out.println("Видимость: " + VISION2);
                        ((Circle) circle).Show(VISION2);
                        cP.add(circle, BorderLayout.CENTER);
                        cP.revalidate();
                        cP.repaint();
                    }
                    else {
                        JOptionPane.showMessageDialog(f, "Окружность не найдена");
                    }
                } else if (numbut == 3) {
                    if (rectangle != null) {
                        if (VISION3 == true) { VISION3 = false; }
                        else {VISION3 = true;}
                        System.out.println("Видимость: " + VISION3);
                        ((Rectangle) rectangle).Show(VISION3);
                        cP.add(rectangle, BorderLayout.CENTER);
                        cP.revalidate();
                        cP.repaint();
                    } else {
                        JOptionPane.showMessageDialog(f, "Прямоугольник не найден");
                    }
                }
            }
        });

        //кнопка "Назад"
        but0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sP.remove(but0);
                sP.remove(but4);
                sP.remove(but5);
                sP.remove(but6);
                sP.remove(but7);
                sP.remove(but8);
                sP.remove(but9);
                sP.remove(but10);

                if (nummas == 1) {
                    sP.add(but0);
                    sP.add(but11);
                    sP.add(but22);
                    sP.add(but33);
                    nummas = 0;
                }
                else {
                    sP.remove(but11);
                    sP.remove(but22);
                    sP.remove(but33);
                    sP.add(but01);
                    sP.add(but1);
                    sP.add(but2);
                    sP.add(but3);
                }



                sP.revalidate();
                sP.repaint();
            }
        });
        return p;
    }


    //??
    public static void main (String argc[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Start();
            }
        });
    }
}
