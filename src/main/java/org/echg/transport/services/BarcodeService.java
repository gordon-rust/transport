package org.echg.transport.services;

import org.echg.transport.model.dao.TrailerDAO;
import org.echg.transport.model.dto.TrailerEntity;
import org.echg.transport.model.pojo.Address;
import org.echg.transport.model.pojo.Container;
import org.echg.transport.model.pojo.Trailer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by examiner on 12/31/15.
 */
public class BarcodeService {
    TrailerDAO trailerDAO = new TrailerDAO();

    public Trailer insertTrailerData(Trailer trailer){
        trailer.setScannedDate(new Date());
        Iterator<Container> contIterate = trailer.getContainers().iterator();
        while(contIterate.hasNext()) {
            contIterate.next().setScannedDate(new Date());
        }

        if(trailerDAO.saveTrailer(trailer)){
            System.out.println("Insert issue");
        }
        return trailer;
        //System.out.println("Insert");
        //return trailer;
    }
/*
    public boolean updateTrailerData(TrailerDTO trailer){
        return trailerDAO.saveTrailer(trailer);
    }
*/
    public List<Trailer> getAllTrailers(){
        // May need to convert trailer to trailer DTO
        return (List<Trailer>) trailerDAO.getAllTrailers();
    }

    public void removeBarcode(String barcode){
        System.out.println("Trailer with this barcode will be deleted " + barcode);
    }

}
