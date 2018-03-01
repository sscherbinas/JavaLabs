package ua.lviv.iot.lab3;

import java.util.LinkedList;
import java.util.List;

public class Agency {
    private String agencyName;
    private String agencyAddress;
    private List<Tour> tourList;

    public Agency(final String agencyName, final String agencyAddress) {
        this.agencyName = agencyName;
        this.agencyAddress = agencyAddress;
        this.tourList = new LinkedList<>();
    }

    public void addTour(final Tour addTour) {
        tourList.add(addTour);
    }
    //sort by duration
    public List<Tour> sortTourByDuration(final List<Tour> list) {
        list.sort((Tour o1, Tour o2) -> o1.getDuration() - o2.getDuration());
        return list;
    }

    public List<Tour> findByType(final TourType tourType) {
        List<Tour> result = new LinkedList<>();
        tourList.stream().filter((tourList) -> ((tourList.getTourType() == tourType))).forEachOrdered((tourList) ->
            result.add(tourList));
        return result;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(final String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyAddress() {
        return agencyAddress;
    }

    public void setAgencyAddress(final String agencyAddress) {
        this.agencyAddress = agencyAddress;
    }

    public List<Tour> getTourList() {
        return tourList;
    }

    public void setTourList(final List<Tour> tourList) {
        this.tourList = tourList;
    }
}
