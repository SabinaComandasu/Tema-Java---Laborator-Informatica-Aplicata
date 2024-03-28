import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private Address address;
    private List<Tourist> tourists;

    public Hotel(String name, Address address) {
        this.name = name;
        this.address = address;
        this.tourists = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void changeAddress(Address newAddress) {
        this.address = newAddress;
    }

    public void addTourist(Tourist tourist) {
        tourists.add(tourist);
    }

    public void removeTourist(Tourist tourist) {
        tourists.remove(tourist);
    }

    public List<Tourist> getTourists() {
        return tourists;
    }
}
