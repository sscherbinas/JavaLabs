class AgencyManager:

    def __init__(self):
        pass

    def sort_by_duration(self):
        self.trips.sort(key=lambda trip: trip.duration)

    def find_by_type(self, type):
        found_trips = []
        for trip in self.trips:
            if trip.type == type:
                found_trips.append(trip)
        return found_trips
