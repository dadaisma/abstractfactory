package phonenumber;

import agenda.PhoneNumber;

import java.util.Scanner;

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
