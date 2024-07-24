class AutoDriverRunner
{
public static void main(String[] args)
{
System.out.println("Start main in AutoDriverRunner");
AutoDriver autoDriver=new AutoDriver();
String Name=autoDriver.Name;
int experience=autoDriver.experience;
String licenseNumber=autoDriver.licenseNumber;
System.out.println("autoDriver Name:"+Name);
System.out.println("autoDriver experience:"+experience);
System.out.println("autoDriver licenseNumber:"+licenseNumber);
System.out.println("Stop main in AutoDriverRunner");
}
}
