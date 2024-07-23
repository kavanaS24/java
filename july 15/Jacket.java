class Jacket{
public static void main(String[] args){
System.out.println("start main in Country");

String[] state={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh", "Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh","Uttarakhand","West Bengal"};
for(int name=0;name<state.length;name++)
{
String ref=state[name];
System.out.println("state:"+ref);
}
System.out.println("end main in Country");
}
}
