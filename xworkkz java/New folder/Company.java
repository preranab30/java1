class Company
{
	 int id=102;
	 String name="TCS";
	 String location="bengulur";
	 SoftwareEngineer softwareEngineer = new SoftwareEngineer("prerana",2,"software developer",20000000);
	 Company()
	 {
		 System.out.println("no argument cons..");
	 }
	 public void torisu()
	 {
		 System.out.println("ID :"+this.id);
		 System.out.println("Name:"+this.name);
		 System.out.println("location :"+this.location);
		 this.softwareEngineer.torisu();
	 }
	 
}