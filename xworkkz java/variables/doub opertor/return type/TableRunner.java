class TableRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main method");
		String country=Table.getCode(91);
		System.out.println("country:" +country);
		country=Table.getCode(86);
		System.out.println("country:" +country);
		country=Table.getCode(61);
		System.out.println("country:" +country);
		country=Table.getCode(81);
		System.out.println("country:" +country);
		country=Table.getCode(93);
		System.out.println("country:" +country);
		double cost=Table.getItem("iceCream");
		System.out.println("cost:" +cost);
	    cost=Table.getItem("chacolate");
		System.out.println("cost:" +cost);
	    cost=Table.getItem("cake");
		System.out.println("cost:" +cost);
	    cost=Table.getItem("pizza");
		System.out.println("cost:" +cost);
		cost=Table.getItem("panipuri");
		System.out.println("cost:" +cost);
		String movie=Table.getMovie("kantar");
		System.out.println("movie:" +movie);
		movie=Table.getMovie("charlie");
		System.out.println("movie:" +movie);
		movie=Table.getMovie("badManners");
		System.out.println("movie:" +movie);
		movie=Table.getMovie("KGF");
		System.out.println("movie:" +movie);
		movie=Table.getMovie("Upendra");
		System.out.println("movie:" +movie);
		
		
		System.out.println("-------------------------");
		System.out.println("running main method");
		double name =Hospital.getMadicine("avastin");
		System.out.println("name:" +name);
		name=Hospital.getMadicine("actrorise");
		name=Hospital.getMadicine("azel");
		
		String ref1=Hospital.getSymptom("cold");
		System.out.println("ref1" +ref1);
		ref1=Hospital.getSymptom("cough");
		System.out.println("ref1" +ref1);
		ref1=Hospital.getSymptom("fever");
		System.out.println("ref1" +ref1);
		
		String ref2=Hospital.getDoctor("dr.arcnaKucheri");
		System.out.println("ref2" +ref2);
		ref2=Hospital.getDoctor("dr.RPSMakkar");
		System.out.println("ref2" +ref2);
		ref2=Hospital.getDoctor("dr.yogeshJain");
		System.out.println("ref2" +ref2);
	}
}