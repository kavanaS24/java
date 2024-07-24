class AirConditionRunner{
public static void main(String[] args)
{
System.out.println("Start main in AirConditionRunner");
AirCondition airCondition=new AirCondition();
double temperature=airCondition.temperature;
String brand=airCondition.brand;
String model=airCondition.model;
System.out.println("airCondition temperature:"+temperature);
System.out.println("airCondition brand:"+brand);
System.out.println("airCondition model:"+model);
System.out.println("Stop main in AirConditionRunner");
}
}
