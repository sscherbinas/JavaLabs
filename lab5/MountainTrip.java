package ua.lviv.iot.lab3;

public class MountainTrip extends Tour {
    private double averageMountainHeight;
    private final TourType tourType = TourType.SPORT;

    public MountainTrip() {
    }

    @Override
    public String toString() {
        return "MountainTrip{" +
                "averageMountainHeight=" + averageMountainHeight +
                ", tourType=" + tourType +
                ", name='" + getName() + '\'' +
                ", duration=" + getDuration() +
                ", price=" + getPrice() +
                ", country='" + getCountry() + '\'' +
                ", tourType=" + tourType +
                '}';
    }

    public MountainTrip(final String name, final int duration, final double price, final String country, final double averageMountainHeight) {
        super(name, duration, price, country);
        this.averageMountainHeight = averageMountainHeight;
    }

    public double getAverageMountainHeight() {
        return averageMountainHeight;
    }

    public void setAverageMountainHeight(final double averageMountainHeight) {
        this.averageMountainHeight = averageMountainHeight;
    }

    public TourType getTourType() {
        return tourType;
    }
}
