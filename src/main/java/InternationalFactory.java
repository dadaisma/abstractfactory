import address.InternationalAddress;
import agenda.Address;
import agenda.PhoneNumber;
import phonenumber.InternationalPhoneNumber;

import java.util.Scanner;

public class InternationalFactory implements AbstractAgendaFactory{
    private Scanner scanner;
    public InternationalFactory(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    public Address createAddress() {
        return new InternationalAddress(scanner);
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new InternationalPhoneNumber();
    }
}
