public class ArtificialChristmasTree {

    private String color;
    private String type;
    private String structure;
    private String manufacturer;
    private int height;

    static int wholeHeight;

    ArtificialChristmasTree() {};

    public ArtificialChristmasTree(String color, String type, String structure, String manufacturer) {
        this.color = color;
        this.type = type;
        this.structure = structure;
        this.manufacturer = manufacturer;
    }

    public ArtificialChristmasTree(String color, String type, String structure, String manufacturer, int height, int wholeHeight) {
        this.color = color;
        this.type = type;
        this.structure = structure;
        this.manufacturer = manufacturer;
        this.height = height;
        this.wholeHeight = wholeHeight;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public String toString() {
        String characteristics = "Artificial Christmas tree: \n"
                + "Color: " + color + "\n"
                + "Type: " + type + "\n"
                + "Structure: " + structure + "\n"
                + "Manufacturer: " + manufacturer + "\n"
                + "Height: " + height + "\n"
                + "Whole height: " + wholeHeight + "\n";
        return characteristics;
    }

    public static void printStaticSum() {
        System.out.println("Whole height: " + wholeHeight + "\n");
    }

    public void printSum() {
        System.out.println("Whole height: " + wholeHeight + "\n");
    }

    public void resetValues(String color, String type, String structure, String manufacturer, int height, int wholeHeight) {
        this.color = color;
        this.type = type;
        this.structure = structure;
        this.manufacturer = manufacturer;
        this.height = height;
        this.wholeHeight = wholeHeight;
    }
}
