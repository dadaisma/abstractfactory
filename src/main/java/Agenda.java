import agenda.Address;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Address> addresses;

    public Agenda() {
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }
    public void removeAddress(int index) {
        if (index >= 0 && index < addresses.size()) {
            addresses.remove(index);
            System.out.println("Address removed successfully.");
        } else {
            System.out.println("Invalid index. Address not removed.");
        }
    }

    public void listAddresses() {
        if (addresses.isEmpty()) {
            System.out.println("Address Agenda is empty.");
        } else {
            System.out.println("Addresses in the Agenda:");
            for (int i = 0; i < addresses.size(); i++) {
                System.out.println((i + 1) + ". " + addresses.get(i).address());
            }
        }
    }
}
