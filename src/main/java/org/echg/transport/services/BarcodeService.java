package org.echg.transport.services;

import org.echg.transport.model.ContainerEntity;
import org.echg.transport.model.dao.TrailerDAO;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by examiner on 12/31/15.
 */
public class BarcodeService {
    TrailerDAO trailerDAO = new TrailerDAO();

    public ContainerEntity insertContainerData(ContainerEntity trailer){
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

    public ArrayList<TrailerDTO> getAllTrailers(){
        // May need to convert trailer to trailer DTO
        //return (ArrayList<TrailerDTO>) trailerDAO.getAllTrailers();
    }
*/
    public void removeBarcode(String barcode){
        System.out.println("Trailer with this barcode will be deleted " + barcode);
    }

}
