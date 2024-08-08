class KeybunchRunner
{
	public static void main(String[] args)
	
	{
		Key key = new Key(2.3F,"Link");
		Keybunch keybunch = new Keybunch("iron",key);
		keybunch.display();
		
		Key key1 = new Key(3.3F,"blue orange");
		Keybunch keybunch1 = new Keybunch("iron",key1);
		keybunch1.display();
	}
}
