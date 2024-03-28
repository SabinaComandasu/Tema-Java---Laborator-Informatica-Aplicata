import java.util.ArrayList;
import java.util.List;

public class City {
    private String cityName;
    private List<Hotel> hotels;

    public City(String cityName) {
        this.cityName = cityName;
        this.hotels = new ArrayList<>();
    }

    public String getCityName() {
        return cityName;
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public List<Hotel> getAllHotels() {
        return hotels;
    }

    public List<Tourist> getAllTouristsInCity() {
        List<Tourist> tourists = new ArrayList<>();
        for (Hotel hotel : hotels) {
            tourists.addAll(hotel.getTourists());
        }
        return tourists;
    }
}
