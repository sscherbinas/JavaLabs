import java.io.Serializable;

public abstract class Tour {
    String name;
    int duration;
    double price;
    String country;
    TourType tourType;

    public Tour() {

    }

    public Tour(String name, int duration, double price, String country) {

        this.name = name;
        this.duration = duration;
        this.price = price;
        this.country = country;

    }

    public abstract TourType getTourType();


    public Tour(String name, TourType tourType, int duration) {
        this.name = name;
        this.duration = duration;
    }


    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }


    public int getDuration() {

        return duration;
    }

    public void setDuration(int duration) {

        this.duration = duration;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getCountry() {

        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }
}
