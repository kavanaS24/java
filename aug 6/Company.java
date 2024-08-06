class Company{
String name="Accenture";
int id=2;
String location="Banglore";

SoftwareEngineer softwareEngineer=new SoftwareEngineer();
public void display(){
System.out.println(" Name:"+this.name);
System.out.println(" id:"+this.id);
System.out.println(" Location:"+this.location);
	
System.out.println("SoftwareEngineer Name:"+this.softwareEngineer.name);
System.out.println("SoftwareEngineer experience:"+this.softwareEngineer.experience);
System.out.println("SoftwareEngineer designation:"+this.softwareEngineer.designation);
System.out.println("SoftwareEngineer salary:"+this.softwareEngineer.salary);
}
}