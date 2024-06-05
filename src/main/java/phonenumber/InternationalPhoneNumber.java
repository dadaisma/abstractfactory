package phonenumber;

import agenda.PhoneNumber;

import java.util.Scanner;

public class InternationalPhoneNumber implements PhoneNumber {
    private String prefix;
    private String phoneNumber;


    public InternationalPhoneNumber(Scanner scanner) {
        while (true) {
            System.out.println("Enter ONLY the Prefix ... example +39 or 0039");
            this.prefix = scanner.nextLine().trim();
            if (!this.prefix.isEmpty() && this.prefix.length() <=4 ) {
                break;
            }
            System.out.println("Prefix cannot be empty or more than 4 digits, please insert it");
        }

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
        System.out.println("International phone number");
        return false;
    }

    @Override
    public String phoneNumber() {

    return prefix+phoneNumber;
    }
}
