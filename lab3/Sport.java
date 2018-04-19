package ua.lviv.iot.lab3;

public final class Sport extends Tour {
    private final TourType tourType = TourType.SPORT;

    public Sport(final String name, final int duration, final double price, final String country, final int id) {

        super(name, duration, price, country, id);
        }

    public TourType getTourType() {
        return tourType;
    }
}
