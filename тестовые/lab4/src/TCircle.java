import java.awt.*;

public class TCircle extends TFigure {
    protected int r1, r2;
    protected Color color;
    private boolean VISION = true;
//    private Graphics g;

    public TCircle(int x, int y, int r, Color color) {
        super(x,y);
        System.out.println("Координаты центра: x=" + x + ", y=" + y);
        r1 = r2 = r;
        this.color = color;
        System.out.println("Объект TCircle создан");
    }

    public TCircle(int x, int y) { super(x,y); }


    public void chRad(int r) {
        r1 = r2 = r;
        this.Show(g);
    }

    @Override
    void Show(Graphics g) {
        setVisible(true);
        super.paintComponent(g);
        g.setColor(color);
        g.drawOval(super.GetX(),super.GetY(),r1*2,r2*2);

    }


}
