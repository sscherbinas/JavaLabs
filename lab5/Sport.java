package ua.lviv.iot.lab3;

public final class Sport extends Tour {
    private final TourType tourType = TourType.SPORT;

    public Sport(final String name, final int duration, final double price, final String country) {

        setName(name);
        setDuration(duration);
        setPrice(price);
        setCountry(country);
        }

    public TourType getTourType() {
        return tourType;
    }
}
