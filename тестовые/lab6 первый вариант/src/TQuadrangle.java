import java.awt.*;

public class TQuadrangle extends TFigure {
    protected int w,h = 0;
    protected Color color;
    protected boolean VISION = true;


    public TQuadrangle(int x1, int y1, int x2, int y2, int x3, int y3,int x4,int y4, Color color){
        super(x1,y1);
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
        this.x4=x4;
        this.y4=y4;
        this.color=color;
        System.out.println("Объект TQuadrangle создан");
    }

    public TQuadrangle(int x1, int y1){
        super(x1,y1);
    }

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
        x2 += dx;
        x3 += dx;
        x4 += dx;
        y2 += dy;
        y3 += dy;
        y4 += dy;
        System.out.println("2.Новые координаты: x=" + (super.GetX() + dx) + "; y=" + (super.GetY() + dy));
        this.Show();
    }

    public void chSize(int dx, int dy) {
        x2 += dx;
        x3 = x2;
        y3 += dy;
        y4 = y3;
        this.Show();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (VISION==true) {
            int x1 = super.GetX();
            int y1 = super.GetY();
            g.setColor(color);
            g.drawLine(x1,y1,x2,y2);
            g.drawLine(x2,y2,x3,y3);
            g.drawLine(x3,y3,x4,y4);
            g.drawLine(x4,y4,x1,y1);
        }

    }
}
