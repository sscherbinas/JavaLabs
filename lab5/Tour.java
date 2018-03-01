package ua.lviv.iot.lab3;

public abstract class Tour {
    private String name;
    private int duration;
    private double price;
    private String country;
    private TourType tourType;

    public Tour() {
        }

    public Tour(final String name, final int duration, final double price, final String country) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.country = country;
        }

    public abstract TourType getTourType();

    public Tour(final String name, final TourType tourType, final int duration) {
        this.name = name;
        this.tourType = tourType;
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
