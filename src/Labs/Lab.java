package Labs;
import java.util.Date; //Импорт класса Date
public abstract class Lab {
    String Intro = "Программу выполнил:"; //Определение основных полей класса.
    String Name = "Заводов Максим Александрович"; //Выписано сюда для удобства изменения
    String Code = "Шифр группы: ИВТ/б-21-2-о";
    String Variant = "Вариант: 7";
    String Date = "Дата: " + new Date(); //Создание объекта Date, который возвращает текущую дату и перевод в строку
    String Outro = "Проверила: \nВладимирова Елена Сергеевна";

    public void runLab() {
        System.out.println("Лаба не выбрана");
    }

    public String getIntro() { //Метод вывода интро. Возвращает забитые поля из родительского интерфейса
        return Intro + "\n" + Name + "\n" + Code + "\n" + Date + "\n" + Variant;
    }

    public String getOutro(){ //Метод вывода аутро. Возвращает забитое поле из родительского интерфейса
        return Outro;
    }
}

