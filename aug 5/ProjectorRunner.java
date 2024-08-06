class ProjectorRunner {
    public static void main(String[] values) {
        Projector projector = new Projector("Sony");
        projector.type = "LCD";
        projector.color = "White";
        projector.weight = 8;
        projector.display();

        Projector projector1 = new Projector("Epson");
        projector1.type = "DLP";
        projector1.color = "Black";
        projector1.weight = 12;
        projector1.display();

        Projector projector2 = new Projector("ViewSonic");
        projector2.type = "Laser";
        projector2.color = "grey";
        projector2.weight = 10;
        projector2.display();
    }
}
