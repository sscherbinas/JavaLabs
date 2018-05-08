from Tour import *


class MountainTrip(Tour):
    type = TourType.EXTREME

    def __init__(self, duration, price, country):
        self.duration = duration
        self.price = price
        self.country = country