import java.util.Scanner;

public class Capasit_Waste {
    static void main(String[] args) {
        int width;
        Scanner In = new Scanner(System.in);
        System.out.print("Enter Width: ");
        width = In.nextInt();

        double AreaSq = width * width * width;
        double Radius = width * 0.5;
        double AreaCirCle = (double)4/3 * 3.141592653589793 * (Radius * Radius * Radius);
        double Capasit_waste = AreaSq - AreaCirCle;

        System.out.println("capasit_sph = " + AreaCirCle);
        System.out.println("capasit_waste = " + Capasit_waste);
    }
}
