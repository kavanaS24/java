class FoodDeliveryCompanyRunner
{
public static void main(String[] args)
{
System.out.println("Start main in FoodDeliveryCompanyRunner");
FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
String CompanyName=foodDeliveryCompany.CompanyName;
int deliveryTime=foodDeliveryCompany.deliveryTime;
String deliveryArea=foodDeliveryCompany.deliveryArea;
System.out.println("foodDeliveryCompany CompanyName:"+CompanyName);
System.out.println("foodDeliveryCompany deliveryArea:"+deliveryArea);
System.out.println("foodDeliveryCompany deliveryTime:"+deliveryTime);
System.out.println("Stop main in FoodDeliveryCompanyRunner");
}
}
