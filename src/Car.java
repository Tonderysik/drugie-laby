
public class Car extends Bayer implements CarInterface {
    private String name;
    private String color;
    public int year;

    Car() {
        super("Antek", 1710);
        this.name = "Mercedes";
        this.color = "Red";
        this.year = 2018;
        this.setSurName("Kowalska");
    }

    Car(String color) {
        super("Antek", 1710);
        this.name = "Mercedes";
        this.color = color;
        this.year = 2018;
    }

    Car(String color, int year) {
        super("Antek", year);
        this.name = "Mercedes";
        this.color = color;
        this.year = year;
    }

    @Override
    public String InfoCar() {
        return "Name: " + this.name + ", " +
                "Color: " + this.color + ", " +
                "Year: " + this.year + ", " +
                "SurName: " + this.getSurName() + ", " +
                "bName: " + this.bName  + ", " +
                "bYear: " + this.bYear;
    }

    @Override
    public String InfoPerson() {
        return "";
    }
}
