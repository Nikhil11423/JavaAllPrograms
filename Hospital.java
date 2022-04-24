class Hospital 
{
	//instant variables 
	String name;
	Integer noOfBeds;
	Integer noOfDoctors;
	HospitalType hospitalType;
	HospitalSpecilization hospitalSpecilization;
	Integer noOfSecurity;
	
 
  Hospital(String name) // parameter varibales 
  {
	  this.name = name;
	  System.out.println(name);
	  //System.out.println("MG");
	  
  }
     Hospital(String name, Integer noOfBeds)
  {
	  this(name);//this method 
	  this.noOfBeds = noOfBeds; // this keyword 
	  System.out.println(noOfBeds);
	  
  }
  Hospital(String name,Integer noOfBeds,Integer noOfDoctors)
  {
	 this(name,noOfBeds);
	 this.noOfDoctors =noOfDoctors;
	System.out.println(noOfDoctors);
	  
  }
  Hospital(String name,Integer noOfBeds, Integer noOfDoctors,HospitalType hospitalType)
  {
	  this(name,noOfBeds,noOfDoctors);
	  this.hospitalType =hospitalType;
	  System.out.println(hospitalType);
  }
  
  Hospital(String name,Integer noOfBeds,Integer noOfDoctors ,HospitalType hospitalType,HospitalSpecilization hospitalSpecilization)
  {
	  this(name,noOfDoctors,noOfBeds,hospitalType);
	  this.hospitalSpecilization =hospitalSpecilization;
	  System.out.println(hospitalSpecilization);
  } 
  Hospital(String name,Integer noOfBeds,Integer noOfDoctors,HospitalType hospitalType,HospitalSpecilization hospitalSpecilization,Integer noOfSecurity)
  {
	  this(name,noOfBeds,noOfDoctors,hospitalType,hospitalSpecilization);
	  this.noOfSecurity = noOfSecurity;
	  System.out.println(noOfSecurity); 
  }
	
} 