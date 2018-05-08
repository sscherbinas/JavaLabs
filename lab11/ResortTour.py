from Tour import *


class ResortTour(Tour):
    type = TourType.FAMILY

    def __init__(self, duration, price, country):
        self.duration = duration
        self.price = price
        self.country = country
