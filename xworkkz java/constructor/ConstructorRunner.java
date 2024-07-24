class ConstructorRunner
//constructor is special method which supplied by java it helps to make copy of object using new keyword
{
	public static void main(String[] args)
	{
		System.out.println("start of construtor ");
		new Constructor();
		System.out.println("end of constructor");
		
		//allocate instance memory
		//invoke constructor
		// return memory loction of copy of the class instance 
		//refernec of memory loction we can write or it option
		Constructor anything=new Constructor();
		//var declartion datatype refName=instaintaination---make copy of class instance
		Constructor constructor=new Constructor();//it is std to var declation datatype with small latter of 
		//datatype as reffernce
		Constructor constructor1=new Constructor();
		//constructor=constructor1;  //assigning memory location of one con1 to con it is possible because it is same datatype
		
		
	}



}