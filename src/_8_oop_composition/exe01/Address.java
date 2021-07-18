package _8_oop_composition.exe01;

public class Address {
    private String city;
    private String street;
    private String number;
    private String zipCode;

    public Address(String city, String street, String number, String zipCode) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address {" + "\n" +
                "\tcity='" + city + '\'' + "\n" +
                "\tstreet='" + street + '\'' + "\n" +
                "\tnumber='" + number + '\'' + "\n" +
                "\tzipCode='" + zipCode + '\'' + "\n" +
                '}';
    }
}
