import java.util.Scanner;

public class Array2D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("N: ");
        int n = in.nextInt();

        int[][] data = new int[n][n];
        int[] sum = new int[n];
        double[] average = new double[n];
        double[][] dataAVG = new double[n][n];

        Array2D obj = new Array2D();
        obj.getDATA(data);
        obj.getSUM(data, sum);
        obj.getAVG(n, sum, average);
        obj.avg2Table(n, average, dataAVG);
        obj.DisplayDATA(data);
        obj.DisplayDATAAVERAGE(n, dataAVG);
    }

    public void getDATA(int[][] data){
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length; j++){
                data[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public void getSUM(int[][] data, int[] sum){
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length; j++){
                sum[i] += data[i][j];
            }
        }
    }

    public void getAVG(int n, int[] sum, double[] average){
        for (int i = 0; i < n; i++){
            average[i] = (double) sum[i] / n;
        }
    }

    public void avg2Table(int n, double[] average, double[][] dataAVG){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i == j){
                    dataAVG[i][j] = average[i];
                }
                else{
                    dataAVG[i][j] = 0;
                }
            }
        }
    }

    public void DisplayDATA(int[][] data){
        System.out.println("DATA: ");
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length; j++){
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void DisplayDATAAVERAGE(int n, double[][] dataAVG){
        System.out.println("DATAAVERAGE: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(dataAVG[i][j] == (int)dataAVG[i][j]){
                    System.out.printf("%.0f\t", dataAVG[i][j]);
                }
                else{
                    System.out.printf("%.1f\t", dataAVG[i][j]);
                }
            }
            System.out.println();
        }
    }
}
