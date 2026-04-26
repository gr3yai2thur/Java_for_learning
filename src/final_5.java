import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class final_5 
{
	public static void main(String[] args) 
	{
		final_5 obj = new final_5();
		obj.writeFile();
		obj.ui();
	}
	
	String Input(String UI){
		Scanner In = new Scanner(System.in);
		System.out.print(UI);
		return In.nextLine();
	}
	
	void writeFile(){
		try
		{
			String filename = "final_5.xls";
			File fl = new File(filename);
			FileWriter fW = new FileWriter(filename, true);
			
			if(fl.length() == 0){
				fW.write("NAME\tPRICE\tSALE%\tSALE\tPAY\tDATE-TIME\n");
			}
			
			for(;;){
				String name = Input("Enter name: ");
				if(name.equalsIgnoreCase("stop")) break;
				double price = Double.parseDouble(Input("Enter price: "));
				double saleP = Double.parseDouble(Input("Enter sale: "));

				double sale = getSale(price, saleP);
				double pay = getPay(price, saleP);
				
				fW.write(name + "\t" + price + "\t" + saleP + "\t" +
						 sale + "\t" + pay + "\t" + getDate() + "\n");
			}
			
			fW.close();
		}
		catch (Exception err)
		{
			System.out.println(err);
			System.out.println();
		}
		
	}
	
	String getDate(){
		Date dt = new Date();
		Locale lc = new Locale("th", "TH");
		String format = "dd/MM/yy-hh:mm:ss";
		SimpleDateFormat sDF = new SimpleDateFormat(format, lc);
		String date = sDF.format(dt);
		return date;
	}
	
	double round(double num){
		return Math.round(num * 100.0) / 100.0;
	}
	
	double getSale(double price, double saleP){
		return round((saleP / 100) * price);
	}
	
	double getPay(double price, double saleP){
		return round(price - getSale(price, saleP));
	}
	
	void ui(){
		try{
			String x;
			char ch;

			String filename = "final_5.xls";
			BufferedReader bfR = new BufferedReader(new FileReader(filename));
			for(;;){
				x = bfR.readLine();
				if(x == null) break;
				System.out.println(x);
			}
		}
		catch (Exception err){
			System.out.println(err);
			System.out.println();
		}
	}
}