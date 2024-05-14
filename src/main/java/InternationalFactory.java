import address.InternationalAddress;
import agenda.Address;
import agenda.PhoneNumber;
import phonenumber.InternationalPhoneNumber;

public class InternationalFactory implements AbstractAgendaFactory{
    @Override
    public Address createAddress() {
        return new InternationalAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new InternationalPhoneNumber();
    }
}
