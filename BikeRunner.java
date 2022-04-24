class BikeRunner{

public static void main(String[] args){

Bike bike=new Bike();

bike.type=2;
bike.tireSize=15.38f;
bike.mileage=50;
bike.price=65000;
bike.width=5.6;

System.out.println(bike.type);
System.out.println(bike.tireSize);
System.out.println(bike.mileage);
System.out.println(bike.price);
System.out.println(bike.width);
}
}