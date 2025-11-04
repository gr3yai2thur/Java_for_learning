import java.util.Scanner;

public class CH2_1EX {
    Scanner In = new Scanner(System.in);
    public static void main(String[] args) {
        CH2_1EX obj = new CH2_1EX();
        int num1, num2;
        num1 = obj.Input("Input Num1 : ");
        num2 = obj.Input("Input Num2 : ");
        obj.Display(num1, num2);
    }

    public int Input(String UI){
        System.out.print(UI);
        return In.nextInt();
    }

    public void Display(int num1, int num2){
        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
        System.out.println(num1 + "/" + num2 + "=" + ((float)num1/num2));
        System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
    }
}