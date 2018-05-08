from enum import Enum


class TourType(Enum):
    FAMILY = 1
    SPORT = 2
    EXTREME = 3


class Tour:
    type = None
    duration = 0
    price = 0.0
    country = None

    def __init__(self, duration, price, country):
        self.duration = duration
        self.price = price
        self.country = country

    def __str__(self):
        return self.type.name + " " + str(self.duration) + " " + str(self.price) + " " + self.country
