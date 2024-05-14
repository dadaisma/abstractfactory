import address.InternationalAddress;
import address.NationalAddress;
import agenda.Address;
import phonenumber.InternationalPhoneNumber;
import phonenumber.NationalPhoneNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AbstractAgendaFactory factory = null;
        Agenda agenda = new Agenda();

        do {
            System.out.println("Choose an option:");
            System.out.println("1. National Contact");
            System.out.println("2. International Contact");
            System.out.println("3. List Contacts");
            System.out.println("4. Remove Contact");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice == 1) {
                factory = new NationalFactory(scanner);
            } else if (choice == 2) {
                factory = new InternationalFactory(scanner);
            } else if (choice == 3) {
                agenda.listAddresses();
                continue; // Continue to the next iteration of the loop
            } else if (choice == 4) {
                agenda.listAddresses();
                System.out.println("Enter the index of the address to remove:");
                int indexToRemove = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                agenda.removeAddress(indexToRemove - 1); // Adjust index to match list index
                continue; // Continue to the next iteration of the loop
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
                continue; // Continue to the next iteration of the loop
            }
            if (factory != null) {
                // Create an address using the selected factory
                Address address = factory.createAddress();
                agenda.addAddress(address);
                System.out.println("Created address: " + address.address());
                if (address instanceof NationalAddress) {
                    ((NationalAddress) address).isNationalAddress();
                }
                if (address instanceof InternationalAddress) {
                    ((InternationalAddress) address).isNationalAddress();
                }
            }
        } while (true);
        // Close the scanner
        scanner.close();
        /*
        // Print the formatted address
        System.out.println("Formatted Address: " + nationalAddress.address());
        //National
        AbstractAgendaFactory nationalFactory = new NationalFactory();

        NationalAddress nationalAddress = (NationalAddress) nationalFactory.createAddress();
        NationalPhoneNumber nationalPhoneNumber = (NationalPhoneNumber) nationalFactory.createPhoneNumber();

        System.out.println("\n ***  NATIONAL A GE N DA  ***");

        nationalAddress.isNationalAddress();
        nationalPhoneNumber.isNationalPhoneNumber();
        System.out.println("\n *** INTERNATIONAL A GE N DA  ***");
        AbstractAgendaFactory internationalFactory = new InternationalFactory();

        InternationalAddress internationalAddress = (InternationalAddress) internationalFactory.createAddress();
        InternationalPhoneNumber internationalPhoneNumber = (InternationalPhoneNumber) internationalFactory.createPhoneNumber();

        internationalAddress.isNationalAddress();
        internationalPhoneNumber.isNationalPhoneNumber();
*/

    }


}
