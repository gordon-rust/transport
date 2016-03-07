package org.echg.transport.resourses;

import org.echg.transport.model.dto.ContainerEntity;
import org.echg.transport.model.dto.TrailerEntity;
import org.echg.transport.model.pojo.Container;
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
/*
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<TrailerDTO> queryAllTrailers() {

        return bs.getAllTrailers();
    }
*/
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public TrailerEntity insertTrailer(TrailerEntity trailer){
        return bs.insertTrailerData(trailer);
    }
/*
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean insertUnloadedTrailer(TrailerDTO trailer){

        return bs.updateTrailerData(trailer);
    }
*/
    @DELETE
    @Path("/{barcode}")
    public void deleteTrailer(@PathParam("barcode") String barcode) {
        bs.removeBarcode(barcode);
    }
}
