package phonenumber;

import agenda.PhoneNumber;

public class InternationalPhoneNumber implements PhoneNumber {
    @Override
    public boolean isNationalPhoneNumber() {
        System.out.println("int phone number");
        return false;
    }

    @Override
    public String phoneNumber() {
        return null;
    }
}
