class PetrolBunk
{
 String name;
 String location ="Nej";
 String gstNo;
 String ownerName;
 final double petrolPrice;
 final double diselPrice;
 
 PetrolBunk(String name,String gstNo)
 {
	 this(0,0);
	 this.name=name;
	 this.gstNo=gstNo;
 }
 
 PetrolBunk(String name,String gstNo,String location,String ownerName)
       
 {
     this(103,91.50);
	 this.location=location;
	 this.ownerName=ownerName;
	System.out.println("Bhoj");
	System.out.println("Dhanraj");
 }
 
 PetrolBunk(String name,String gstNo,String location,String ownerName,double petrolPrice,double diselPrice)
 {
	 this(101.30,11.0);
	 this.gstNo=gstNo;
	 this.location=location;
	 this.ownerName=ownerName;
	 
 }
 
 PetrolBunk(double petrolPrice,double diselPrice)
 {
	 this.petrolPrice=petrolPrice;
     this.diselPrice=diselPrice;
	 
 }
 
}

 
 