public class TestRentableCar {
    public static void main(String[] args) {
        Vehicle[] vehicle = new Car[2];
        vehicle[0] = new Car("Hyundai i10",2020,4);
        vehicle[1] = new Car("Kia Ceed",2019,5);

        RentableCar rentableCar = new RentableCar("Hundai i 10",
                2020,4);
        Person person = new Person("Jan","Kowalski",
                "100");

        System.out.println( "Osoba pożyczająca:"+ person.getFirstName()
                +person.getLastName()+ person.getId() +"pojazd marki:"+ rentableCar.isRent(vehicle[0]));

        System.out.println("Osoba zwracająca:"+ person.getFirstName()
        + person.getLastName()+ person.getId() + "pojazd marki:"
        + rentableCar.handOver(vehicle[1]));
    }
}
