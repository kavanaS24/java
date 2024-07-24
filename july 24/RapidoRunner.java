class RapidoRunner
{
public static void main(String[] args)
{
System.out.println("Start main in RapidoRunner");
Rapido rapido=new Rapido();
String driverName=rapido.driverName;
boolean isAvailable=rapido.isAvailable;
String bikeNumber=rapido.bikeNumber;
System.out.println("rapido driverName:"+driverName);
System.out.println("rapido isAvailable:"+isAvailable);
System.out.println("rapido bikeNumber:"+bikeNumber);
System.out.println("Stop main in RapidoRunner");
}
}
