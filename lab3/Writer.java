package ua.lviv.iot.lab3;
import ua.lviv.iot.lab3.Tour;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {
    public void writeToFile(final List<Tour> toursList) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("D:\\JavaLabs/xxx.csv"))) {

            toursList.forEach((Tour x) -> {
                writer.println(x.getHeaders());
                writer.println(x.toCSV());
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}