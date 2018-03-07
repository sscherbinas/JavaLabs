package ua.lviv.iot.lab3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.lviv.iot.lab3.Agency.printList;

class AgencyTest {
    private static Tour tour = new ResortTour(TourType.FAMILY,"Adriatic", 14, 300, "Croatia", "Makarska", "Bella");
    private static Tour tour1 = new MountainTrip(TourType.SPORT,"Mountain", 5, 150, "Austria", 3000);
    private static Agency manager = new Agency("Abc", "lviv");
    private static Tour tour2 = new Rafting(TourType.EXTREME,"ahs", 25, 200, "Turkey", 200);
    private static Tour tour3 = new Sport("adn", 26, 300, "Austria");
    private static Tour tour4 = new Family("ads", 27, 200, "Croatia");
    private static Tour tour5 = new Extreme("asd", 28, 400, "turkey");
    private List<Tour> testList = new LinkedList<>();

    @BeforeAll
    static void addToursForList(){
        manager.addTour(tour);
        manager.addTour(tour1);
        manager.addTour(tour2);
        manager.addTour(tour3);
        manager.addTour(tour4);
        manager.addTour(tour5);
    }

    @BeforeEach
    void setUp() {
        Agency agency = new Agency("JoinUp!", "Lviv, Franko Street 24/10a");

        Tour ResortTour = new ResortTour(TourType.FAMILY,"Lazy Holidays", 14, 3000, "Croatia", "Makarska", "Magestic");
        Tour Rafting = new Rafting(TourType.EXTREME,"Turkish Rafting", 7, 200, "Turkey", 100);
        Tour MountainTrip = new MountainTrip(TourType.SPORT,"Tyrol Nature", 4, 150, "Austria", 2500);

        agency.addTour(ResortTour);
        agency.addTour(Rafting);
        agency.addTour(MountainTrip);

        agency.sortTourByDuration(agency.getTourList());

        for (Tour tour : agency.getTourList()) {

            System.out.println(" Tour " + tour.getName() + " - INFO: duration: " + tour.getDuration() + "; "
                    + tour.getPrice() + "$; country: " + tour.getCountry());
        }

        List<Tour> result = agency.findByType(TourType.SPORT);
        printList(result);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addTour() {
        Agency testManager = new Agency("", "");
        testManager.addTour(tour);
        assertEquals(tour, testManager.getTourList().get(0));
    }

    @Test
    void sortTourByDuration() {
        testList = manager.sortTourByDuration(manager.getTourList());
        assertEquals(6, testList.size());
        assertEquals(tour1.getDuration(), testList.get(0).getDuration());
        assertEquals(tour.getDuration(), testList.get(1).getDuration());
        assertEquals(tour2.getDuration(), testList.get(2).getDuration());
        assertEquals(tour3.getDuration(), testList.get(3).getDuration());
        assertEquals(tour4.getDuration(), testList.get(4).getDuration());
        assertEquals(tour5.getDuration(), testList.get(5).getDuration());
    }

    @Test
    void findByType() {
        testList = manager.findByType(tour.getTourType());
        assertEquals(2, testList.size());
        assertEquals(tour, testList.get(0));
        testList = manager.findByType(tour1.getTourType());
        assertEquals(2, testList.size());
        testList = manager.findByType(tour2.getTourType());
        assertEquals(2, testList.size());
        testList = manager.findByType(tour3.getTourType());
        assertEquals(2, testList.size());
        testList = manager.findByType(tour4.getTourType());
        assertEquals(2, testList.size());
        testList = manager.findByType(tour5.getTourType());
        assertEquals(2, testList.size());
        testList = manager.findByType(null);
        assertEquals(0, testList.size());
    }
}