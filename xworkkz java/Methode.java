class Methode
{
	int x=20;
   static int y=40;
   public static void main(String[] args)
   {
   Methode r= new Methode();
   r.disp();
   Methode.show();
   }
   
   static void show()
   {
   System.out.println(y);
   }
   
   void disp()
   {
   System.out.println(x);
   }
   
}