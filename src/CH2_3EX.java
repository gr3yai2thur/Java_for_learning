import java.util.Scanner;

public class CH2_3EX {
    Scanner In = new Scanner(System.in);
    public void main(String[] args) {
        CH2_3EX obj = new CH2_3EX();
        int income = obj.Input("Income : ");
    }

    public int Input(String UI){
        System.out.print(UI);
        return In.nextInt();
    }
}
