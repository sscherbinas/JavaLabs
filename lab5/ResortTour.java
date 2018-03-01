package ua.lviv.iot.lab3;

public class ResortTour extends Tour {
    private String resortName;
    private String hotelName;
    private final TourType tourType = TourType.FAMILY;

    public ResortTour() {
        }

    @Override
    public String toString() {
        return "ResortTour{" +
                "resortName='" + resortName + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", tourType=" + tourType +
                ", name='" + getName() + '\'' +
                ", duration=" + getDuration() +
                ", price=" + getPrice() +
                ", country='" + getCountry() + '\'' +
                ", tourType=" + tourType +
                '}';
    }

    public ResortTour(String name, int duration, double price, String country, String resortName, String hotelName) {
        super(name, duration, price, country);
        this.resortName = resortName;
        this.hotelName = hotelName;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(final String resortName) {
        this.resortName = resortName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(final String hotelName) {
        this.hotelName = hotelName;
    }

    public TourType getTourType() {
        return tourType;
    }
}
