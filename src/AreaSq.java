import java.util.Scanner;

class AreaSq
{
    public static void main(String[] args)
    {
        int width, lenght;
        Scanner In = new Scanner(System.in);
        System.out.print("Input Width: ");
        width = In.nextInt();

        System.out.print("Input Lenght: ");
        lenght = In.nextInt();

        int area = width*lenght;

        System.out.println("Area = " + area);
    }
}