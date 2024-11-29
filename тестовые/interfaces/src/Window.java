//Интерфейсные классы объявляются с помощью директивы interface.

//При наследовании интерфейсов используется та же директива extends,
//что и для обычных классов.

//При описании интерфейсов никакие директивы ограничения доступа
// можно не использовать, т.к. автоматически все методы интерфейсных классов
// считаются открытыми (public).

//При описании класса для указания реализуемых в классе интерфейсов
// используется директива implements.

interface IPerson {
    void SetFam (string aFam);
    string GetFam ( );
}


interface IStudent extends IPerson {
    void SetOplata ( ); // заголовок метода расчета оплаты за обучение
    int GetOplata ( );
}


interface ISotr extends IPerson {
    void SetZarplata(); // заголовок метода расчета зарплаты
    int GetZarplata();
}


class Person implements IPerson {
    private string Fam;
    public void SetFam (string aFam) { Fam = aFam;}
    public string GetFam ( ) {return Fam;}
}

class Student extends Person implements IStudent {
    private int Oplata; // свойство - сумма оплаты за обучение
    public void SetOplata ( ) { //     код для обычных студентов;
    }
    public int GetOplata ( ) {return Oplata;}
}

class Sotr extends Person implements ISotr {
    private int Zarplata; // свойство – зарплата сотрудника
    public void SetZarplata ( ) { //     код для обычных студентов;
    }
    public int GetZarplata ( ) {return Zarplata;}
}


class StudSotr extends Person implements IStudent, ISotr {
    private int Oplata;
    private int Zarplata;
    public void SetOplata ( ) { //        код для студентов-сотрудников
    }
    public int GetOplata ( ) {return Oplata;}
    public void SetZarplata ( ) { //        код для сотрудников-студентов
    }
    public int GetZarplata ( ) {return Zarplata;}
}



public class Window {






}
