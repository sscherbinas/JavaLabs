package ua.lviv.iot.lab3;

public class MountainTrip extends Tour {
    private double averageMountainHeight;
    private final TourType tourType = TourType.SPORT;

    /*public MountainTrip() {
        super();
    }*/

    @Override
    public final String toString() {
        return "MountainTrip{"
                +
                "averageMountainHeight=" + averageMountainHeight
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

    @Override
    public String getHeaders() {
        return super.getHeaders() + "averageMountainHeight, " + "tourType, ";
    }

    @Override
    public String toCSV(){
        return  super.toCSV() + averageMountainHeight + "," + tourType + ",";
    }


    public MountainTrip(final TourType tourType, final String name, final int duration, final double price, final String country, final double averageMountainHeight, final int id) {
        super(name, duration, price, country, id);
        this.averageMountainHeight = averageMountainHeight;
    }

    /*public final double getAverageMountainHeight() {
        return averageMountainHeight;
    }

    public final void setAverageMountainHeight(final double averageMountainHeight) {
        this.averageMountainHeight = averageMountainHeight;
    }*/

    public final TourType getTourType() {
        return tourType;
    }
}
