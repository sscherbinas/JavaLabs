package ua.lviv.iot.lab3;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Agency {
    private String agencyName;
    private String agencyAddress;
    private Map<Integer, Tour> map = new HashMap<>();

    public Agency(final String agencyName, final String agencyAddress) {
        this.agencyName = agencyName;
        this.agencyAddress = agencyAddress;
    }

//    public final void addTour(final Tour addTour) {
//        this.tourList.add(addTour);
//    }

    //sort by duration
//    public final  List<Tour> sortTourByDuration(final List<Tour> list) {
//        list.sort((Tour o1, Tour o2) -> o1.getDuration() - o2.getDuration());
//        return list;
//    }
//
//    public final List<Tour> findByType(final TourType tourType) {
//        List<Tour> result = new LinkedList<>();
//        tourList.stream().filter((tourList) -> (tourList.getTourType() == tourType)).forEachOrdered((tourList) ->
//                result.add(tourList));
//        return result;
//    }

/*    public final String getAgencyName() {
        return agencyName;
    }

    public final void setAgencyName(final String agencyName) {
        this.agencyName = agencyName;
    }

    public final String getAgencyAddress() {
        return agencyAddress;
    }

    public final void setAgencyAddress(final String agencyAddress) {
        this.agencyAddress = agencyAddress;
    }*/
//
//    public final List<Tour> getTourList() {
//        return tourList;
//    }


    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyAddress() {
        return agencyAddress;
    }

    public void setAgencyAddress(String agencyAddress) {
        this.agencyAddress = agencyAddress;
    }

    public Map<Integer, Tour> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Tour> map) {
        this.map = map;
    }

    public static void printList(final List<Tour> List) {
        List.forEach((Tour x) -> {
            System.out.println(x.toString());
        });
    }

//    public final void setTourList(final List<Tour> tourList) {
//        this.tourList = tourList;
//    }
}
