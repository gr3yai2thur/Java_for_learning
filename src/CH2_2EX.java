import javax.xml.transform.Source;
import java.util.Scanner;

public class CH2_2EX {
    Scanner In = new Scanner(System.in);
    public static void main(String[] args) {
        CH2_2EX obj = new CH2_2EX();

        String product = obj.InputStr("Product : ");
        int price = obj.InputInt("Price : ");
        int amout = obj.InputInt("Amout : ");
        int pay = obj.InputInt("Pay : ");
        obj.Display(product, price, amout, pay);
    }

    public String InputStr(String UI){
        System.out.print(UI);
        return In.nextLine();
    }

    public int InputInt(String UI){
        System.out.print(UI);
        return In.nextInt();
    }

    public int getCost(int price, int amout){
        return price * amout;
    }

    public int getChange(int price, int amout, int pay){
        return pay - (price * amout);
    }

    public void Display(String product, int price, int amout, int pay){
        System.out.println("Buy " + product + " Price " + price + " bath,Amount " + amout);
        System.out.println("Cost = " + getCost(price, amout) + " Bath");
        System.out.println("Pay = " + pay + " Bath");
        System.out.println("Change = " + getChange(price, amout, pay) + " Bath");
    }
}
