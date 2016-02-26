package org.echg.transport.resourses;

import org.echg.transport.model.pojo.Trailer;
import org.echg.transport.services.BarcodeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

/**
 * Created by examiner on 12/31/15.
 */
@Path("barcode")
public class BarcodeResource {

    private BarcodeService bs = new BarcodeService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Trailer> queryAllTrailers() {

        return bs.getAllTrailers();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Trailer insertLoadedTrailer(Trailer trailer){

        return bs.insertTrailerData(trailer);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Trailer insertUnloadedTrailer(Trailer trailer){

        return bs.updateTrailerData(trailer);
    }

    @DELETE
    @Path("/{barcode}")
    public void deleteTrailer(@PathParam("barcode") String barcode) {
        bs.removeBarcode(barcode);
    }
}
