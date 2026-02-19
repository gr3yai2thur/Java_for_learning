import java.util.Scanner;

class Q2_5 
{
	public static void main(String[] args) 
	{
		Q2_5 obj = new Q2_5();
		String str = obj.Input("Enter String: ");
		System.out.printf("%.3f\n",obj.cal(str));
	}
	
	String Input(String UI){
		Scanner In = new Scanner(System.in);
		System.out.print(UI);
		return In.nextLine();
	}
	
	double cal(String str){
		String[] ch = str.split("[-+*/]");
		char op = 0;
		for(int i=0;i<str.length();i++){
			if(!Character.isDigit(str.charAt(i))){
				op = str.charAt(i);
				break;
			}
		}
		double num1 = Double.parseDouble(ch[0]);
        double num2 = Double.parseDouble(ch[1]);

        switch (op) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
        }
		return 0;
	}
}
