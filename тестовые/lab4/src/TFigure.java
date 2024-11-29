 import javax.swing.*;
 import java.awt.*;

 abstract class TFigure extends JPanel {
    private Point TPoint = new Point();
    protected int fig;
    protected int x1,y1,x2,y2,x3,y3,x4,y4;
    protected  Graphics g;

    public TFigure(int x, int y) {
        TPoint.Set(x,y);
        setLayout(null);
        setOpaque(false);
        System.out.println("Координаты инициализированы");
    }

    abstract void Show(Graphics g);

    protected void MoveTo(int dx, int dy) {
        this.Show(g);
        if (fig == 1) {
            x1 = TPoint.GetX() + dx;
            y1 = TPoint.GetY() + dy;
            TPoint.Set(x1, y1);
            System.out.println("1.Новые координаты: x=" + (TPoint.GetX() + dx) + "; y=" + (TPoint.GetY() + dy));

        }
        else {
            x1 = TPoint.GetX() + dx;
            y1 = TPoint.GetY() + dy;
            TPoint.Set(x1, y1);
            x2 += dx;
            x3 += dx;
            x4 += dx;
            y2 += dy;
            y3 += dy;
            y4 += dy;
            System.out.println("2.Новые координаты: x=" + (TPoint.GetX() + dx) + "; y=" + (TPoint.GetY() + dy));
        }
        this.Show(g);

    }

    public void Set(int x, int y) {
        TPoint.Set(x,y);
    }

    public int GetX() {return TPoint.GetX();}
    public int GetY() {return TPoint.GetY();}


}
