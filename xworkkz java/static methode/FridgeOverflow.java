class FridgeOverflow
{
public static void cool()
{
System.out.println("Fridge cool the item");
light();
}
public static void light()
{
System.out.println("lighting");
cool();		
}
	
}