package ua.lviv.iot.lab3;

public class ResortTour extends Tour {
    private String resortName;
    private String hotelName;
    private final TourType tourType = TourType.FAMILY;

    @Override
    public final String toString() {
        return "ResortTour{"
                +
                "resortName='" + resortName
                + '\''
                +
                ", hotelName='" + hotelName
                + '\''
                +
                ", tourType=" + tourType
                +
                ", name='" + getName()
                + '\''
                +
                ", duration=" + getDuration()
                +
                ", price=" + getPrice()
                +
                ", country='" + getCountry()
                + '\''
                +
                ", tourType=" + tourType
                +
                '}';
    }

    public ResortTour(final TourType tourType, final String name, final int duration, final double price,
                      final String country, final String resortName, final String hotelName, final int id) {
        super(name, duration, price, country, id);
        this.resortName = resortName;
        this.hotelName = hotelName;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "resortName, " + "hotelName, " + "tourType, ";
    }

    @Override
    public String toCSV(){
        return  super.toCSV() + resortName + "," + hotelName + "," + tourType + ",";
    }

    /*
    public final String getResortName() {
        return resortName;
    }

    public final void setResortName(final String resortName) {
        this.resortName = resortName;
    }

    public final String getHotelName() {
        return hotelName;
    }

    public final void setHotelName(final String hotelName) {
        this.hotelName = hotelName;
    }*/

    public final TourType getTourType() {
        return tourType;
    }

}
