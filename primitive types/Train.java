class Train{
	public static void book(String source , String destination)
	{
		System.out.println("running source and destination");
		System.out.println("source :"+source);
		System.out.println("destination :"+destination);
	}
	public static void book(String source , String destination ,int quantity)
	{
		System.out.println("running source ,destination and quantity");
		System.out.println("source :"+source);
		System.out.println("destination :"+destination);
		System.out.println("quantity :"+quantity);
	}
	public static void book(String source , String destination ,int quantity , double price)
	{
		System.out.println("running source ,destination ,quantity and price");
		System.out.println("source :"+source);
		System.out.println("destination :"+destination);
		System.out.println("quantity :"+quantity);
		System.out.println("price :"+price);
    }
public static void cancel(long ticketNo)
	{
		System.out.println("running ticketNoin cancel method");
		System.out.println("ticketNo :"+ticketNo);
	}
	public static void cancel(String source , String destination)
	{
		System.out.println("running source and destination");
		System.out.println("source :"+source);
		System.out.println("destination :"+destination);
	}

}

	public static void main(String[] args)
	{
		book("SBC" ,"Miraj");
		book("Belagavi" , "UgarKhurd" , 4440);
		book("Vijayapur" , "Yeshwantpura" , 4540 , 1290.9980);
		cancel(1234567890);
		cancel("Ahmadnagar" , "Hyderabad");
	}
