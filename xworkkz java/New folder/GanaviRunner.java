class GanaviRunner
{
	public static void main(String[] args)
	{
		Clip clip = new Clip("red",'s');
		Ganavi ganavi = new Ganavi("Ganavi@gmail.com",clip);
		ganavi.display();
		
		Clip clip1 = new Clip("blue",'l');
		Ganavi ganavi1 = new Ganavi("Ganavi@gmail.com",clip1);
		ganavi1.display();
	
	}
}