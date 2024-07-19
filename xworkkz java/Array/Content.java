class content
{
	public static void main(String[] contents)
	{
		if(contents.length==4)
		{
			System.out.println("get 4 values");
			String personName=contents[0]; 
			String personEmail=contents[1]; 
			String personAge=contents[2]; 
			String personPassword=contents[3]; 
			System.out.println("personName :" +personName);
			System.out.println("personEmail :" +personEmail);
			System.out.println("personAge :" +personAge);
			System.out.println("personPassword :" +personPassword);
		}
		System.out.println("not enough");
	}
	
	
		
}