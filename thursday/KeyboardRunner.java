class KeyboardRunner {
    public static void main(String[] args) {
    
        Keyboard keyboard= new Keyboard ();
        keyboard.brand="Logitech";
    keyboard.wireless=true;
    
        System.out.println("keyboard noOfKeys:" + keyboard.noOfKeys);
        System.out.println("keyboard brand:" +keyboard.brand);
        System.out.println("keyboard wireless:" +keyboard.wireless);
   
    }
}