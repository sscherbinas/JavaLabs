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
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", country='" + country + '\'' +
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

    public void setResortName(String resortName) {

        this.resortName = resortName;
    }


    public String getHotelName() {

        return hotelName;
    }

    public void setHotelName(String hotelName) {

        this.hotelName = hotelName;
    }

    public TourType getTourType() {
        return tourType;
    }
}
