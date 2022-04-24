class BusStopRunner{

public static void main(String[] args)
{
 BusStop stop=new BusStop();
 stop.name="BTM";
 //stop.busNos=new String[3];
 stop.busNos[0]="25A";
 stop.busNos[1]="500D";
 stop.busNos[2]="600F";
 stop.totalSeats=10;
 
 
 System.out.println(stop.name);
 System.out.println(stop.busNos[1]);
 System.out.println(stop.totalSeats);
 
 BusStop stop1=new GovtBusStop();
 GovtBusStop cst=(GovtBusStop)stop1;
 cst.inauguratedBy="MLS";
 System.out.println(cst.inauguratedBy);
 
 BusStop stop2=new PrivateBusStop();
 PrivateBusStop cm=(PrivateBusStop)stop2;
 cm.ac=true;
 System.out.println(cm.ac);
}


}