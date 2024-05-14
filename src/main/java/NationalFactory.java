import address.NationalAddress;
import agenda.Address;
import agenda.PhoneNumber;
import phonenumber.NationalPhoneNumber;

import java.util.Scanner;

public class NationalFactory implements AbstractAgendaFactory{

    private Scanner scanner;
    public NationalFactory(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    public Address createAddress() {

        return new NationalAddress(scanner);
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new NationalPhoneNumber();
    }
}
