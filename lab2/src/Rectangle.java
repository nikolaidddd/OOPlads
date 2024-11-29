import javax.swing.*;
import java.awt.*;

public class Rectangle extends JPanel {

    private Point O = new Point();
    private int w, h;
    private Color color;
    private boolean VISION = true;

    public Rectangle (int x, int y, int w, int h, Color c) {
        setLayout(null);
        setOpaque(false);
        System.out.println("Координаты центра: x=" + x + ", y=" + y);
        System.out.println("Начальные ширина/высота: " + w + "; " + h);
        if ((x+w) >= 1000) { w = 1000 - x;}
        if ((y+h) >= 500) { h = 500 - y;}
        System.out.println("Ширина/высота после проверки на выход за пределы окна программы: " + w + "; " + h);
        O.Set(x,y);
        this.w = w;
        this.h = h;
        color = c;
        System.out.println("Объект Rectangle создан");
    }

    public Rectangle (int x, int y, int w, int h) {
        setLayout(null);
        setOpaque(false);
        O.Set(x,y);
        this.w = w;
        this.h = h;
        color= Color.BLACK;
    }

    public void MoveTo(int dx, int dy) {
        O.Set(O.GetX()+dx, O.GetY()+dy);
        this.repaint();
    }

    public void Show(boolean VISION) {
        this.VISION= VISION;
        setVisible(this.VISION);
        this.VISION = true;
        this.repaint();
    }

    public void chSize(int dw, int dh) {
        w += dw;
        h += dh;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawRect(O.GetX(), O.GetY(), w, h);
        }
    }
}
