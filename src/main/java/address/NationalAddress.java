package address;

import agenda.Address;

public class NationalAddress implements Address {

    @Override
    public boolean isNationalAddress() {
        return true;
    }

    @Override
    public String address() {
        return null;
    }
}
