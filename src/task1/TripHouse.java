package task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TripHouse {
    private List<Trip> ourTrips;

    public TripHouse(){
         ourTrips = new ArrayList<>();
    }

    public void addTrip(Trip trip){
        ourTrips.add(trip);
    }

    public boolean bookOffer(float maxPrice, int minDays, List<Continent> continents, boolean needPet){
        Iterator<Trip> iterator = ourTrips.iterator();
        while (iterator.hasNext()) {
            Trip actual  = iterator.next();

            if(actual.getNumberOfDays() > minDays &&
               actual.getPrice() < maxPrice &&
               continents.contains(actual.getDestination())){
                if(actual.isAllowPets() || (actual.isAllowPets() == needPet)){
                    iterator.remove();
                    return true;
                }

            }
        }
        return false;
    }
}
