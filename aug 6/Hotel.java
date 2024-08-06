class Hotel{
String name="Sagar";
Owner owner=new Owner();
public void display(){
System.out.println(" Name:"+this.name);
	
System.out.println("Owner Name:"+this.owner.name);
System.out.println("Owner Age:"+this.owner.age);
System.out.println("Owner gender:"+this.owner.gender);
}
}