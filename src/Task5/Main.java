package Task5;

public class Main {
    public static void main(String[] args) {
        Address ad= new Address();
        ad.setApartment("Apartment");
        ad.setCountry("Country");
        ad.setHouse("House");
        ad.setIndex("index");
        ad.setSity("city");

        System.out.println(ad.getIndex());
        System.out.println(ad.getApartment());
        System.out.println(ad.getCountry());
        System.out.println(ad.getHouse());
        System.out.println(ad.getStreet());
        System.out.println(ad.getSity());

    }
}
