 class Paint2 {
public void getBrand(String brand) {
System.out.println("Brand: " + brand);
}


public void getPaintDetails(String brand, String color) {
System.out.println("Brand: " + brand + ", Color: " + color);
}


public void getPaintPrice(String brand, double price) {
System.out.println("Brand: " + brand + ", Price: " + price);
}


public void getPaintInfo(String color, String type, double price) {
System.out.println("Color: " + color + ", Type: " + type + ", Price: " + price);
}
}

class PaintRunner{
public static void main(String[] args){

Paint2 paint = new Paint();
paint2.getBrand("Acme");
paint2.getPaintDetails("Acme", "Red");
paint2.getPaintPrice("Acme", 19.99);
paint2.getPaintInfo("Blue", "Latex",29.99);
}
}