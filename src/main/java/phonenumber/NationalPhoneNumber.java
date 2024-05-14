package phonenumber;

import agenda.PhoneNumber;
import java.util.Scanner;

public class NationalPhoneNumber implements PhoneNumber {
    private String phoneNumber;

    public NationalPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public NationalPhoneNumber(Scanner scanner){
        while (true){
            System.out.println("Enter the Phone Number");
            this.phoneNumber = scanner.nextLine().trim();
            if(!this.phoneNumber.isEmpty()){
                break;
            }
            System.out.println("Phone number cannot be empty, please insert it");
        }
    }
    @Override
    public boolean isNationalPhoneNumber() {
        System.out.println("this is a national phone nr");
        return true;
    }

    @Override
    public String phoneNumber() {
        return phoneNumber;
    }
}
