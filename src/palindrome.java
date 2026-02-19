import java.util.Scanner;

class palindrome 
{
	public static void main(String[] args) 
	{
		palindrome obj = new palindrome();
		String str = obj.Input("Enter text: ");
		System.out.println(obj.isPalindrome(str));
		obj.ui(str);
	}
	
	String Input(String UI){
		Scanner In = new Scanner(System.in);
		System.out.print(UI);
		return In.nextLine();
	}
	
	boolean isPalindrome(String str){
		String x = new StringBuffer(str).reverse().toString();
		if(x.equals(str)){
			return true;
		}
		return false;
	}
	
	boolean isNumPalindrome(String str){
		for(int i=0;i<str.length();i++){
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	void ui(String str){
		if(isPalindrome(str) && isNumPalindrome(str)){
			System.out.println(str + " is numberic palindrome");
		}
		else{
			System.out.println(str + " is String palindrome");
		}
	}
}
