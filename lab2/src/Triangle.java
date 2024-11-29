import javax.swing.*;
import java.awt.*;

public class Triangle extends JPanel {

    private Point A = new Point();
    private Point B = new Point();
    private Point C = new Point();
//    private int x, y, z, t, h;
    private Color color;
    private boolean VISION = true;


    public Triangle (int x1, int x2, int x3, int y13, int y2, Color c) {
        setLayout(null);
        setOpaque(false);
        A.Set(x1,y13);
        B.Set(x2,y2);
        C.Set(x3,y13);
        color = c;
//        x = x1;
//        y = x2;
//        z = x3;
//        t = y13;
//        h = y2;
    }

    public Triangle (int x1, int x2, int x3, int y13, int y2) {
        setLayout(null);
        setOpaque(false);
        A.Set(x1,y13);
        B.Set(x2,y2);
        C.Set(x3,y13);
        color= Color.BLACK;
    }

    public void MoveTo(int dx, int dy) {
        A.Set(A.GetX()+dx,A.GetY()+dy);
        B.Set(B.GetX()+dx,B.GetY()+dy);
        C.Set(C.GetX()+dx,C.GetY()+dy);
    }

    public void Show(boolean VISION) {
        this.VISION= VISION;
        setVisible(this.VISION);
        this.VISION = true;
        this.repaint();
    }

    public void chSize(int dx, int dy) {
        C.Set(C.GetX()+dx,C.GetY()+dy);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (VISION == true) {
            g.setColor(color);
            g.drawPolygon(new int[] {A.GetX(),B.GetX(),C.GetX()}, new int[] {A.GetY(),B.GetY(),C.GetY()}, 3);
        }
    }

}



