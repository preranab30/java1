class FishRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main method");
		
		Fish fish=new Fish("Queen",6000);
		Fish fish1=new Fish("gold",7000);
		Fish fish2=new Fish("silver",8000);
		Fish fish3=new Fish("Blue",10000);
		Fish fish4=new Fish("fishy",12000);
		Fish fish5=new Fish("Nemo",7800);
		Fish fish6=new Fish("Bob",9000);
		Fish fish7=new Fish("bubblies",2000);
		Fish fish8=new Fish("oscar",1000);
		Fish fish9=new Fish("sushi",67000);
		Fish fish10=new Fish("goldie",87000);
		System.out.println(fish1);
		
		
		Lamp lamp=new Lamp("medium",34);
		Lamp lamp1=new Lamp("Low",35);
		Lamp lamp2=new Lamp("High",31);
		Lamp lamp4=new Lamp("medium",32);
		Lamp lamp5=new Lamp("High",30);
		Lamp lamp6=new Lamp("medium",38);
		Lamp lamp7=new Lamp("Low",36);
		Lamp lamp8=new Lamp("medium",37);
		Lamp lamp9=new Lamp("High",35);
		Lamp lamp10=new Lamp("medium",32);
		Lamp lamp11=new Lamp("Low",33);
		//System.out.println(lamp);
		
		PrintingMachine printingmachine=new PrintingMachine("Canon",10000);
		PrintingMachine printingmachine1=new PrintingMachine("HP",20000);
		PrintingMachine printingmachine2=new PrintingMachine("Epson",30000);
		PrintingMachine printingmachine3=new PrintingMachine("Brother",40000);
		PrintingMachine printingmachine4=new PrintingMachine("Xerox",50000);
		PrintingMachine printingmachine5=new PrintingMachine("Lexmark",60000);
		PrintingMachine printingmachine6=new PrintingMachine("Samsung",70000);
		PrintingMachine printingmachine7=new PrintingMachine("OKI",320000);
		PrintingMachine printingmachine8=new PrintingMachine("Dell",43000);
		PrintingMachine printingmachine9=new PrintingMachine("Konica Minolta",53000);
		PrintingMachine printingmachine10=new PrintingMachine("Ricoh",98000);
		
		
		Lens lens=new Lens("2.3cm",200);
		Lens lens1=new Lens("2.4cm",100);
		Lens lens2=new Lens("2.2cm",300);
		Lens lens3=new Lens("1.3cm",600);
		Lens lens4=new Lens("4.3cm",200);
		Lens lens5=new Lens("1.5cm",700);
		Lens lens6=new Lens("5.3cm",900);
		Lens lens7=new Lens("2.8cm",200);
		Lens lens8=new Lens("2.5cm",300);
		Lens lens9=new Lens("2.3cm",700);
		Lens lens10=new Lens("2.6cm",200);
		
		Coil coil=new Coil(12,20);
		Coil coil1=new Coil(13,20);
		Coil coil2=new Coil(14,24);
		Coil coil3=new Coil(15,20);
		Coil coil4=new Coil(16,28);
		Coil coil5=new Coil(17,25);
		Coil coil6=new Coil(18,20);
		Coil coil7=new Coil(19,20);
		Coil coil8=new Coil(23,20);
		Coil coil9=new Coil(25,20);
		Coil coil10=new Coil(22,26);
		
		Cap cap=new Cap("red",1000,'s');
		Cap cap1=new Cap("balck",4000,'m');
		Cap cap2=new Cap("orage",5000,'l');
		Cap cap3=new Cap("yellow",8000,'s');
		Cap cap4=new Cap("blue",6000,'m');
		Cap cap5=new Cap("green",1000,'l');
		Cap cap6=new Cap("purple",7000,'s');
		Cap cap7=new Cap("red",3000,'s');
		Cap cap8=new Cap("white",4000,'m');
		Cap cap9=new Cap("grey",3000,'s');
	    Cap cap10=new Cap("skyblue",2000,'l');
		
		Gold gold=new Gold("good",230000,24);
		Gold gold1=new Gold("bad",270000,24);
		Gold gold2=new Gold("best",240000,24);
		Gold gold3=new Gold("poor",230000,24);
		Gold gold4=new Gold("vearygood",230000,24);
		Gold gold5=new Gold("good",230000,24);
		Gold gold6=new Gold("poor",260000,24);
		Gold gold7=new Gold("bad",230000,24);
		Gold gold8=new Gold("good",290000,24);
		Gold gold9=new Gold("best",280000,24);
		Gold gold10=new Gold("good",230000,24);
		
		Led led=new Led("warm white",250,"240v");
		Led led1=new Led("cool white",250,"240v");
		Led led2=new Led("neutral white",250,"240v");
		Led led3=new Led("warm white",250,"240v");
		Led led4=new Led("cool white",250,"240v");
		Led led5=new Led("warm white",250,"240v");
		Led led6=new Led("neutal white",250,"240v");
		Led led7=new Led("cool white",250,"240v");
		Led led8=new Led("warm white",250,"240v");
		Led led9=new Led("cool white",250,"240v");
		Led led10=new Led("neutral white",250,"240v");
		
		
		Borad borad=new Borad("2.3cm",678);
		Borad borad1=new Borad("2.3cm",678);
		Borad borad2=new Borad("2.3cm",678);
		Borad borad3=new Borad("2.3cm",678);
		Borad borad4=new Borad("2.3cm",678);
		Borad borad5=new Borad("2.3cm",678);
		Borad borad6=new Borad("2.3cm",678);
		Borad borad7=new Borad("2.3cm",678);
		Borad borad8=new Borad("2.3cm",678);
		Borad borad9=new Borad("2.3cm",678);
		Borad borad10=new Borad("2.3cm",678);
		
		
		SimCard simcard=new SimCard("jio",249,"32gb");
		SimCard simcard1=new SimCard("jio",249,"32gb");
		SimCard simcard2=new SimCard("jio",249,"32gb");
		SimCard simcard3=new SimCard("jio",249,"32gb");
		SimCard simcard4=new SimCard("jio",249,"32gb");
		SimCard simcard5=new SimCard("jio",249,"32gb");
		SimCard simcard6=new SimCard("jio",249,"32gb");
		SimCard simcard7=new SimCard("jio",249,"32gb");
		SimCard simcard8=new SimCard("jio",249,"32gb");
		SimCard simcard9=new SimCard("jio",249,"32gb");
		SimCard simcard10=new SimCard("jio",249,"32gb");
		
		
		System.out.println("end main method");
	}
}