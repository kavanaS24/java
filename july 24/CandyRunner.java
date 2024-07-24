class CandyRunner {
    public static void main(String[] args) {
        System.out.println("Start main in CandyRunner");
        Candy candy = new Candy();
        String flavor=candy.flavor;
    int quantity=candy.quantity;
    boolean isAvailable=candy.isAvailable;
        System.out.println("candy flavor:" + flavor);
        System.out.println("candy quantity:" + quantity);
        System.out.println("candy isAvailable:" + isAvailable);

        candy.flavor = "strawberry";
        candy.quantity = 5;
       candy.isAvailable = true;
        System.out.println("candy updated flavor:" + candy.flavor);
        System.out.println("candy updated quantity:" +candy.quantity);
        System.out.println("candy updated isAvailable:" + candy.isAvailable);
        System.out.println("Stop main in CandyRunner");
    }
}