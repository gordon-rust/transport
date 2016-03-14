package org.echg.transport.resourses;

import org.echg.transport.model.pojo.Trailer;
import org.echg.transport.services.BarcodeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by examiner on 12/31/15.
 */
@Path("barcode")
public class BarcodeResource {

    private BarcodeService bs = new BarcodeService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Trailer> queryAllTrailers() {

        return bs.getAllTrailers();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{trailerId}")
    public Trailer getTrailerById(@PathParam("trailerId") int trailerId) {

        return bs.getTrailerById(trailerId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Trailer insertTrailer(Trailer trailer){

        return bs.insertTrailerData(trailer);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Trailer updateTrailerData(Trailer trailer) {

        return bs.updateTrailerData(trailer);
    }

    @DELETE
    @Path("/{barcode}")
    public void deleteTrailer(@PathParam("barcode") String barcode) {
        bs.removeBarcode(barcode);
    }
}
