class MedicineRunner {
    public static void main(String[] args) {
        System.out.println("Start main in MedicineRunner");
        Medicine medicine = new Medicine();
        String name=medicine.name;
    int quantity=medicine.quantity;
    boolean isPrescribed=medicine.isPrescribed;
        System.out.println("medicine name:" + name);
        System.out.println("medicine quantity:" + quantity);
        System.out.println("medicine isPrescribed:" + isPrescribed);

        medicine.name = "omaze";
        medicine.quantity = 10;
        medicine.isPrescribed = true;
        System.out.println("medicine updated name:" + medicine.name);
        System.out.println("medicine updated quantity:" + medicine.quantity);
        System.out.println("medicine updated isPrescribed:" + medicine.isPrescribed);
        System.out.println("Stop main in MedicineRunner");
    }
}