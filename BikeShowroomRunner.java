class  BikeShowroomRunner{
	public static void main(String[] virat)
	{	
		String[] Bikebrand={"Hero","Suzuki"};
		System.out.println("Total Bike Brand;" +Bikebrand.length);
		
		BikeShowroom.setBrand(bikeBrand);
		String brandPassed=virat[1];
		
		System.out.println("brandPassed "+brandPassed);
		double price= BikeShowroom.sellingbike(brandPassed);
		System.out.println(price);
	}

}