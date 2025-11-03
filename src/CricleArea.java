import java.util.Scanner;

public class CricleArea {
    static void main(String[] args) {
        int Radius;
        Scanner In = new Scanner(System.in);
        System.out.print("Input Radius: ");
        Radius = In.nextInt();

        double area;
        area = 3.14 * (Radius * Radius);

        System.out.println("Area = " + area);

    }
}
