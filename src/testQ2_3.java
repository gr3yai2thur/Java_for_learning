import java.util.Scanner;

class  testQ2_3
{
	public static void main(String[] args) 
	{
		testQ2_3 obj = new testQ2_3();
		double price = Double.parseDouble(obj.Input("Enter num: "));
		double sum = obj.allPrice(price);
		obj.ui(sum);
	}
	
	String Input(String UI){
		Scanner In= new Scanner(System.in);
		System.out.print(UI);
		return In.nextLine();
	}
	
	double allPrice(double price){
		double sum = 0;
		for(;price > 0;){
			sum += price;
			price = Double.parseDouble(Input("Enter num: "));
		}
		return sum;
	}
	
	double sale(double sum){
		return sum * 0.0573;
	}
	
	double pay(double sum){
		return sum - sale(sum);
	}
	
	void ui(double sum){
		System.out.printf("All price\t:%.1f BTH.\n", sum);
		System.out.printf("Sale\t:%.2f BTH.\n", sale(sum));
		System.out.printf("Pay\t:%.2f BTH.\n", pay(sum));
	}
}