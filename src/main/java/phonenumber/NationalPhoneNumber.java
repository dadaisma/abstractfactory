package phonenumber;

import agenda.PhoneNumber;

public class NationalPhoneNumber implements PhoneNumber {
    @Override
    public boolean isNationalPhoneNumber() {
        System.out.println("natio phone nr");
        return true;
    }

    @Override
    public String phoneNumber() {
        return null;
    }
}
