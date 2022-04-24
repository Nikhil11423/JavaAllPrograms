class Sanitizer{

 String brand;
 double price;
 String color;
 double alcoholContent;
 
 
 
 Sanitizer()
 {
	 System.out.println("Running a sanitizer const");
 }
 
 Sanitizer(String brand,double price)
 {
	 
	 this.brand=brand;
	 this.price=price;
 }	
 Sanitizer(double alcoholContent,String color)
 {
	 this.alcoholContent=alcoholContent;
	 this.color=color;
	 
 }


}