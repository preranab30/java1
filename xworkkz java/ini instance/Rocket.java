class Rocket
{
	String country="India";
	String speed;
	String fuelCapacity;
	int noOfThrusters;
	public Rocket(String speed)
	{
		this.speed=speed;
	}
	
	public void setnoOfThrusters(int noOfThrusters)
	{
		this.noOfThrusters=noOfThrusters;
	}
	
	public void display()
	{
		System.out.println("country :"+this.country);
		System.out.println("speed :"+this.speed);
		System.out.println("fuel Capacity :"+this.fuelCapacity);
		System.out.println("no Of Thrusters :"+this.noOfThrusters);
	}
}