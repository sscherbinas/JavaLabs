public class First {
    public static void main(String[] args) {

        ArtificialChristmasTree martin = new ArtificialChristmasTree();

        martin.setColor("Dark green");
        martin.setType("Pine-tree");
        martin.setStructure("Fold-out");
        martin.setManufacturer("China");
        martin.setHeight(150);
        martin.wholeHeight = 400;

        System.out.println(martin.toString());
        martin.printStaticSum();
        martin.printSum();


        ArtificialChristmasTree garry = new ArtificialChristmasTree("Light green", "Fir-tree", "One-piece", "Pakistan");
        garry.setHeight(150);
        garry.wholeHeight = 400;

        System.out.println(garry.toString());
        garry.printStaticSum();
        garry.printSum();


        ArtificialChristmasTree sam = new ArtificialChristmasTree("Blue-green", "Pine-tree", "One-piece", "China", 80, 330);

        System.out.println(sam.toString());
        sam.printStaticSum();
        sam.printSum();
    }
}
