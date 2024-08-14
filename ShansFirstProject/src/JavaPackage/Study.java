package JavaPackage;

public class Study {

	String name;
	String sex;
	int fee;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Study obj= new Study();
	obj.name= "shan";
	obj.sex= "male";
	obj.fee= 100;
	
	System.out.println ("Name of Customer " +obj.name);
	System.out.println ("Sex of Customer " +obj.sex);
	System.out.println ("Fee of Customer " +obj.fee);
	
	
	}
	
}