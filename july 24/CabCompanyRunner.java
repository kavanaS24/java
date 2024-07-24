class CabCompanyRunner
{
public static void main(String[] args)
{
System.out.println("Start main in CabCompanyRunner");
CabCompany cabCompany=new CabCompany();
String CompanyName=cabCompany.CompanyName;
boolean isOperational=cabCompany.isOperational;
String founderName=cabCompany.founderName;
System.out.println("cabCompany CompanyName:"+CompanyName);
System.out.println("cabCompany isOperational:"+isOperational);
System.out.println("cabCompany founderName:"+founderName);
System.out.println("Stop main in CabCompanyRunner");
}
}
