package ua.lviv.iot.lab3;

import java.util.List;

public class First {

    public static void printList(final List<Tour> List) {
        List.forEach((Tour x) -> {
            System.out.println(x.toString());
        });
    }

    public static void main(String[] args) {
        Agency agency = new Agency("JoinUp!", "Lviv, Franko Street 24/10a");

        Tour ResortTour = new ResortTour("Lazy Holidays", 14, 3000, "Croatia", "Makarska", "Magestic");
        Tour Rafting = new Rafting("Turkish Rafting", 7, 200, "Turkey", 100);
        Tour MountainTrip = new MountainTrip("Tyrol Nature", 4, 150, "Austria", 2500);

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
}



