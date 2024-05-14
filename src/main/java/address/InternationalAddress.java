package address;

import agenda.Address;

public class InternationalAddress implements Address {
    @Override
    public boolean isNationalAddress() {
        System.out.println("internataddrss");
        return false;
    }

    @Override
    public String address() {
        return null;
    }
}
