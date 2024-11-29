import javax.swing.*;
import java.awt.*;

// number
// 1 -> Окружность     // 2 -> Эллипс  // 3 -> Четырехугольник
// 4 -> Прямоугольник  // 5 -> Ромб    // 6 -> Трапециия

// operation
// 1 -> Создать   // 2 -> Переместить  // 3 -> Показать
// 4 -> Стереть   // 5 -> Уничтожить   // 6 -> Добавить

class Item
{
    private Item Next; // свойство-указатель на следующий элемент
    private TFigure Fig; // свойство-указатель адресуемой фигуры

    public Item (Item Next, TFigure Fig) { this.Next = Next; this.Fig = Fig; }
    public Item GetNext ()  { return Next; }
    public TFigure GetFig () { return Fig ; }
    public void SetNext (Item Next) { this.Next = Next; }
    public void SetFig (TFigure aFig) { Fig = aFig; }
}


class ContList
{
    private Item First; // указатель на первый элемент списка
    private int iList, x,y,r,w,h,c, x2, y2, x3, y3, x4, y4;
    private int number;
    private int counterList;

    public ContList() { First = null; } // конструктор создает пустой список

    public void Operation(int operation) {
        // operation == 1 -> Создать
        if (operation == 1) {
            counterList += 15 + (int) (Math.random()*10);
            System.out.println("counterList = " + counterList);
            for (int j = 0; j < counterList; j++ ) {
                number = 1 + (int) (Math.random() * 6);
                this.Creator(number, counterList-j-1);
            }
        }
        // operation == 2 -> Переместить
        else if (operation == 2){
            x = -30 + (int) (Math.random() * 100);
            y = -30 + (int) (Math.random() * 100);
            Item Current = First;
            while (Current != null) {
                Current.GetFig( ).MoveTo(x,y);
                Current = Current.GetNext( );
            }
        }
        // operation == 3 -> Показать
        else if (operation == 3){
            Item Current = First;
            while (Current != null) {
                Current.GetFig( ).Show( );
                Current = Current.GetNext( );
            }
        }
        // operation == 4 -> Стереть
        else if (operation == 4){
            iList = 0;
        }
        // operation == 5 -> Уничтожить
        else if (operation == 5){
            iList = 0;
            First = null;
            counterList = 0;
            Item Current = First;
            while (Current != null) {
                Current = null;
                Current = Current.GetNext( );
            }
        }
        // operation == 6 -> Добавить
        else if (operation == 6){
            number = 1 + (int) (Math.random() * 6);
            this.Creator(number, counterList);
            counterList++;
        }
    }

    // для простоты добавляем всегда в начало списка
    public void Add(TFigure aFig) {
        First = new Item(First, aFig);
    }

    private void Creator(int number, int j){
        x = (int) (Math.random() * 500);
        y = (int) (Math.random() * 500);
        //Окружность
        if (number == 1) {
            System.out.println("Фигура Контейнера-Списка №" + (j+1) + " - Окружность");
            r = (int) (Math.random() * 200);
            Add(new TCircle(x, y, r, Color.BLACK));
        }
        //Эллипс
        if (number == 2) {
            System.out.println("Фигура Контейнера-Списка №" + (j+1) + " - Эллипс");
            w = (int) (Math.random() * 200);
            h = (int) (Math.random() * 100);
            Add(new TEllipse(x, y, w, h, Color.RED));
        }
        //Четырехугольник
        if (number == 3) {
            System.out.println("Фигура Контейнера-Списка №" + (j+1) + " - Четырехугольник");
            x2 = (int) (Math.random() * 500);
            y2 = (int) (Math.random() * 500);
            x3 = (int) (Math.random() * 500);
            y3 = (int) (Math.random() * 500);
            x4 = (int) (Math.random() * 500);
            y4 = (int) (Math.random() * 500);
            Add(new TQuadrangle(x, y, x2, y2, x3, y3, x4, y4, Color.BLACK));
        }
        //Прямоугольник
        if (number == 4) {
            System.out.println("Фигура Контейнера-Списка №" + (j+1) + " - Прямоугольник");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            Add(new TRectangle(x, y, w, h, Color.BLUE));
        }
        //Ромб
        if (number == 5) {
            System.out.println("Фигура Контейнера-Списка №" + (j+1) + " - Ромб");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            Add(new TRomb(x, y, w, h, Color.CYAN));
        }
        //Трапециия
        if (number == 6) {
            System.out.println("Фигура Контейнера-Списка №" + (j+1) + " - Трапециия");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            c = 10 + (int) (Math.random() * 50);
            Add(new TTrapeze(x, y, w, h, c, Color.GREEN));
        }
    }

    int GetCount() { return this.counterList; }

    int GetIList() { return this.iList; }

    void SetIList(int iList) { this.iList = iList;}

    private Item Iterator(int i) {
        //если "номер элемента списка" больше, чем кол-во всех элементов, значит это конец списка возвращаем null
        //иначе переключаемся до i-го элемента списка
        if (i<=counterList) {
            Item a = First; //получаем ссылку на первый элемент
            for (int j=0; j<i; j++) {
                a = a.GetNext(); //переключаемся на следующий
            }
            return a;
        }
        else { return null; }
    }

    JPanel getFigureFromContList(int i) {
        Item a = Iterator(i);
        return a.GetFig();
    }

}

