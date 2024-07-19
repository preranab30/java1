//wrapper class
//1. Declare a class with below method

//a. Method to take medicine information like name,manf date, price,quantity
//accept from main method and pass as arguments

//b.MEthod to take juice information like name,brand,flavour,price,quantity
//.Accept from main method and pass as arguments

class Wrap
{
	public static void medicine(String name, int manfDate,double price,String quantity)
	{
		System.out.println("runinnig medicine in Wrap class");
		System.out.println("Medicine name :"+name);
		System.out.println("Medicine manfDate :"+manfDate);
		System.out.println("Medicine price :"+price);
		System.out.println("Medicine quantity :"+quantity);
	}
	
	
}