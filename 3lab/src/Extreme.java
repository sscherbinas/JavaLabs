public final class Extreme extends Tour {

    private final TourType tourType = TourType.EXTREME;

    public Extreme (String name, int duration, double price, String country) {

        this.name = name;
        this.duration = duration;
        this.price = price;
        this.country = country;

    }

    public TourType getTourType() {
        return tourType;
    }
}
