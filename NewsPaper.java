class NewsPaper{

     String name;
	 String lang;
	 Float price;
	 
	 
	NewsPaper()
	{
		System.out.println("default const");
	}		
	 
	 NewsPaper(String name,String lang)
	 {
		 this.name=name;
		 this.lang=lang;
	 }
	 

 void displayInfo()
 {
	System.out.println("display parent class1"); 
 }
 void displayAds()
 {
	System.out.println("display parent class2");
	 
}
 
}