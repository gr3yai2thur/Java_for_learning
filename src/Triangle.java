import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.Scanner;

public class Triangle {
    static void main(String[] args) {
        int height, lenght;
        Scanner In = new Scanner(System.in);
        System.out.print("Enter Height: ");
        height = In.nextInt();

        System.out.print("Entrer Lenght: ");
        lenght = In.nextInt();

        double area = 0.5 * height * lenght;
        System.out.println("Area =" + area);
    }
}
