//A.Write a class with below methods
//1.Method to take code and return country: 5 condition
//2.Method to take item and return price: 5 condition
//3.Method to take movie name and return produer name:5 condition




class Table
{
	public static String getCode(int code)
	{
		System.out.println("running getCode in class Table ");
		System.out.println("code" +code);
		if(code==91)
		{
			return "india";
		}
		if(code==86)
		{
			return "china";
		}
		if(code==61)
		{
			return "australia";
		}
		if(code==81)
		{
			return "japan";
		}
		if(code==93)
		{
			return "afghanistan";
		}
		return "not found";
	}
	
	public static double getItem(String item)
	{
		System.out.println("running getItem in class Table ");
		System.out.println("item" +item);
		if(item=="iceCream")
		{
			return 100.00;
		}
		if(item=="chacolate")
		{
			return 50.00;
		}
		if(item=="cake")
		{
			return 150.00;
		}
		if(item=="pizza")
		{
			return 500.00;
		}
		if(item=="panipuri")
		{
			return 30.00;
		}
		System.out.println("not found item");
		return 0;
		
		
	}
	public static String getMovie(String movie)
	{
		System.out.println("running getCode in class Table ");
		System.out.println("movie" +movie);
		if(movie=="kantar")
		{
			return "rishabShetty";
		}
		if(movie=="charlie")
		{
			return "rashitShetty";
		}
		if(movie=="badManners")
		{
			return "duniyaSoori";
		}
		if(movie=="KGF")
		{
			return "prashanthNeel";
		}
		if(movie=="Upendra")
		{
			return "upendra";
		}
		return "not found";
	}
	
} 