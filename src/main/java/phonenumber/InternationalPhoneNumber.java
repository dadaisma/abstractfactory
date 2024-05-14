package phonenumber;

import agenda.PhoneNumber;

public class InternationalPhoneNumber implements PhoneNumber {
    @Override
    public boolean isNationalPhoneNumber() {
        return false;
    }

    @Override
    public String phoneNumber() {
        return null;
    }
}
