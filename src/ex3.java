import java.util.Scanner;

class  ex3 {
	public static void main(String[] args){
		Scanner In = new Scanner(System.in);
		
		System.out.print("Product : ");
		String product = In.next();
		System.out.print("Price : ");
		int price = In.nextInt();
		System.out.print("Amount : ");
		int amount = In.nextInt();
		System.out.print("Pay : ");
		int pay = In.nextInt();
		
		System.out.println("***********************************");
		System.out.println();
		System.out.printf("Buy %s Price %d bath, Amount %d\n", product, price, amount);
		System.out.println("Cost = " + (price * amount) + " Bath");
		System.out.println("Pay = " + pay + " Bath");
		System.out.println("Change = " + (pay - (price * amount)) + " Bath");
	}
}