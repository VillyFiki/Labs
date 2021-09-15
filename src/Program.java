import Labs.Lab;
import Labs.Lab1;

public class Program {
    public static void main(String[] args) {
        Lab lab = new Lab1();
        System.out.println(lab.getIntro());
        lab.runLab();
        System.out.println(lab.getOutro());
    }
}

