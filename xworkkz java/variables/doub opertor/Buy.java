//class Buy
//product(String brand,double price )
//product(String name,int quantity,String quantity,double price)
//bookMovieTicket(String name,String theaterName,int quantity,double price)
//buyEgg(int total,double pricePerEgg)
//buyShampoo(int quantityInMl,double price,String brand,String manfDate)
//buyCake(char size,String type,String flavour,double cost,int quantity)
//buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
//buySmartWatch(String brand,double price,int color,char type,int mode)
//main--> Buy.product("Lee",500);Buy.product("Lee",-200);
//Invoke total 16 times : MIN

class Buy
{
	public static void product(String brand,double price)
	{
		System.out.println("Runinng product method in class buy");
		System.out.println("brand:" +brand);
		System.out.println("Price:" +price);
        if(price<=5000.0  && price>=1000.0)
		{
			System.out.println("price is valid");
		}
       else{
		    System.out.println("price is invalid");
	   }
       	   
	}
	public static void product(String name,int quantity,String quality,double price)
	{
		System.out.println("Runinng product method in class buy");
		System.out.println("name:" +name);
		System.out.println("quantity:" +quantity);	
		System.out.println("quality:" +quality);
        System.out.println("price:" +price);
    if(price<=6000.0  && price>=7000.0)
		{
			System.out.println("price is valid");
		}
       else{
		    System.out.println("price is invalid");
	   }
       	   		
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("Runinng bookMovieTicket method in class buy");
		System.out.println("name:" +name);
		System.out.println("theaterName:" +theaterName);
		System.out.println("quantity:" +quantity);	
	    System.out.println("price:" +price);
    if(price<=1000.0 && price>=2000.0)
		{
			System.out.println("price is valid");
		}
       else{
		    System.out.println("price is invalid");
	   }
       	  		
	}
	public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("Runinng buyEgg method in class buy");
		System.out.println("Total:" +total);
		System.out.println("pricePerEgg:" +pricePerEgg);
    if(pricePerEgg<=20.0 && pricePerEgg>=40.0)
		{
			System.out.println("price is valid");
		}
       else{
		    System.out.println("price is invalid");
	   }		
				
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("Runinng buyShampoo method in class buy");
		System.out.println("QuantityInMl:" +quantityInMl);
		System.out.println("price:" +price);
	    System.out.println("brand:" +brand);	
		System.out.println("manfDate:" +manfDate);
		if(price<=1.0&& price>=4.0)
		{
			System.out.println("price is valid");
		}
       else{
		    System.out.println("price is invalid");
	   }	
        		
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("Runinng buyCake method in class buy");
		System.out.println("size:" +size);
		System.out.println("type:" +type);
		System.out.println("flavour:" +flavour);
		System.out.println("cost:" +cost);	
		System.out.println("quantity:" +quantity);
		if(cost<=50.0 && cost>=60.0)
		{
			System.out.println("price is valid");
		}
       else{
		    System.out.println("price is invalid");
	   }	
        
        		
	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("Runinng buyLaptop method in class buy");
		System.out.println("brand:" +brand);
		System.out.println("serialNo:" +serialNo);
		System.out.println("price:" +price);
		System.out.println("batteryCapacity:" +batteryCapacity);
        System.out.println("screenSize:" +screenSize);		
		System.out.println("os:" +os);
		System.out.println("harddiskSize:" +harddiskSize);
        System.out.println("ramSize:" +ramSize);
		if(price<=70000.0 && price>=80000.0)
		{
			System.out.println("price is valid");
		}
       else{
		    System.out.println("price is invalid");
	   }	
        
        		
        		
	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		System.out.println("Runinng buySmartWatch method in class buy");
		System.out.println("brand:" +brand);
		System.out.println("price:" +price);
		System.out.println("color:" +color);	
		System.out.println("type:" +type);
		System.out.println("mode:" +mode);
		if(price<=1000.0 && price>=2000.0)
		{
			System.out.println("price is valid");
		}
       else{
		    System.out.println("price is invalid");
	   }	
        
         		
	}	
}