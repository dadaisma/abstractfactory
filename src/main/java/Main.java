import address.InternationalAddress;
import address.NationalAddress;
import agenda.Address;
import agenda.PhoneNumber;
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
            scanner.nextLine();

            if (choice == 1) {
                factory = new NationalFactory(scanner);
            } else if (choice == 2) {
                factory = new InternationalFactory(scanner);
            } else if (choice == 3) {
                agenda.listContacts();
                continue; // Continue to the next iteration of the loop
            } else if (choice == 4) {
                if (agenda.hasContacts()) {
                    agenda.listContacts();
                    System.out.println("Enter the index of the contact to remove:");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine();
                    agenda.removeContact(indexToRemove - 1);
                    continue;
                } else {
                    System.out.println("There are no contacts to remove.");
                }

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
                PhoneNumber phoneNumber = factory.createPhoneNumber();
                agenda.addContact(address, phoneNumber);

                System.out.println("Created address: " + address.address() + ", Phone: "+phoneNumber.phoneNumber());
                if (address instanceof NationalAddress) {
                    //check the true/false of the interface
                  ((NationalAddress) address).isNationalAddress();
                }
                if (address instanceof InternationalAddress) {
                    ((InternationalAddress) address).isNationalAddress();
                }
            }
        } while (true);

        scanner.close();


    }


}
