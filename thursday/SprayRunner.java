class SprayRunner {
    public static void main(String[] args) {
    
        Spray spray= new Spray ();
        spray.brand="Lysol";
		spray.volume=200;
    
        System.out.println("spray brand:" + spray.brand);
        System.out.println("spray volume:" +spray.volume);
        System.out.println("spray scent:" +spray.scent);
   
    }
}