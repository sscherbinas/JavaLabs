from Tour import *


class Rafting(Tour):
    type = TourType.SPORT

    def __init__(self, duration, price, country):
        self.duration = duration
        self.price = price
        self.country = country
