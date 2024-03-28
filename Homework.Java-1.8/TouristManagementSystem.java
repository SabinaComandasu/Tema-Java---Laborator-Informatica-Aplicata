import java.util.Map;
import java.util.HashMap;
public class TouristManagementSystem {
    public static Map<String, Hotel> hotels = new HashMap<>();
    public static Map<String, Person> persons = new HashMap<>();

    public static void main(String[] args) {
        Address hotelAddress1 = new Address("Calea Bucuresti 1", "Craiova");
        Hotel hotel1 = new Hotel("Hotel Ramada", hotelAddress1);

        Address hotelAddress2 = new Address("Bulevardul Carol I 49", "Sibiu");
        Hotel hotel2 = new Hotel("Hotel Rexton", hotelAddress2);

        Address personAddress1 = new Address("Strada Vasile Alecsandri", "Bucuresti");
        Person person1 = new Person("John", personAddress1);

        Address touristAddress1 = new Address("Fratii Golesti 53", "Craiova");
        Address touristAddress2 = new Address("Calea Bucuresti", "Craiova");

        Tourist tourist1 = new Tourist("Sabina Comandasu", touristAddress1);
        Tourist tourist2 = new Tourist("Vladut Florian", touristAddress2);

        hotel1.addTourist(tourist1);
        hotel2.addTourist(tourist2);

        hotels.put("Hotel Ramada", hotel1);
        hotels.put("Hotel Rexton", hotel2);
        persons.put("Vladut Florian", person1);

        System.out.println("\nHoteluri:\n");
        for (Hotel hotel : hotels.values()) {
            System.out.println("Numele hotelului: " + hotel.getName());
            System.out.println("Adresa: " + hotel.getAddress().getStreet() + ", " + hotel.getAddress().getCity());
            System.out.println("Turisti din acest hotel:");
            for (Tourist tourist : hotel.getTourists()) {
                System.out.println("\t\t- " + capitalizeFirstLetter(tourist.getName()));
            }
            System.out.println();
        }

        // Using the Tourist class
        System.out.println("Se verifica daca turistii adaugati sunt cazati intr-unul dintre hotelurile din Craiova:");

        // Checking for tourist1
        if (tourist1.isAccommodatedInCityHotels("Craiova")) {
            System.out.println("\t" + capitalizeFirstLetter(tourist1.getName()) + " este cazat.");
        } else {
            System.out.println("\t" + capitalizeFirstLetter(tourist1.getName()) + " nu este cazat");
        }

        // Checking for tourist2
        if (tourist2.isAccommodatedInCityHotels("Craiova")) {
            System.out.println("\t" + capitalizeFirstLetter(tourist2.getName()) + " este cazat.");
        } else {
            System.out.println("\t" + capitalizeFirstLetter(tourist2.getName()) + " nu este cazat.");
        }
    }

    private static String capitalizeFirstLetter(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
