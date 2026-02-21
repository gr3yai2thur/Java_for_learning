import java.util.Scanner;
class Q2_3_k 
{
	public static void main(String[] args) 
	{
		Q2_3_k obj = new Q2_3_k();
		double allM = 0;
		for (;;)
		{
			double sum = 0;
			double in = Double.parseDouble(obj.input("input price : "));
			if(in <= 0)
			{
				break;
			}
			allM += obj.allmoney(sum, in);
		}
		double discoutmoney = obj.discout(allM);
		double sale = obj.saleprice(allM, discoutmoney);
		obj.display(allM, discoutmoney, sale);
	}
	
	String input(String UI)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(UI);
		return sc.nextLine();
	}
	
	
	double allmoney(double sum, double num)
	{
		return sum + num;
	}
	
	double discout (double allprice)
	{
		return allprice * (5.75/100);
	}
	
	double saleprice (double allmoney, double discount)
	{
		return allmoney - discount;
	}
	
	void display(double allprice, double sale, double pay)
	{
		System.out.println("ALL price\t :" + allprice + "BTH.");
		System.out.println("Sale\t :" + sale + "BTH.");
		System.out.println("Pay\t :" + pay + "BTH.");
	}
	
}
