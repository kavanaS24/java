

 class LookupRunner {
public static void main(String[] args) {
Lookup lookup = new Lookup();

String code = "USA";
String country = lookup.getCountry(code);
System.out.println("Country for code " + code + ": " + country);

String item = "Apple";
double price = lookup.getPrice(item);
System.out.println("Price for " + item + ": " + price);

String movie = "Avatar";
String producer = lookup.getProducer(movie);
System.out.println("Producer for " + movie + ": " + producer);
}
}

