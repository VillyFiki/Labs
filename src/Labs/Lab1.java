package Labs;
import java.util.Scanner; //Импорт сканнера
public class Lab1 extends Lab { //Наследование Лаб1 из интерфейса Лаб
    @Override
    public void runLab(){
        System.out.print("Число домов: "); //Вывод в консоль
        Scanner scanner = new Scanner(System.in); //Определение сканера, чтобы считывать вводимую информацию
        var houses = scanner.nextInt(); //Считывание числа (дома)
        System.out.print("Число квартир: ");
        var flats = scanner.nextInt(); //Считывание числа (квартиры)
        System.out.println("Число семей получивших квартиры: "+(houses*flats)); //Вывод числа семей получивших квартиры (произведение домов на квартиры)
    }
}
