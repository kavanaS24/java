class JuiceRunner
{
public static void main(String[] args)
{
System.out.println("Start main in JuiceRunner");
Juice juice=new Juice();
String flavor=juice.flavor;
    double price=juice.price;
    String brand=juice.brand;
System.out.println("juice flavor:"+flavor);
System.out.println("juice price:"+price);
System.out.println("juice brand:"+brand);
System.out.println("Stop main in JuiceRunner");
juice.flavor="Mango";
juice.price=40;
juice.brand="Maaza";
System.out.println("juice updated flavor:"+juice.flavor);
System.out.println("juice updated price:"+juice.price);
System.out.println("juice updated brand:"+juice.brand);

}
}
