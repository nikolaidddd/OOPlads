import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ContMassive {

    // number == 1 -> Окружность
    // number == 2 -> Эллипс
    // number == 3 -> Четырехугольник
    // number == 4 -> Прямоугольник
    // number == 5 -> Ромб
    // number == 6 -> Трапециия

    private static ArrayList<JPanel> Figure = new ArrayList();
    private int x,y,r,w,h,c,x1, y1, x2, y2, x3, y3, x4, y4;
    protected Color color;

    public void Iterrator (int i, int number){
        //Окружность
        if (number == 1) {
            x = (int) (Math.random() * 500);
            y = (int) (Math.random() * 300);
            r = (int) (Math.random() * 200);
            color = Color.BLACK;
            Figure.add(i, new TCircle(x, y, r, color));
        }
        //Эллипс
        if (number == 2) {
            x = (int) (Math.random() * 500);
            y = (int) (Math.random() * 300);
            w = (int) (Math.random() * 200);
            h = (int) (Math.random() * 100);
            color = Color.RED;
            Figure.add(i,new TEllipse(x, y, w, h, color));
        }
        //Четырехугольник
        if (number == 3) {
            x1 = (int) (Math.random() * 500);
            y1 = (int) (Math.random() * 500);
            x2 = (int) (Math.random() * 500);
            y2 = (int) (Math.random() * 500);
            x3 = (int) (Math.random() * 500);
            y3 = (int) (Math.random() * 500);
            x4 = (int) (Math.random() * 500);
            y4 = (int) (Math.random() * 500);
            color = Color.BLACK;
            Figure.add(i,new TQuadrangle(x1, y1, x2, y2, x3, y3, x4, y4, color));
        }
        //Прямоугольник
        if (number == 4) {
            x = (int) (Math.random() * 500);
            y = (int) (Math.random() * 500);
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            color = Color.BLUE;
            Figure.add(i,new TRectangle(x, y, w, h, color));
        }
        //Ромб
        if (number == 5) {
            x = (int) (Math.random() * 500);
            y = (int) (Math.random() * 500);
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            color = Color.CYAN;
            Figure.add(i,new TRomb(x, y, w, h, color));
        }
        //Трапециия
        if (number == 6) {
            x = (int) (Math.random() * 500);
            y = (int) (Math.random() * 500);
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            c = 10 + (int) (Math.random() * 50);
            color = Color.GREEN;
            Figure.add(i,new TTrapeze(x, y, w, h, c, color));
        }
    }


    public void addFigure(int i, int number, int x, int y, int r, Color color) {
        //Окружность
        if (number == 1) {
            Figure.add(i, new TCircle(x, y, r, color));
        }
    }

    public void addFigure(int i, int number, int x, int y, int w, int h, Color color) {
        //Эллипс
        if (number == 2) {
            Figure.add(i,new TEllipse(x, y, w, h, color));
        }
        //Прямоугольник
        if (number == 4) {
            Figure.add(i,new TRectangle(x, y, w, h, color));
        }
        //Ромб
        if (number == 5) {
            Figure.add(i,new TRomb(x, y, w, h, color));
        }
    }

    public void addFigure(int i, int number, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, Color color) {
        //Четырехугольник
        if (number == 3) {
            Figure.add(i,new TQuadrangle(x1, y1, x2, y2, x3, y3, x4, y4, color));
        }
    }

    public void addFigure(int i, int number, int x, int y, int w, int h, int c, Color color) {
        //Трапециия
        if (number == 6) {
            Figure.add(i,new TTrapeze(x, y, w, h, c, color));
        }
    }

    public JPanel Show(int i) {
        ((TFigure) Figure.get(i)).Show();
        return Figure.get(i);
    }

    public JPanel MoveTo(int i, int dx, int dy) {
        ((TFigure) Figure.get(i)).MoveTo(dx, dy);
        return Figure.get(i);
    }

    public JPanel getFigureFromContMass(int i) {
        return Figure.get(i);
    }

}
