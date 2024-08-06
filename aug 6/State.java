class State{
	
	String name="Karnataka";
	String language;
	CapitalCity capitalCity=new CapitalCity("Bangalore",1824967);
	
	public State(String language){
		
		
		this.language=language;
	}
	
	public void display(){
		
		System.out.println(" name:"+name);
		System.out.println(" language:"+this.language);
		capitalCity.display();
	}
	
	
	
}