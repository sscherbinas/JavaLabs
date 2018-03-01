package ua.lviv.iot.lab3;

public class Rafting extends Tour {
    private double averageRiverDepth;
    private final TourType tourType = TourType.EXTREME;

    public Rafting() {
        }

    public Rafting(final String name, final int duration, final double price,final String country, final double averageRiverDepth) {
        super(name, duration, price, country);
        this.averageRiverDepth = averageRiverDepth;
    }

    @Override
    public String toString() {
        return "Rafting{" +
                "averageRiverDepth=" + averageRiverDepth +
                ", tourType=" + tourType +
                ", name='" + getName() + '\'' +
                ", duration=" + getDuration() +
                ", price=" + getPrice() +
                ", country='" + getCountry() + '\'' +
                ", tourType=" + tourType +
                '}';
    }

    public double getAverageRiverDepth() {
        return averageRiverDepth;
    }

    public void setAverageRiverDepth(final double averageRiverDepth) {
        this.averageRiverDepth = averageRiverDepth;
    }

    public TourType getTourType() {
        return tourType;
    }
}
