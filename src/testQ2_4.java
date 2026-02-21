import java.util.Scanner;

class testQ2_4 
{
	public static void main(String[] args) {
		testQ2_4 obj = new testQ2_4();
		String phoneNum = obj.Input("Enter phone number: ");
		obj.ui(phoneNum);
	}
	
	String Input(String UI){
		Scanner In= new Scanner(System.in);
		System.out.print(UI);
		return In.nextLine();
	}
	
	boolean isPhoneNum(String str){
		if(str.length() > 10) return false;
		if(Integer.parseInt(String.valueOf(str.charAt(0))) != 0) return false;
		
		for(int i=0;i<str.length();i++){
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	int sumPhoneNum(String str){
		int sum = 0;
		for(;str.length() != 1;){
			sum = 0;
			for(int j=0;j<str.length();j++){
				sum += Integer.parseInt(String.valueOf(str.charAt(j)));
			}
			if(str.length() != 1){
				str = String.valueOf(sum);
			}
		}
		return sum;
	}
	
	void ui(String str){
		if(isPhoneNum(str) && sumPhoneNum(str) != 0){
			System.out.println(sumPhoneNum(str));
		}
		else{
			System.out.println("Incorrect");
		}
	}
}
