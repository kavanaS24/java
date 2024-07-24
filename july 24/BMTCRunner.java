class BMTCRunner
{
public static void main(String[] args)
{
System.out.println("Start main in BMTCRunner");
BMTC bMTC=new BMTC();
String busNumber=bMTC.busNumber;
int capacity=bMTC.capacity;
String routeNumber=bMTC.routeNumber;
System.out.println("bMTC busNumber:"+busNumber);
System.out.println("bMTC capacity:"+capacity);
System.out.println("bMTC routeNumber:"+routeNumber);
System.out.println("Stop main in BMTCRunner");
}
}
