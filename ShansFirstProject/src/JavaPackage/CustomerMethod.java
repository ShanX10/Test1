package JavaPackage;

public class CustomerMethod {

	void fee_Shan()
	{
		int a = 100;
		System.out.println ("The fee for Shan is $" +a);
		
	}
	
		int automation()
		{
			return 520;
			
		}

	public static void main(String[] args) {
		
		CustomerMethod obj= new CustomerMethod();
		obj.fee_Shan();
		System.out.println(obj.automation());
		
	}

}
