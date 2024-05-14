import address.NationalAddress;
import agenda.Address;
import agenda.PhoneNumber;
import phonenumber.NationalPhoneNumber;

public class NationalFactory implements AbstractAgendaFactory{

    @Override
    public Address createAddress() {
        return new NationalAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new NationalPhoneNumber();
    }
}
