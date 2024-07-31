class InfoRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in ConstructorRunner");
		Rupee rupee = new Rupee();
		String ref = rupee.name;
		System.out.println("Rupee name:"+ref);
		char ref1 = rupee.coin;
		System.out.println("Rupee coin:"+ref1);
		int ref2 = rupee.quantity;
		System.out.println("Rupee quantity:"+ref2);
		
		AirConditioner airConditioner = new AirConditioner();
		String name = airConditioner.companyName;
		System.out.println("AirConditioner companyName:"+name);
		double cost = airConditioner.price;
		System.out.println("AirConditioner price:"+cost);
		int warrantyYears = airConditioner.warrantyYears;
		System.out.println("AirConditioner warrantyYears:"+warrantyYears);
		
		Autorikshaw autoRikshaw = new Autorikshaw();
		int seatingCapacity = autoRikshaw.seatingCapacity;
		System.out.println("Autorikshaw seatingCapacity:"+seatingCapacity);
		double price = autoRikshaw.price;
		System.out.println("Autorikshaw price:"+price);
		String modeOfFules = autoRikshaw.modeOfFules;
		System.out.println("Autorikshaw modeOfFules:"+modeOfFules);
		
		AutoDriver autoDriver = new AutoDriver();
		String name1 = autoDriver.name;
		System.out.println("AutoDriver name:"+name1);
		int age = autoDriver.age;
		System.out.println("AutoDriver age:"+age);
		char gender = autoDriver.gender;
		System.out.println("AutoDriver gender:"+gender);
		
		Rapido rapido = new Rapido();
		String name2 = rapido.driverName;
		System.out.println("Rapido driverName:"+name2);
		double price1 = rapido.price;
		System.out.println("Rapido price:"+price1);
		double appRating = rapido.appRating;
		System.out.println("Rapido appRating:"+appRating);
		
		CabCompany cabCompany = new CabCompany();
		String companyName = cabCompany.companyName;
		System.out.println("cabCompany companyName:"+companyName);
		String vehicleColor = cabCompany.vehicleColor;
		System.out.println("cabCompany color:"+vehicleColor);
		String companyLoc =  cabCompany.companyLoc;
		System.out.println("cabCompany companyLoc:"+companyLoc);
		
		BMTC bMTC = new BMTC();
		String busColor = bMTC.busColor;
		System.out.println("BMTC busColor:"+busColor);
		double price2 = bMTC.price;
		System.out.println("BMTC price:"+price2);
	    String destination = bMTC.destination;
		System.out.println("BMTC destination:"+destination);
		
		FoodDeliveryCompany foodDeliveryCompany = new FoodDeliveryCompany();
		String name3= foodDeliveryCompany.name;
		System.out.println("FoodDeliveryCompany name:"+name3);
		double price3= foodDeliveryCompany.chargeOnDelivery;
		System.out.println("FoodDeliveryCompany price:"+price3);
		
		
		Matrimony matrimony = new Matrimony();
		double membershipFee = matrimony.membershipFee;
		System.out.println("Matrimony membershipFee:"+membershipFee);
		int userCount= matrimony.userCount;
		System.out.println("Matrimony userCount:"+userCount);
		String personName = matrimony.personName;
		System.out.println("Matrimony personName:"+personName);
		matrimony.membershipFee=3000.0;
		System.out.println("Matrimony updated membershipFee:"+matrimony.membershipFee);
		matrimony.userCount=20000;
		System.out.println("Matrimony updated userCount:"+matrimony.userCount);
		matrimony.personName = "Prajakta";
		System.out.println("Matrimony updated personName:"+matrimony.personName);
		
		Application application = new Application();
		String nameOfApp = application.name1;
		System.out.println("Application numberOfUsers:"+nameOfApp);
	    int number = application.number;
		System.out.println("Application appName:"+number);
	    application.name1 = "googlewebsite";
		System.out.println("Application updated numberOfUsers:"+application.name1);
	    application.number=2345;
		System.out.println("Application updated appName:"+application.number);
	    
		
		Fruit fruit = new Fruit();
		String fruitName = fruit.fruitName;
		System.out.println("Fruit Name:"+fruitName);
	    double cost2 = fruit.price;
		System.out.println("Fruit Cost:"+cost2);
	    int quantity = fruit.quantity;
		System.out.println("Fruit quantity:"+quantity);
		fruit.fruitName="Banana";
		System.out.println("Fruit Name updated:"+fruit.fruitName);
	    fruit.price = 90.0;
		System.out.println("Fruit Cost updated:"+fruit.price);
	    fruit.quantity = 24;
		System.out.println("Fruit quantity updated:"+fruit.quantity);
	}
}