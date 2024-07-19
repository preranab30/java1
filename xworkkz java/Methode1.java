class Methode1
{
	int q=20;
	int x=30;
   static int y=40;
   static int z=50;
   public static void main(String[] args)
   {
   Methode1 r= new Methode1();
   r.disp();
   Methode1.show();
   Methode1.print();
   Methode1 s=new Methode1();
   s.click();
   }
   
   public static void show()
   {
   System.out.println(y);
   }
   
   void disp()
   {
   System.out.println(x);
   }
   
   static void print()
   {
	 System.out.println(z);  
   }
   
   public void click()
   {
	   System.out.println(q);
   }
   
   
}