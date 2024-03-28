public class Tourist extends Person {
    public Tourist(String name, Address address) {
        super(name, address);
    }

    public void moveToHotel(Hotel newHotel) {
        Hotel oldHotel = getHotel();
        if (oldHotel != null) {
            oldHotel.removeTourist(this);
        }
        newHotel.addTourist(this);
    }

    public Hotel getHotel() {
        for (Hotel hotel : TouristManagementSystem.hotels.values()) {
            if (hotel.getTourists().contains(this)) {
                return hotel;
            }
        }
        return null;
    }
    public boolean isAccommodatedInCityHotels(String city) {
        for (Hotel hotel : TouristManagementSystem.hotels.values()) {
            if (hotel.getAddress().getCity().equals(city) && hotel.getTourists().contains(this)) {
                return true;
            }
        }
        return false;
    }
}
