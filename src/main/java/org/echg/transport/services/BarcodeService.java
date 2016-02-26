package org.echg.transport.services;

import org.echg.transport.model.pojo.Address;
import org.echg.transport.model.pojo.Container;
import org.echg.transport.model.pojo.Trailer;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by examiner on 12/31/15.
 */
public class BarcodeService {
    public Trailer insertTrailerData(Trailer trailer){
        return trailer;
    }

    public Trailer updateTrailerData(Trailer trailer){
        return trailer;
    }

    public ArrayList<Trailer> getAllTrailers(){
        Trailer trailer = new Trailer();
        trailer.setBarcode("11133344455");
        trailer.setBarcodeFormat("ASCII");
        trailer.setScannedDate(new Date());

        ArrayList<Address> addr = new ArrayList<Address>();
        addr.add(getAddress());
        trailer.setAddresses(addr);

        ArrayList<Container> cont = new ArrayList<Container>();
        cont.add(getContainer());
        cont.add(getContainerOne());
        trailer.setContainerList(cont);

        Trailer trailerOne = new Trailer();
        trailerOne.setBarcode("473828295455");
        trailerOne.setBarcodeFormat("ASCII");
        trailerOne.setScannedDate(new Date());

        ArrayList<Address> addr1 = new ArrayList<Address>();
        addr1.add(getAddressOne());
        trailerOne.setAddresses(addr1);

        ArrayList<Container> cont1 = new ArrayList<Container>();
        cont1.add(getContainerTwo());
        cont1.add(getContainerThree());
        trailerOne.setContainerList(cont);

        ArrayList<Trailer> trailerList = new ArrayList<>();
        trailerList.add(trailer);
        trailerList.add(trailerOne);
        return trailerList;
    }

    public void removeBarcode(String barcode){
        System.out.println("Trailer with this barcode will be deleted " + barcode);
    }

    private Address getAddress(){
        Address address = new Address();
        address.setFeature("111");
        address.setThoroughfare("Old Forest Circle");
        address.setLocality("Winchester");
        address.setAdmin("VA");
        address.setPostal("22602");
        address.setLatitude(39.18566);
        address.setLongitude(78.16333);

        return address;
    }

    private Address getAddressOne(){
        Address address = new Address();
        address.setFeature("113");
        address.setThoroughfare("Old Forest Circle");
        address.setLocality("Winchester");
        address.setAdmin("VA");
        address.setPostal("22602");
        address.setLatitude(39.18566);
        address.setLongitude(78.16333);

        return address;
    }

    private Address getAddressTwo(){
        Address address = new Address();
        address.setFeature("115");
        address.setThoroughfare("Old Forest Circle");
        address.setLocality("Winchester");
        address.setAdmin("VA");
        address.setPostal("22602");
        address.setLatitude(39.18566);
        address.setLongitude(78.16333);

        return address;
    }

    private Container getContainer() {
        Container container = new Container();
        container.setScannedDate(new Date());
        container.setBarcode("948023850238");
        container.setBarcodeFormat("ASCII");

        return container;
    }

    private Container getContainerOne() {
        Container container = new Container();
        container.setScannedDate(new Date());
        container.setBarcode("94546477389");
        container.setBarcodeFormat("ASCII");

        return container;
    }

    private Container getContainerTwo() {
        Container container = new Container();
        container.setScannedDate(new Date());
        container.setBarcode("099348487585");
        container.setBarcodeFormat("ASCII");

        return container;
    }

    private Container getContainerThree() {
        Container container = new Container();
        container.setScannedDate(new Date());
        container.setBarcode("129958249");
        container.setBarcodeFormat("ASCII");

        return container;
    }
}
