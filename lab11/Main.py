from MountainTrip import *
from Rafting import *
from ResortTour import *
from AgencyManager import *

if __name__ == "__main__":
    manager = AgencyManager()

    mountainTrip = MountainTrip(5, 500, "France")
    resortTour = ResortTour(8, 900, "Germany")
    rafting = Rafting(1, 150, "Ukraine")

    manager.trips = [mountainTrip, resortTour, rafting]
    print("Initial list:")
    for trip in manager.trips:
        print(str(trip))
    print("\n")

    trips = manager.find_by_type(TourType.SPORT)
    print("Found by type:")
    for trip in trips:
        print(str(trip))
    print("\n")

    manager.sort_by_duration()
    print("Sorted list:")
    for trip in manager.trips:
        print(str(trip))
