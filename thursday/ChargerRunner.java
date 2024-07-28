class ChargerRunner {
    public static void main(String[] args) {
    
        Charger charger= new Charger();
        charger.quantity=1;
    charger.price=150;
    
        System.out.println("charger quantity:" + charger.quantity);
        System.out.println("charger type:" + charger.type);
        System.out.println("charger price:" + charger.price);
   
    }
}