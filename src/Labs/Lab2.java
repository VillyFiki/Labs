package Labs;
public class Lab2 extends Lab {
    @Override
    public void runLab(){
        String _string = "Заводов_ИВТ/б-21-2-о";
        int _int = (int)(Math.random()*1000000000);
        short _short = (short)(Math.random()*10000);
        byte _byte = (byte)(Math.random()*10);
        double _double = Math.random()*100;
        float _float = (float)Math.random()*1000;
        
        System.out.printf("string = %s , int = %o , short = %09d , byte = %x , double = %10.4f , float %+08.2f \n", _string, _int, _short, _byte, _double, _float); //����� � �������
        
        }
}