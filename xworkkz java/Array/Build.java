class Build
{
	public static void main(String[] palaces)
	{
		if(palaces.length==4)
		{
			System.out.println("get 4 values");
			String palaceName=palaces[0]; 
			String palaceLocation=palaces[1]; 
			String palaceBuiltBy=palaces[2]; 
			String palaceBuildYear=palaces[3]; 
			System.out.println("placeName :" +palaceName);
			System.out.println("placeLocation :" +palaceLocation);
			System.out.println("placeBuiltBy :" +palaceBuiltBy);
			System.out.println("placeBuildYear :" +palaceBuildYear);
		}
		System.out.println("not enough");
	}
	
	
		
}