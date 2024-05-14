package address;

import agenda.Address;

public class NationalAddress implements Address {

    @Override

    public boolean isNationalAddress() {
        System.out.println("nat Address");
        return true;
    }

    @Override
    public String address() {

        return "blabbingAddress";
    }
}
