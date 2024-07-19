//Method to take states: String[] : 29
//2. Methos to take pincode: int[]: 10
//3. Method to take primeminister:String[]: All
//4. Method to take Cabinet ministers:String[]: 30
//5. Method to take political parties:String[]: 5

class Information
{
	public static void State(String[] states)
	{
		for(int start=0; start<states.length;start++)
		{
			System.out.println("start of loop");
			System.out.println("States :"+states[start]);
		}
		System.out.println("end of loop");
		
	}
	public static void pincode(int[] pincodes)
	{
		for(int start=0; start<pincodes.length;start++)
		{
			System.out.println("start of loop");
			System.out.println("Pincode :"+pincodes[start]);
		}
		System.out.println("end of loop");
	}
	public static void CabinetMinister(String[] ministers)
	{
		for(int start=0; start<ministers.length;start++)
		{
			System.out.println("start of loop");
			System.out.println("cabinate Minisetrs :"+ministers[start]);
		}
		System.out.println("end of loop");
		
	}
	
	public static void politicalParties(String[] parties)
	{
		for(int start=0; start<parties.length;start++)
		{
			System.out.println("start of loop");
			System.out.println("political Parties :"+parties[start]);
		}
		System.out.println("end of loop");
	}
	

	public static void StateBackward(String[] states)
	{
		System.out.println("===========================================");
		for(int start=states.length-1; start>=0;start--)
		{
			System.out.println("start of loop");
			System.out.println("States :"+states[start]);
		}
		System.out.println("end of loop");
	}
    public static void pincodeBackward(int[] pincodes)
	{
		for(int start=pincodes.length-1; start>=0;start--)
		{
			System.out.println("start of loop");
			System.out.println("Pincode :"+pincodes[start]);
		}
		System.out.println("end of loop");
	}
    public static void CabinetMinisterBackward(String[] ministers)
	{
		for(int start=ministers.length-1; start>=0;start--)
		{
			System.out.println("start of loop");
			System.out.println("cabinate Minisetrs :"+ministers[start]);
		}
		System.out.println("end of loop");
		
	}	
	public static void politicalPartiesBackward(String[] parties)
	{
		for(int start=parties.length-1; start>=0;start--)
		{
			System.out.println("start of loop");
			System.out.println("political Parties :"+parties[start]);
		}
		System.out.println("end of loop");
	}
	
}


