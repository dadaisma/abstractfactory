import address.InternationalAddress;
import address.NationalAddress;
import agenda.Address;
import phonenumber.InternationalPhoneNumber;
import phonenumber.NationalPhoneNumber;

public class Main {
    public static void main (String [] arg) {

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


    }


}
