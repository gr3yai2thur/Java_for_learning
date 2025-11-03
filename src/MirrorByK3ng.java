import java.util.Scanner;

public class MirrorByK3ng {
    public static void main(String[] args) {
        MirrorByK3ng obj = new MirrorByK3ng();
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int[] data = new int[n];

        obj.getDATA(data);
        obj.getMAX(data);
        obj.DisplayM(data);
        obj.DisplayMirror(data);
        obj.DisplayW(data);
    }

    public void getDATA(int[] data){
        Scanner In = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            data[i] = In.nextInt();
        }
    }

    public int getMAX(int[] data){
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if(data[i] > max){
                max = data[i];
            }
        }
        return max;
    }

    public void DisplayM(int[] data){
        for (int i = data.length; i >= 0; i--) {
            for (int j = 0; j < data.length; j++) {
                if(i < data[j]){
                    System.out.printf("M\t");
                }
                else if(i == data[j]){
                    System.out.printf("%d\t", data[j]);
                }
                else{
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }
    }

    public void DisplayMirror(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.printf("-\t");
        }
        System.out.println();
    }

    public void DisplayW(int[] data){
        for (int i = 0; i <= getMAX(data); i++) {
            for (int j = 0; j < data.length; j++) {
                if(i < data[j]){
                    System.out.printf("W\t");
                }
                else if(i == data[j]){
                    System.out.printf("%d\t", data[j]);
                }
                else{
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }
    }
}
