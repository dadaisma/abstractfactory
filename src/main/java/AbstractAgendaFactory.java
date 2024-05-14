import agenda.Address;
import agenda.PhoneNumber;

public interface AbstractAgendaFactory {
    Address createAddress();
    PhoneNumber createPhoneNumber();
}
