class FoodRunner {
    public static void main(String[] args) {
        System.out.println("Start main in FoodRunner");
        Food food = new Food();
        String name=food.name;
    int quantity=food.quantity;
    boolean isAvailable=food.isAvailable;
        System.out.println("food name:" + name);
        System.out.println("food quantity:" + quantity);
        System.out.println("food isAvailable:" + isAvailable);

        food.name = "Biryani";
        food.quantity = 2;
        food.isAvailable = true;
        System.out.println("food updated name:" + food.name);
        System.out.println("food updated quantity:" + food.quantity);
        System.out.println("food updated isAvailable:" + food.isAvailable);
        System.out.println("Stop main in FoodRunner");
    }
}