class Runner
{
	public static void main(String[] args)
	{
		Speaker speaker=new  Speaker("JBL");//constructor
		speaker.cost=150;//reference
		speaker.setSize('s');//setter method
		speaker.display();//for display
		
		
		Speaker speaker1=new  Speaker("Bose");
		speaker1.cost=200;
		speaker1.setSize('M');
		speaker1.display();
		
		Speaker speaker2=new  Speaker("Sonos");
		speaker2.cost=200;
		speaker2.setSize('M');
		speaker2.display();
		
		System.out.println("--------------------");
		
		Rocket rocket=new  Rocket("2500 to 4500m/s");//constructor
		rocket.fuelCapacity="18liter";//reference
		rocket.setnoOfThrusters(50);//setter method
		rocket.display();//for display
		
		
		Rocket rocket1=new  Rocket("2600 to 4500m/s");//constructor
		rocket1.fuelCapacity="19liter";//reference
		rocket1.setnoOfThrusters(100);//setter method
		rocket1.display();
		
		Rocket rocket2=new  Rocket("3500 to 4500m/s");//constructor
		rocket2.fuelCapacity="20liter";//reference
		rocket2.setnoOfThrusters(150);//setter method
		rocket2.display();
		
		
		System.out.println("--------------------");
		
		Chocolate chocolate= new Chocolate("cadburry");
		chocolate.setsize('s');
		chocolate.price=20;
		chocolate.display();
		
		Chocolate chocolate1= new Chocolate("milky");
		chocolate1.setsize('l');
		chocolate1.price=50;
		chocolate1.display();
		
		Chocolate chocolate2= new Chocolate("cookies");
		chocolate2.setsize('m');
		chocolate2.price=30;
		chocolate2.display();
		
		System.out.println("--------------------");
		
		Projector projector=new Projector("LCD");
		projector.setcolor("black");
		projector.weight=567.98;
		projector.display();
		
		Projector projector1=new Projector("DLP");
		projector1.setcolor("white");
		projector1.weight=523.98;
		projector1.display();
		
		Projector projector2=new Projector("LED");
		projector2.setcolor("Red");
		projector2.weight=678.98;
		projector2.display();
		
		System.out.println("--------------------");
		
		Paper paper=new Paper("0.005mm");
		paper.setsize('s');
		paper.color="white";
		paper.display();
		
		Paper paper1=new Paper("0.004mm");
		paper1.setsize('m');
		paper1.color="red";
		paper1.display();
		
		Paper paper2=new Paper("0.003mm");
		paper2.setsize('l');
		paper2.color="yellow";
		paper2.display();
		
		
		
	}
}