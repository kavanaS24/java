class Company{
public static double xworkz(int age){
	double salary=15000;
	double salaryIncrement=salary+2000;
	double salaryIncrementAgain=salaryIncrement+2000;
if (age>=18 && age<25)
{
return salary;
}
else if (age>=25 && age<30)
{
	return salaryIncrement;
}
else if(age>=30)
{
	return salaryIncrementAgain;
}
}
}

