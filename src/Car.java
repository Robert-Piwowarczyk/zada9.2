public class Car extends Vehicle{
    private int numberOfSeats;

    public Car(String name, int year, int numberOfSeats) {
        super(name, year);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
