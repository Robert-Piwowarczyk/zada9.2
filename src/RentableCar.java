public class RentableCar extends Car {
    public RentableCar(String name, int year, int numberOfSeats) {
        super(name, year, numberOfSeats);
    }

    public String rent(String firstName, String lastName, String id){
        System.out.println("Osoba wypożyczająca pojazd: ");
    }

    public boolean handOver(){
        return true;
    }

    public boolean isRent(){
        return false;
    }
}
