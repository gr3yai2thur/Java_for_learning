import java.util.Scanner;

class Q2_3 
{
	public static void main(String[] args) 
	{
		Q2_3 obj = new Q2_3();
		String str = obj.Input("Enter text: ");
		obj.output(str);
	}
	
	String Input(String UI){
		Scanner In = new Scanner(System.in);
		System.out.print(UI);
		return In.nextLine();
	}
	
	void output(String str){
		String[] row = str.split("/");
		
		for(int i=0;i<row.length;i++){
			String[] col = row[i].split(",");
			System.out.println(col[0] + "\t" + col[1]);
		}
	}
}
