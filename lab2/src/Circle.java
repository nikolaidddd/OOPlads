import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {

    private Point O = new Point();
    private int D;
    private Color color;
    private boolean VISION = true;

    public Circle (int x, int y, int r, Color color) {
        setLayout(null);
        setOpaque(false);
        System.out.println("Координаты центра: x=" + x + ", y=" + y);
        System.out.print("Начальный радиус: " + r + "; ");
        if ((x+r) >= 1200) { r = 1200 - x;}
        if ((y+r) >= 500) { r = 500 - y;}
        if (r>x) { r = x; }
        if (r>=y) { r= y; }
        System.out.println("Итоговый радиус: " + r);
        O.Set(x,y);
        D = r*2;
        this.color = color;
        System.out.println("Объект Circle создан");
    }

    public Circle (int x, int y, int r) {
        setLayout(null);
        setOpaque(false);
        O.Set(x,y); D = r*2; color= Color.BLACK;
        System.out.println("Объект Circle создан");
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

    public void chRad(int r) {
        D = r*2;
        System.out.println("Новый радиус: " + r + ", Координаты: x=" + O.GetX() + ", y=" + O.GetY());
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawOval(O.GetX()-D/2, O.GetY()-D/2, D, D);
            System.out.println("Circle Видимость: " + VISION);
        }
    }
}
