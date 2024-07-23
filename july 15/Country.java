class Country
{
public static void main(String[] pincode){
System.out.println("start main in Country");

int[] pincodes={577101,571109,590001,586113,583101,585201,561202,577115,561206,585226};
for(int name=0;name<=pincode.length;name++)
{
int ref=pincode[name];
System.out.println("pincode:"+ref);
}
System.out.println("start main in Country");
for(int name=pincode.length-1;name>0;name--)
{
int ref=pincode[name];
System.out.println("pincode:"+ref);
}
}
}

