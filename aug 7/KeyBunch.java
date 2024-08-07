class KeyBunch {
    Key key;
    String material;

    KeyBunch(String material, Key key) {
        this.material = material;
        this.key = key;
        System.out.println("created key");
    }

    public void display() {
        this.key.display();
        System.out.println("Material: " + this.material);
    }
}
