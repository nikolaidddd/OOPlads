import javax.swing.*;
import java.awt.*;

class ContList {
    private List Head; //указатель на первый элемент списка, "голова списка"
    private List Tail; //указатель на последний элемент списка, "хвост списка"
    private int count = 0;

    private void AddToList (List a) {
        if (Tail == null) {
            Head = a; //указываем ссылки начала и конца на новый элемент
            Tail = a; // т.е. список теперь состоит из одного элемента
        }
        else {
            Tail.Next = a; //поле "next" хвоста стало ссылать на новый элемент
            Tail = a; //новый элемент стал хвостом списка
        }
        count++;
        System.out.println("Кол-во элементов в списке: " + count);
    }

    private List Iterator(int i) {
        //если "номер элемента списка" больше, чем кол-во всех элементов, значит это конец списка
        //возвращаем null
        //иначе переключаемся до i-го элемента списка
        if (i<=count) {
            List a = Head; //получаем ссылку на первый элемент
            for (int j=0; j<i; j++) {
                a = a.Next; //переключаемся на следующий
            }
            return a;
        }
        else {
            return null;
        }
    }

    // number == 1 -> Окружность
    // number == 2 -> Эллипс
    // number == 3 -> Четырехугольник
    // number == 4 -> Прямоугольник
    // number == 5 -> Ромб
    // number == 6 -> Трапециия

    public void addFigure(int i, int number, int x, int y, int r, Color color) {
        List a = new List(); //создаем новый элемент
        //Окружность
        if (number == 1) {
            a.arrayListFigure = new TCircle(x, y, r, color);
        }
        AddToList(a);
    }

    public void addFigure(int i, int number, int x, int y, int w, int h, Color color) {
        List a = new List(); //создаем новый элемент
        //Эллипс
        if (number == 2) {
            a.arrayListFigure = new TEllipse(x, y, w, h, color);
        }
        //Прямоугольник
        if (number == 4) {
            a.arrayListFigure = new TRectangle(x, y, w, h, color);
        }
        //Ромб
        if (number == 5) {
            a.arrayListFigure = new TRomb(x, y, w, h, color);
        }
        AddToList(a);
    }

    public void addFigure(int i, int number, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, Color color) {
        List a = new List(); //создаем новый элемент
        //Четырехугольник
        if (number == 3) {
            a.arrayListFigure = new TQuadrangle(x1, y1, x2, y2, x3, y3, x4, y4, color);
        }
        AddToList(a);
    }

    public void addFigure(int i, int number, int x, int y, int w, int h, int c, Color color) {
        List a = new List(); //создаем новый элемент
        //Трапециия
        if (number == 6) {
            a.arrayListFigure = new TTrapeze(x, y, w, h, c, color);
        }
        AddToList(a);
    }

    public void ReAddFigure(int i, JPanel Figure) {
        if (Iterator(i) != null) {
            Iterator(i).arrayListFigure = Figure;
        }
    }

    public JPanel MoveTo(int i, int dx, int dy) {
        JPanel panelFigure = getFigureFromContList(i);
        ((TFigure) panelFigure).MoveTo(dx,dy);
        ReAddFigure(i, panelFigure);
        return panelFigure;
    }

    public JPanel Show(int i) {
        JPanel panelFigure = getFigureFromContList(i);
        ((TFigure) panelFigure).Show();
        ReAddFigure(i, panelFigure);
        return panelFigure;
    }

    public JPanel getFigureFromContList(int i) {
        List a = Iterator(i);
        return a.arrayListFigure;
    }
}

class List {
    List Next;
    JPanel arrayListFigure;
}