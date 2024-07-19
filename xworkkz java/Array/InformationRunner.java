class InformationRunner
{
	public static void main(String[] states)
	{
		System.out.println("running main");
		String[] indiaStates={"Andhra Pradesh","Arunachal Pradesh", "Assam","Bihar","Chhattisgarh","Goa", "Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya",
		"Mizoram", "Nagaland","Odisha", "Punjab","Rajasthan", "Sikkim","Tamil Nadu", "Telangana","Tripura","Uttar Pradesh","Uttarakhand", "West Bengal"};
		Information.State(indiaStates);
		Information.StateBackward(indiaStates);
		
		int[] indiaPincode={110001,400001,600001,700001,800001,110002,400002,600002,700002,800002};
		Information.pincode(indiaPincode);
		
		String[] IndiaCMinisters={"Narendra Modi","Amit Shah","Rajnath Singh", "Nirmala Sitharaman","Nitin Gadkari","S. Jaishankar",
		"Piyush Goyal","Ravi Shankar Prasad","Smriti Irani","Dharmendra Pradhan","Prakash Javadekar","Harsh Vardhan","Pralhad Joshi","Ramesh Pokhriyal 'Nishank'",
		"Thaawar Chand Gehlot","Arjun Munda","Mukhtar Abbas Naqvi","Gajendra Singh Shekhawat","Giriraj Singh","Narendra Singh Tomar","Dharmendra Debendra Pradhan",
		"Mansukh L. Mandaviya","Anurag Thakur","Kiren Rijiju","Jyotiraditya Scindia","Sarbananda Sonowal","Bhupender Yadav","Ashwini Vaishnaw","Narayan Tatu Rane",
        "Minakshi Lekhi"};
		Information.CabinetMinister(IndiaCMinisters);
		Information.CabinetMinisterBackward(IndiaCMinisters);
		
		String[] indaiParties={"Bharatiya Janata Party (BJP)","Indian National Congress (INC)","Aam Aadmi Party (AAP)","Bahujan Samaj Party (BSP)",
        "Communist Party of India (Marxist) (CPI-M)"};
		Information.politicalParties(indaiParties);
		Information.politicalPartiesBackward(indaiParties);
		
		
	}
}