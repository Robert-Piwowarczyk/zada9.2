abstract class Vehicle {
    private String name;
    private int year;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void turnLeft();

    public abstract void turnRight();

    public abstract void goForward();

    public abstract void goBack();
}
