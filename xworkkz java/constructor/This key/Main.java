class Main
{
	public static void main(String[] args)
	{
		Mask mask=new Mask();
		System.out.println(mask.cost);
		System.out.println(mask.size);
		System.out.println(mask.material);
		
		Mask mask1=new Mask(25);
		System.out.println(mask1.cost);
		System.out.println(mask1.size);
		System.out.println(mask1.material);
		
		Mask mask2=new Mask('s');
		System.out.println(mask2.cost);
		System.out.println(mask2.size);
		System.out.println(mask2.material);
		
		Mask mask3=new Mask("cottan");
		System.out.println(mask3.cost);
		System.out.println(mask3.size);
		System.out.println(mask3.material);
		
		Mask mask4=new Mask(25,'s',"cottan");
		System.out.println(mask4.cost);
		System.out.println(mask4.size);
		System.out.println(mask4.material);
		
		Mask mask5=new Mask(30,'m');
		System.out.println(mask5.cost);
		System.out.println(mask5.size);
		System.out.println(mask5.material);
		
		System.out.println("-------------");
		Kerosene kerosene=new Kerosene();
		System.out.println(kerosene.price);
		System.out.println(kerosene.quality);
		System.out.println(kerosene.quantity);
		
		Kerosene kerosene1=new Kerosene(100.0,25,true);
		System.out.println(kerosene1.price);
		System.out.println(kerosene1.quality);
		System.out.println(kerosene1.quantity);
			
		Kerosene kerosene2=new Kerosene(25);
		System.out.println(kerosene2.price);
		System.out.println(kerosene2.quality);
		System.out.println(kerosene2.quantity);
		
		Kerosene kerosene3=new Kerosene(200.0);
		System.out.println(kerosene3.price);
		System.out.println(kerosene3.quality);
		System.out.println(kerosene3.quantity);
			
			
		System.out.println("-----------");
		Aeroplane aeroplane=new Aeroplane();
		System.out.println(aeroplane.company);
		System.out.println(aeroplane.noOfSeats);
		System.out.println(aeroplane.ticketPrice);
		System.out.println(aeroplane.source);
		System.out.println(aeroplane.destination);
		
			
		
	    Aeroplane aeroplane1=new Aeroplane("Airospace",200,12000.0,"bengaluru","UK");
	    System.out.println(aeroplane1.company);
		System.out.println(aeroplane1.noOfSeats);
		System.out.println(aeroplane1.ticketPrice);
		System.out.println(aeroplane1.source);
		System.out.println(aeroplane1.destination);
		
		Aeroplane aeroplane2=new Aeroplane("Airospace",12000.0,"bengaluru","UK");
	    System.out.println(aeroplane2.company);
		System.out.println(aeroplane2.ticketPrice);
		System.out.println(aeroplane2.source);
		System.out.println(aeroplane2.destination);
		
		Aeroplane aeroplane3=new Aeroplane("Airospace","bengaluru","UK");
	    System.out.println(aeroplane3.company);
		System.out.println(aeroplane3.ticketPrice);
		System.out.println(aeroplane3.source);
		System.out.println(aeroplane3.destination);
		
		
		 
		 
		
			
			
			
		
		
		
		
	}
}