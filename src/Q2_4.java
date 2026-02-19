import java.util.Scanner;

class Q2_4 
{
	public static void main(String[] args) 
	{
		Q2_4 obj = new Q2_4();
		String str = obj.Input("Enter text: ");
		System.out.println(obj.output(str));
	}
	
	String Input(String UI){
		Scanner In = new Scanner(System.in);
		System.out.print(UI);
		return In.nextLine();
	}
	
	String output(String str){
		str = str.replace(" ", "+");
		String txt = "";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(Character.isLetter(ch[i])){
				txt += (int)ch[i];
			}
			else{
				txt += '+';
			}
		}
		return txt;
	}
}
