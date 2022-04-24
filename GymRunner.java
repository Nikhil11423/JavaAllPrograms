class GymRunner
{
public static void main(String[] args)
{
	
Gym gym =new Gym();
gym.name ="Golden Gym";
gym.fee  = 7000;
gym.openTime = 6.00;
gym.closeTime = 9.00;
gym.location  = "jaynagar";
gym.totalGymmembers = 15;
gym.inTime = 7.00;
gym.outTime = 8.00;

System.out.println(gym.name);
System.out.println(gym.fee);
System.out.println(gym.openTime);
System.out.println(gym.closeTime);
System.out.println(gym.location);
System.out.println(gym.inTime);
System.out.println(gym.outTime);
System.out,println(gym.totalGymmembers);
}



}