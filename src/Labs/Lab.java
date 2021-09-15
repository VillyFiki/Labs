package Labs;

import java.util.Date;
public interface Lab {
    public String Intro = "Программу выполнил:";
    public String Name = "Заводов Максим Александрович";
    public String Code = "Шифр группы: ИВТ/б-21-2-о";
    public String Variant = "Вариант: 7";
    public String Date = "Дата: " + new Date();
    public String Outro = "Проверила: \nВладимирова Елена Сергеевна";

    public String getIntro();
    public void runLab();
    public String getOutro();
}

