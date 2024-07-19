class ReassignVar
{
	public static void main (String[] args)
	{
		byte birthOfYear=2018;
		birthOfYear=2045;//re-assign of refName
		
		int floorNo=234;
		int doorNo=floorNo;
		
		// == double equals operater
		
		int noOfStudent=100; // store location of adress
		int nooofHospital=100;
		
		boolean same= (noOfStudent==nooofHospital);
		System.out.println("same :" +same);
		 
		char shirtSize='M';
		char tshirtSize='M';
		
		same=shirtSize==tshirtSize;
		
	}
}