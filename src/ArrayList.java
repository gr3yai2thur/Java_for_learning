import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        Scanner In = new Scanner(System.in);
        int n;
        System.out.print("Enter N: ");
        n = In.nextInt();
        int[] price = new int[n];
        obj.getPrice(price);
        obj.Ui(price);
        obj.getSum(price);
        System.out.println("Sum = " + obj.getSum(price));
    }

    public void getPrice(int[] price){
        Scanner In = new Scanner(System.in);
        for (int i = 0; i < price.length; i++) {
            System.out.print("Enter Num[" + (i+1) + "]");
            price[i] = In.nextInt();
        }
    }

    public void Ui(int[] price){
        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i]);
        }
    }

    public int getSum(int[] price){
        int sumPrice = 0;
        for (int i = 0; i < price.length; i++) {
            sumPrice += price[i];
        }
        return sumPrice;
    }
}