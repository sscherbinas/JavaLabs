public class First {
    public static void main(String [] args) {

        ArtificialChristmasTree Martin = new ArtificialChristmasTree();

        Martin.setColor("Dark green");
        Martin.setType("Pine-tree");
        Martin.setStructure("Fold-out");
        Martin.setManufacturer("China");
        Martin.setHeight(150);
        Martin.wholeHeight = 400;

        System.out.println(Martin.toString());
        Martin.printStaticSum();
        Martin.printSum();


        ArtificialChristmasTree Garry = new ArtificialChristmasTree("Light green", "Fir-tree", "One-piece", "Pakistan");
        Garry.setHeight(150);
        Garry.wholeHeight = 400;

        System.out.println(Garry.toString());
        Garry.printStaticSum();
        Garry.printSum();


        ArtificialChristmasTree Sam = new ArtificialChristmasTree("Blue-green", "Pine-tree", "One-piece", "China", 80, 330);

        System.out.println(Sam.toString());
        Sam.printStaticSum();
        Sam.printSum();
    }
}
