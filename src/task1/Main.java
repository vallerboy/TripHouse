package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TripHouse tripHouse = new TripHouse();
        tripHouse.addTrip(new Trip(1200, 7, Continent.EU,true));

        System.out.println(tripHouse.bookOffer(1500, 5, Arrays.asList(Continent.EU), true));
    }
}
