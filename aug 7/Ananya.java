class Ananya {
    Knife knife;
    String mobile;

    Ananya(String mobile, Knife knife) {
        this.mobile = mobile;
        this.knife = knife;
        System.out.println("created knife");
    }

    public void display() {
        this.knife.display();
        System.out.println("Mobile: " + this.mobile);
    }
}
