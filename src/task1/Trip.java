package task1;

public class Trip {
    private float price;
    private int numberOfDays;
    private Continent destination;
    private boolean allowPets;

    public Trip(float price, int numberOfDays, Continent destination, boolean allowPets) {
        this.price = price;
        this.numberOfDays = numberOfDays;
        this.destination = destination;
        this.allowPets = allowPets;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Continent getDestination() {
        return destination;
    }

    public void setDestination(Continent destination) {
        this.destination = destination;
    }

    public boolean isAllowPets() {
        return allowPets;
    }

    public void setAllowPets(boolean allowPets) {
        this.allowPets = allowPets;
    }
}
