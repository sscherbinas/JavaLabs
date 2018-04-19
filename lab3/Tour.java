package ua.lviv.iot.lab3;

public class Tour {
    private String name;
    private int duration;
    private double price;
    private String country;
    private int id;

    public Tour(final String name, final int duration, final double price, final String country, final int id) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.country = country;
        setId(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeaders(){
        return "name, " + "duration, " + "price, " + "counntry, ";
    }

    public String toCSV(){
        return name + "," + duration + "," + price + "," + country + ",";
    }

    public Tour() {
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final int getDuration() {
        return duration;
    }

    public final void setDuration(final int duration) {
        this.duration = duration;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final String getCountry() {
        return country;
    }

    public final void setCountry(final String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }
}
