class Method{

	public static void main1(){
		System.out.println("This is static methos with access specifier");
	}
	
	static void main2(){
		System.out.println("Static method without Access Specifier");
	}
	
	void main3(){
		System.out.println("Method without access specifier and static method");
	}
	
	//bstract void main4();
	
	public void main5(){
		System.out.println("Methos with access specifier and without the non access(static) specifier");
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is Static methos with access specifier in addition to arguments");
		main1();
		main2();
		Method m = new Method();
		m.main3();
		//m.main4();
		m.main5();
	}
}
