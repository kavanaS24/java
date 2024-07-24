class MatrimonyRunner
{
public static void main(String[] args)
{
System.out.println("Start main in MatrimonyRunner");
Matrimony matrimony=new Matrimony();
String name=matrimony.name;
    int age=matrimony.age;
    String gender=matrimony.gender;
System.out.println("matrimony name:"+name);
System.out.println("matrimony age:"+age);
System.out.println("matrimony gender:"+gender);
System.out.println("Stop main in MatrimonyRunner");
matrimony.name="Rema";
matrimony.age=25;
matrimony.gender="female";
System.out.println("matrimony updated name:"+matrimony.name);
System.out.println("matrimony updated age:"+matrimony.age);
System.out.println("matrimony updated gender:"+matrimony.gender);

}
}
