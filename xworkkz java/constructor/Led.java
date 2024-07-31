class Led
{
	String colorTemperature;
	int lifeSpan;
	String Voltage;
	
	Led(String colorTemperatureLocal,int lifeSpanLocal,String VoltageLocal)
	{
		colorTemperature=colorTemperatureLocal;
		lifeSpan=lifeSpanLocal;
		Voltage=VoltageLocal;
		System.out.println("colorTemperature:" +colorTemperature);
		System.out.println("lifeSpan:" +lifeSpan);
		System.out.println("Voltage:" +Voltage);
		
		
	}
}