class Paint{

public static void Brand(String brand){
System.out.println("brand:"+brand);
}
public static void Details(String brand,String color){
System.out.println("brand:"+brand+",color:"+color);
}
public static void Price(String brand,double price){
System.out.println("brand:"+brand+",price:"+price);
}
public static void Info(String color,String type,double price){
System.out.println("color:"+color+",type:"+type+",price:"+price);
}
}

public static void main(String[] args)
{
	Paint.Brand("Nippon");
	Paint.Details("Burger","Blue");
	Paint.Price("Asian",9999);
	Paint.Info("Pink","Enamel",670.78);
}