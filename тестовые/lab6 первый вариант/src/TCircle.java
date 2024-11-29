import java.awt.*;

public class TCircle extends TFigure {
    protected int r1, r2;
    protected Color color;
    protected boolean VISION = true;

    public TCircle(int x, int y, int r, Color color) {
        super(x,y);
        System.out.println("Координаты центра: x=" + x + ", y=" + y);
        r1 = r2 = r;
        this.color = color;
        System.out.println("Объект TCircle создан");
    }

    public TCircle(int x, int y) { super(x,y); }

    @Override
    public void Show() {
        setVisible(this.VISION);
        this.VISION = true;
        this.repaint();
    }

    @Override
    public void MoveTo(int dx, int dy) {
        x1 = super.GetX() + dx;
        y1 = super.GetY() + dy;
        super.Set(x1, y1);
        System.out.println("1.Новые координаты: x=" + (super.GetX() + dx) + "; y=" + (super.GetY() + dy));
        this.Show();
    }

    public void chRad(int r) {
        if (r1 == r2) { r1 = r2 = r; }
        else { r1 = r; }
        this.Show();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (VISION==true) {
            g.setColor(color);
            g.drawOval(super.GetX(),super.GetY(),r1*2,r2*2);
        }
    }

}
