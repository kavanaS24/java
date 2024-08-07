class Ganavi {
    Clip clip;
    String email;

    Ganavi(String email,Clip clip) {
        this.email = email;
        this.clip = clip;
        System.out.println("created email");
    }

    public void display() {
        this.clip.display();
        System.out.println("email: " + this.email);
    }
}
