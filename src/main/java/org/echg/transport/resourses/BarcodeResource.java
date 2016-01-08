package org.echg.transport.resourses;

import org.echg.transport.model.CodeValidator;
import org.echg.transport.model.Trailer;
import org.echg.transport.services.BarcodeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by examiner on 12/31/15.
 */
@Path("barcode")
public class BarcodeResource {

    private BarcodeService bs = new BarcodeService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CodeValidator checkBarcodeType(@PathParam("code")String code) {

        return bs.checkValidBarcode(code);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Trailer insertTrailerData(Trailer trailer){

        return bs.addTrailerData(trailer);
    }
}
