import agenda.Address;
import agenda.PhoneNumber;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts;
    public boolean hasContacts() {
        return contacts != null && !contacts.isEmpty();
    }
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Address address, PhoneNumber phoneNumber) {
        contacts.add(new Contact(address, phoneNumber));
    }

    public void removeContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Invalid index. Contact not removed.");
        }
    }

    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Agenda is empty.");
        } else {
            System.out.println("Contacts in the Agenda:");
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                System.out.println((i + 1) + ". " + contact.getAddress().address() + ", Phone: " + contact.getPhoneNumber().phoneNumber());
            }
        }
    }

    private static class Contact {
        private Address address;
        private PhoneNumber phoneNumber;

        public Contact(Address address, PhoneNumber phoneNumber) {
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public Address getAddress() {
            return address;
        }

        public PhoneNumber getPhoneNumber() {
            return phoneNumber;
        }
    }
}
