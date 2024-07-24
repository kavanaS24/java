class PlaceRunner
{
public static void main(String[] args)
{
System.out.println("Start main in PlaceRunner");
Place place=new Place();
String name=place.name;
String location=place.location;
boolean isVisited=place.isVisited;
System.out.println("place name:"+name);
System.out.println("place location:"+location);
System.out.println("place isVisited:"+isVisited);
System.out.println("Stop main in PlaceRunner");
place.name="Siri cafe";
place.location="chikmagalur";
place.isVisited=true;
System.out.println("place updated name:"+place.name);
System.out.println("place updated location:"+place.location);
System.out.println("place updated isVisited:"+place.isVisited);

}
}
