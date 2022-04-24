class SanitizerRunner{

public static void main(String[] val)
{

     Sanitizer sanitizer;
	 sanitizer=new Sanitizer();
	 sanitizer.brand="Santour";
	 sanitizer.price= 59.1;
	 sanitizer.color= "Pink";
	 sanitizer.alcoholContent=01.3;
	 
	 
	 System.out.println(sanitizer.brand);
	 System.out.println(sanitizer.price);
     System.out.println(sanitizer.color);
     System.out.println(sanitizer.alcoholContent);
	 
	 
	 
	 System.out.println("***************************************************");
	 
	Sanitizer sanitizer1=new Sanitizer();
	
	System.out.println("**************************************************");
	
	Sanitizer sanitizer2=new Sanitizer();
	sanitizer2.brand="LB";
	sanitizer2.price=45.0;
   
    System.out.println(sanitizer2.brand);
    System.out.println(sanitizer2.price);
	System.out.println(sanitizer2.color);
     System.out.println(sanitizer2.alcoholContent);
	
	System.out.println("*************************************************");
	Sanitizer sanitizer3=new Sanitizer();
	sanitizer3.color="pink";
	sanitizer3.alcoholContent=02.4;
	
	System.out.println(sanitizer.brand);
    System.out.println(sanitizer.price);
	System.out.println(sanitizer2.color);
    System.out.println(sanitizer2.alcoholContent);
	
	
	
	
	
}





}