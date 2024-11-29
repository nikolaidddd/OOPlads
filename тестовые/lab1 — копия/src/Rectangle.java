import javax.swing.*;
import java.awt.*;

public class Rectangle extends JPanel {
    private int x, y, w, h;
    public int n = 0;
    private Color color;
    private boolean VIS = true;

    public Rectangle (int c1, int c2, int c3, int c4, Color c) {
        setLayout(null);
        setOpaque(false);
        x = c1;
        y = c2;
        w = c3;
        h = c4;
        color = c;
    }

    public Rectangle (int c1, int c2, int c3, int c4) {
        setLayout(null);
        setOpaque(false);
        x = c1;
        y = c2;
        w = c3;
        h = c4;
        color= Color.BLACK;
    }

    public void MoveTo(int c1, int c2) {
        x += c1;
        y += c2;
    }

    public void Show(boolean VISION) {
        VIS = VISION;
        setVisible(VIS);
        n = 1;
        this.repaint();
    }

    public void chSize(int c1, int c2) {
        w += c1;
        h += c2;
    }

    //???? //@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (n == 1) {
            g.setColor(color);
            g.drawRect(x, y, w, h);
            System.out.println("Rectangle Видимость: " + VIS);
        }
    }
}
