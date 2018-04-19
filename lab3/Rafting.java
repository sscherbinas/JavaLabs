package ua.lviv.iot.lab3;

public class Rafting extends Tour {
    private double averageRiverDepth;
    private final TourType tourType = TourType.EXTREME;

    /*public Rafting() {
        }*/

    public Rafting(final TourType tourType, final String name, final int duration, final double price, final String country, final double averageRiverDepth, final int id) {
        super(name, duration, price, country, id);
        this.averageRiverDepth = averageRiverDepth;
    }

    @Override
    public final String toString() {
        return "Rafting{"
                +
                "averageRiverDepth=" + averageRiverDepth
                +
                ", tourType=" + tourType
                +
                ", name='" + getName() + '\''
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
        return super.getHeaders() + "averageRiverDepth, " + "tourType, ";
    }

    @Override
    public String toCSV(){
        return super.toCSV() + averageRiverDepth + "," + tourType + ",";
    }


    /*public final double getAverageRiverDepth() {
        return averageRiverDepth;
    }

    public final void setAverageRiverDepth(final double averageRiverDepth) {
        this.averageRiverDepth = averageRiverDepth;
    }*/

    public final TourType getTourType() {
        return tourType;
    }
}
