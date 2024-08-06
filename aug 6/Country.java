class Country{
	
	String name;
	String continent;
	State state=new State("Kannada");
	
	
	public Country(String name,String continent){
		
		
		this.name=name;
		this.continent=continent;
	}
	
	public void display()
	{
		
		System.out.println(" name:"+name);
		System.out.println("continent:"+continent);
		state.display();
	}
	
	
	
}