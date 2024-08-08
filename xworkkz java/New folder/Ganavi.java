class Ganavi
{
	String name;
	Clip clip;
	
	Ganavi(String name,Clip clip)
	{
		this.name=name;
		this.clip=clip;
	}
	public void display()
	{
		System.out.println("Name :"+name);
		this.clip.show();
		
	}
}