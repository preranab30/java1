//method chaining with arguments
//Dog---->guarding(String location)
//House--->waatch(String location)----->Dog.guarding(location)
//main()----->House.watch("Gate");

class Dog 
{
	public static void guarding(String location)
	{
		System.out.println("Runinng guarding method in class Dog");
		System.out.println("location:" +location);
	}
}