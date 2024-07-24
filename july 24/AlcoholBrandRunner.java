class AlcoholBrandRunner {
    public static void main(String[] args) {
        System.out.println("Start main in AlcoholBrandRunner");
        AlcoholBrand alcoholBrand = new AlcoholBrand();
        String brandName=alcoholBrand.brandName;
		int price=alcoholBrand.price;
		boolean isAvailable=alcoholBrand.isAvailable;
        System.out.println("alcoholBrand brandName:" + brandName);
        System.out.println("alcoholBrand price:" + price);
        System.out.println("alcoholBrand isAvailable:" + isAvailable);

        alcoholBrand.brandName = "Pkingfisher";
        alcoholBrand.price = 100;
        alcoholBrand.isAvailable = true;
        System.out.println("alcoholBrand updated brandName:" + alcoholBrand.brandName);
        System.out.println("alcoholBrand updated price:" + alcoholBrand.price);
        System.out.println("alcoholBrand updated isAvailable:" + alcoholBrand.isAvailable);
        System.out.println("Stop main in AlcoholBrandRunner");
    }
}