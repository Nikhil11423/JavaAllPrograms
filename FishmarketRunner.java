class FishmarketRunner 
{
public static void main(String[] args)
{
	
Fishmarket fishmarket =new Fishmarket();
fishmarket.name ="Anna Market";
fishmarket.location = "Jayanager";
fishmarket.openTime = 7.00;
fishmarket.closeTime = 11.00;
fishmarket.totalshop = 30;

System.out.println(fishmarket.name);
System.out.println(fishmarket.location);
System.out.println(fishmarket.openTime);
System.out.println(fishmarket.closeTime);
System.out.println(fishmarket.totalshop);
}
}