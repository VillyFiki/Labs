import Labs.Lab;
import Labs.Lab1;

public class Program {
    public static void main(String[] args) {
        Lab lab = new Lab1(); //инициализация Лабы 1 интерфейса Лаб (выполнил ...)
        System.out.println(lab.getIntro()); // Вывод интро
        lab.runLab(); //Запуск лабы
        System.out.println(lab.getOutro()); //Вывод аутро (проверил ...)
    }
}

