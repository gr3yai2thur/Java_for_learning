import java.util.Date;

class api_util_date 
{
	public static void main(String[] args) 
	{
		
		Date dt = new Date();
		System.out.println(dt);

		System.out.println();

		int days = dt.getDay();
		System.out.println(days);
	}
}