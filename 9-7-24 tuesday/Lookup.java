
class Lookup {
public String getCountry(String code) {
if (code==90)
{ 
	return "United States";
}
if (code.equals("IND")) 
{	
return "India";
}
if (code.equals("CHN"))
{
	return "China";
}
if (code.equals("BRA")) 
{	
return "Brazil";
}
if (code.equals("RUS"))
{
	return "Russia";
}
return "Unknown";
}

public double getPrice(String item) {
if (item.equals("Apple")) 
{
	return 0.50;
}
if (item.equals("Banana")) 
{
	return 0.25;
}
if (item.equals("Orange"))
{
	return 0.75;
}
if (item.equals("Mango"))
{
	return 1.00;
}
if (item.equals("Grapes")) 
{
	return 1.50;
}
return 0.0;
}

public String getProducer(String movie) {
if (movie.equals("Avatar")) 
{
	return "James Cameron";
}
if (movie.equals("Titanic"))
{
	return "James Cameron";
}
if (movie.equals("Star Wars"))
{	
return "George Lucas";
}
if (movie.equals("The Avengers")) 
{
	return "Joss Whedon";
}
if (movie.equals("The Lion King"))
{
	return "Roger Allers";
}
return "Unknown";
}
}
