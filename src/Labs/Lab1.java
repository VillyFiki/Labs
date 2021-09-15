package Labs;
import java.util.Scanner;
public class Lab1 implements Lab {
    public String getIntro() {
        return Intro + "\n" + Name + "\n" + Code + "\n" + Date + "\n" + Variant;
    }
    public void runLab(){
        System.out.print("Число домов: ");
        Scanner scanner = new Scanner(System.in);
        var houses = scanner.nextInt();
        System.out.print("Число квартир: ");
        var flats = scanner.nextInt();
        System.out.println("Число семей получивших квартиры: "+(houses*flats));
    }
    public String getOutro(){
        return Outro;
    }
}
