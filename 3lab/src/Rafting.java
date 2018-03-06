public class Rafting extends Tour {
    private double averageRiverDepth;

    private final TourType tourType = TourType.EXTREME;

    public Rafting() {

    }

    public Rafting(String name, int duration, double price, String country, double averageRiverDepth) {

        super(name, duration, price, country);
        this.averageRiverDepth = averageRiverDepth;
    }

    @Override
    public String toString() {
        return "Rafting{" +
                "averageRiverDepth=" + averageRiverDepth +
                ", tourType=" + tourType +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", country='" + country + '\'' +
                ", tourType=" + tourType +
                '}';
    }

    public double getAverageRiverDepth() {

        return averageRiverDepth;
    }

    public void setAverageRiverDepth(double averageRiverDepth) {

        this.averageRiverDepth = averageRiverDepth;
    }

    public TourType getTourType() {
        return tourType;
    }
}
