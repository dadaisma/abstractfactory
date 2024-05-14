package phonenumber;

import agenda.PhoneNumber;

public class NationalPhoneNumber implements PhoneNumber {
    @Override
    public boolean isNationalPhoneNumber() {
        return true;
    }

    @Override
    public String phoneNumber() {
        return null;
    }
}
