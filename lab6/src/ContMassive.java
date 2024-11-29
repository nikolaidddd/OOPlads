import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

// number
// 1 -> Окружность     // 2 -> Эллипс  // 3 -> Четырехугольник
// 4 -> Прямоугольник  // 5 -> Ромб    // 6 -> Трапециия

// operation
// 1 -> Создать   // 2 -> Переместить  // 3 -> Показать
// 4 -> Стереть   // 5 -> Уничтожить   // 6 -> Добавить

class ContMassive {

    private static ArrayList<TFigure> Figure = new ArrayList();
    private int iMass, x,y,r,w,h,c, x2, y2, x3, y3, x4, y4;
    private int number;
    private int counterMassive;

    void Operation(int operation){
        // operation == 1 -> Создать
        if (operation == 1) {
            counterMassive += 15 + (int) (Math.random()*10);
            System.out.println("counterMassive = " + counterMassive);
            for (int j = 0; j < counterMassive; j++ ) {
                number = 1 + (int) (Math.random() * 6);
                this.Creator(number, j);
            }
        }
        // operation == 2 -> Переместить
        else if (operation == 2){
            x = -30 + (int) (Math.random() * 100);
            y = -30 + (int) (Math.random() * 100);
            for (int j = 0; j < iMass; j++) {
                Figure.get(j).MoveTo(x, y);
            }
        }
        // operation == 3 -> Показать
        else if (operation == 3){
            for (iMass=0; iMass<counterMassive; iMass++) {
                Figure.get(iMass).Show();
            }
        }
        // operation == 4 -> Стереть
        else if (operation == 4){
            iMass = 0;
        }
        // operation == 5 -> Уничтожить
        else if (operation == 5){
            iMass = 0;
            Figure = null;
            counterMassive = 0;
        }
        // operation == 6 -> Добавить
        else if (operation == 6){
            number = 1 + (int) (Math.random() * 6);
            this.Creator(number, counterMassive);
            counterMassive++;
        }
    }

    private void Creator(int number, int j){
        x = (int) (Math.random() * 500);
        y = (int) (Math.random() * 500);
        //Окружность
        if (number == 1) {
            System.out.println("Фигура Контейнера-Массива №" + (j+1) + " - Окружность");
            r = (int) (Math.random() * 200);
            Figure.add(j, new TCircle(x, y, r, Color.BLACK));
        }
        //Эллипс
        if (number == 2) {
            System.out.println("Фигура Контейнера-Массива №" + (j+1) + " - Эллипс");
            w = (int) (Math.random() * 200);
            h = (int) (Math.random() * 100);
            Figure.add(j, new TEllipse(x, y, w, h, Color.RED));
        }
        //Четырехугольник
        if (number == 3) {
            System.out.println("Фигура Контейнера-Массива №" + (j+1) + " - Четырехугольник");
            x2 = (int) (Math.random() * 500);
            y2 = (int) (Math.random() * 500);
            x3 = (int) (Math.random() * 500);
            y3 = (int) (Math.random() * 500);
            x4 = (int) (Math.random() * 500);
            y4 = (int) (Math.random() * 500);
            Figure.add(j, new TQuadrangle(x, y, x2, y2, x3, y3, x4, y4, Color.BLACK));
        }
        //Прямоугольник
        if (number == 4) {
            System.out.println("Фигура Контейнера-Массива №" + (j+1) + " - Прямоугольник");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            Figure.add(j, new TRectangle(x, y, w, h, Color.BLUE));
        }
        //Ромб
        if (number == 5) {
            System.out.println("Фигура Контейнера-Массива №" + (j+1) + " - Ромб");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            Figure.add(j, new TRomb(x, y, w, h, Color.CYAN));
        }
        //Трапециия
        if (number == 6) {
            System.out.println("Фигура Контейнера-Массива №" + (j+1) + " - Трапециия");
            w = 100 + (int) (Math.random() * 500);
            h = 100 + (int) (Math.random() * 250);
            c = 10 + (int) (Math.random() * 50);
            Figure.add(j, new TTrapeze(x, y, w, h, c, Color.GREEN));
        }
    }

    int GetCount() { return this.counterMassive; }

    int GetIMass() { return this.iMass; }

    void SetIMass(int iMass) { this.iMass = iMass;}

    JPanel getFigureFromContMass(int iMass) { return Figure.get(iMass); }

}
