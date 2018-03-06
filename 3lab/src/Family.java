public final class Family extends Tour {

    private final TourType tourType = TourType.FAMILY;

    public Family(String name, int duration, double price, String country) {

        this.name = name;
        this.duration = duration;
        this.price = price;
        this.country = country;

    }

    public TourType getTourType() {
        return tourType;
    }


}
