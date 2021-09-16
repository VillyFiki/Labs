import Labs.Lab;
import Labs.Lab1;
import Labs.Lab2;

public class Program {
    public static void main(String[] args) {
        Lab lab = new Lab2(); //инициализация Лабы интерфейса Лаб (выполнил ...)
        System.out.println(lab.getIntro()); // Вывод интро
        lab.runLab(); //Запуск лабы
        System.out.println(lab.getOutro()); //Вывод аутро (проверил ...)
    }
}

