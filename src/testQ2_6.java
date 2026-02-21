import java.util.Scanner;
import java.text.DecimalFormat;

class testQ2_6 
{
	public static void main(String[] args) {
		testQ2_6 obj = new testQ2_6();
		String str = obj.Input("Enter txt: ");
		String opAll = obj.getOp(str);
		System.out.println(obj.isFormat(obj.getResult(str, opAll)));
	}
	
	String Input(String UI){
		Scanner In= new Scanner(System.in);
		System.out.print(UI);
		return In.nextLine();
	}
	
	String getOp(String str){
		StringBuffer opAll = new StringBuffer();
		for(int i=0;i<str.length();i++){
			if(!Character.isDigit(str.charAt(i))){
				opAll.append(str.charAt(i));
			}
		}
		return opAll.toString();
	}
	
	double getResult(String str, String opAll){
		String[] numArray = str.split("[-+*/%]");
		char[] opArray = opAll.toCharArray();
		double result = Double.parseDouble(numArray[0]);
		
		for(int i=0;i<numArray.length-1;i++){
			int num = Integer.parseInt(numArray[i+1]);
			char realOp = opArray[i];
			
			if((realOp == '/' || realOp == '%') && num == 0) continue;
			
			switch(realOp){
				case '+':
					result += num;
					break;
				case '-':
					result -= num;
					break;
				case '*':
					result *= num;
					break;
				case '/':
					result /= num;
					break;
				case '%':
					result %= num;
					break;
			}
		}
		return result;
	}
	
	String isFormat(double result) {
        DecimalFormat dcfm = new DecimalFormat(",##0.000");
        return dcfm.format(result);
    }
}
