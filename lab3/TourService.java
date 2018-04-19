package ua.lviv.iot.lab3;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/tours")
public class TourService {

    private static Map<Integer, Tour> toursMap = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public final Tour getTour(@PathParam("id") Integer id) {
        return toursMap.get(id);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Tour createTour(@PathParam("id") Integer id, Tour tour) {
        toursMap.put(id, tour);
        return toursMap.get(id);
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteTour(@PathParam("id") Integer id) {
        toursMap.remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateTour(Tour tour) {
        toursMap.replace(tour.getId(), tour);
        return Response.status(200).entity(toursMap.get(tour.getId())).build();
    }


}