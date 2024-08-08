class Ananya
{
	String mobile;
	Knife  knife;
	
	Ananya(String mobile,Knife knife)
	{
		this.mobile=mobile;
		this.knife=knife;
	}
	public void display()
	{
		System.out.println("mobile :"+mobile);
		this.knife.show();
		
	}
}