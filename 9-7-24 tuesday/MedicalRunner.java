





class MedicalRunner {
    public static void main(String[] args) {
       
        double price = Medical.getMedicinePrice("Saridon");
        System.out.println("medical:" + price);
		double price1 = Medical.getMedicinePrice("Paracetomal");
        System.out.println("medical:" + price1);
		double price2 = Medical.getMedicinePrice("Azithromycin");
        System.out.println("medical:" + price2);
	    double price3 = Medical.getMedicinePrice("dolo");
        System.out.println("medical:" + price3);
        String medicine = Medical.getMedicineName("Fever");
        System.out.println("medical:" + medicine);
		String medicine1 = Medical.getMedicineName("headache");
        System.out.println("medical:" + medicine1);
		String medicine2 = Medical.getMedicineName("Infection");
        System.out.println("medical:" + medicine2);
		String medicine3 = Medical.getMedicineName("pain");
        System.out.println("medical:" + medicine3);
        String availability =Medical.getAvailability("Doctor Parmesh");
        System.out.println("medical: " + availability);
		String availability1 =Medical.getAvailability("Doctor Rachita");
        System.out.println("medical: " + availability1);
		String availability2 =Medical.getAvailability("Doctor Divya");
        System.out.println("medical: " + availability2);
		String availability3 =Medical.getAvailability("Doctor Ram");
        System.out.println("medical: " + availability3);
    }
}


