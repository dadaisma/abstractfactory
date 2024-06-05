import address.InternationalAddress;
import address.NationalAddress;
import agenda.Address;
import agenda.PhoneNumber;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AbstractAgendaFactory factory = null;
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("""
                Choose an option:
                1. National Contact
                2. International Contact
                3. List Contacts
                4. Remove Contact
                5. Exit
                """);

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                printError("Please enter a valid number (1-5).");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                printError("Please enter a valid number (1-5).");
                continue;
            }

            switch (choice) {
                case 1:
                    factory = new NationalFactory(scanner);
                    break;
                case 2:
                    factory = new InternationalFactory(scanner);
                    break;
                case 3:
                    agenda.listContacts();
                    continue;
                case 4:
                    if (agenda.hasContacts()) {
                        agenda.listContacts();
                        System.out.println("Enter the index of the contact to remove:");
                        String indexInput = scanner.nextLine();
                        if (indexInput.isEmpty()) {
                            printError("ID cannot be empty.");
                            continue;
                        }
                        int indexToRemove;
                        try {
                            indexToRemove = Integer.parseInt(indexInput);
                        } catch (NumberFormatException e) {
                            printError("Invalid index format.");
                            continue;
                        }
                        agenda.removeContact(indexToRemove - 1);
                    } else {
                        System.out.println("There are no contacts to remove.");
                    }
                    continue;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    printError("Invalid choice");
                    continue;
            }

            // Create an address using the selected factory
            Address address = factory.createAddress();
            PhoneNumber phoneNumber = factory.createPhoneNumber();
            agenda.addContact(address, phoneNumber);

            System.out.println("Created address: " + address.address() + ", Phone: " + phoneNumber.phoneNumber());
            if (address instanceof NationalAddress) {
                address.isNationalAddress();
            }
            if (address instanceof InternationalAddress) {
                address.isNationalAddress();
            }
        }
    }

    private static void printError(String message) {
        System.out.println("Error, " + message);
    }
}
