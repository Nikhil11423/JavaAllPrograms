class KitchenRunner{

public static void main(String[] args)
{
    
	Kitchen kitchen=new Kitchen();
    kitchen.numberOfDrawers=17;
	kitchen.lenghtInFeet=12;
	kitchen.widthInFeet=20;
	kitchen.windows=3;
	
	
	System.out.println(kitchen.numberOfDrawers);
	System.out.println(kitchen.lenghtInFeet);
	System.out.println(kitchen.widthInFeet);
	System.out.println(kitchen.windows);

}
}