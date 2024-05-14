package address;

import agenda.Address;

import java.util.Scanner;

public class NationalAddress implements Address {
    private String street;
    private String city;
    private String postalCode;

    private String country;

    public  NationalAddress(String street, String city, String postalCode, String country){
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = "Spain";
    }

    //constructor
    public NationalAddress(Scanner scanner) {
        while (true) {
            System.out.println("Enter Street:");
            this.street = scanner.nextLine().trim();
            if (!this.street.isEmpty()) {
                break;
            }
            System.out.println("Street cannot be empty. Please try again.");
        }

        while (true) {
            System.out.println("Enter city:");
            this.city = scanner.nextLine().trim();
            if (!this.city.isEmpty()) {
                break;
            }
            System.out.println("City cannot be empty. Please try again.");
        }

        while (true) {
            System.out.println("Enter postalCode:");
            this.postalCode = scanner.nextLine().trim();
            if (!this.postalCode.isEmpty()) {
                break;
            }
            System.out.println("Postal code cannot be empty. Please try again.");
        }
    }

    @Override

    public boolean isNationalAddress() {
        System.out.println("This is a National Address");
        return true;
    }

    @Override
    public String address() {

        return  street +", "+city+", "+postalCode+", Spain";
    }
}
