class BikeShowroom{
	
	static String name;
	static String[] brand;
	
	static void setBrand(String[] brand)
	{
		BikeShowroom.brand=brand;
		
	}
	static int sellingbike(String brand)
	{
		if(brand !=null)
		{
			for(int index=0;index<BikeShowroom.brand.length;index++)
			{
				String element=BikeShowroom.brand[index];
				if(element.equals("Hero") && element.equals(brand))
				{
					System.out.println("Brand name : "+brand);
					return 67000;
				}	
				else
				{
					System.out.println("Brand not match : "+brand);
				}
				if(element.equals("Suzuki") && element.equals(brand))
				{
					System.out.println("Brand name : "+brand);
					return 85000;
				}	
				else
				{
					System.out.println("Brand not match : "+brand);
				}	
				
			}
		}return 0;
	}
	
	