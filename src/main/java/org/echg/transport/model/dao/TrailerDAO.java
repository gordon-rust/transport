package org.echg.transport.model.dao;

import org.echg.transport.database.HibernateUtil;
import org.echg.transport.model.dto.AddressEntity;
import org.echg.transport.model.dto.ContainerEntity;
import org.echg.transport.model.dto.TrailerEntity;
import org.echg.transport.model.pojo.Address;
import org.echg.transport.model.pojo.Container;
import org.echg.transport.model.pojo.Trailer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by examiner on 2/26/16.
 */
public class TrailerDAO {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public List<Trailer> getAllTrailers() {
        List<TrailerEntity> trailers = null;
        List<Trailer> trailersJSON = new ArrayList<>();
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();

            trailers = session.createQuery("select t from TrailerEntity t").list();

            for(int i=0; i<trailers.size(); i++){
                Trailer t = new Trailer();
                t.setBarcode(trailers.get(i).getBarcode());
                t.setBarcodeFormat(trailers.get(i).getBarcodeFormat());
                t.setScannedPickupDate(trailers.get(i).getScannedPickupDate());
                t.setScannedDropoffDate(trailers.get(i).getScannedDropoffDate());
                t.setTrailerID(trailers.get(i).getTrailerId());

                List<Container> containers = new ArrayList<>();
                for(ContainerEntity c:trailers.get(i).getContainers()){
                    Container ce = new Container();
                    ce.setScannedDate(c.getScannedDate());
                    ce.setBarcode(c.getBarcode());
                    ce.setBarcodeFormat(c.getBarcodeFormat());
                    containers.add(ce);
                }

                List<Address> addresses = new ArrayList<>();
                for(AddressEntity a:trailers.get(i).getAddresses()) {
                    Address ae = new Address();
                    ae.setFeature(a.getFeature());
                    ae.setAdmin(a.getAdmin());
                    ae.setLongitude(a.getLongitude());
                    ae.setLatitude(a.getLatitude());
                    ae.setThoroughfare(a.getThoroughfare());
                    ae.setLocality(a.getLocality());
                    ae.setPostal(a.getPostal());
                    addresses.add(ae);
                }

                t.setAddresses(addresses);
                t.setContainers(containers);
                trailersJSON.add(t);
            }
            session.getTransaction().commit();
        }
        catch(Exception ex) {
            if(session != null) {
                session.getTransaction().rollback();
            }
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return trailersJSON;
    }

    public Trailer getTrailerByID(int id) {
        Trailer t = new Trailer();
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();

            TrailerEntity te = (TrailerEntity) session.get(TrailerEntity.class, id);

            t.setBarcode(te.getBarcode());
            t.setBarcodeFormat(te.getBarcodeFormat());
            t.setScannedPickupDate(te.getScannedPickupDate());
            t.setScannedDropoffDate(te.getScannedDropoffDate());
            t.setTrailerID(te.getTrailerId());

            List<Container> containers = new ArrayList<>();
            for(ContainerEntity c:te.getContainers()){
                Container ce = new Container();
                ce.setScannedDate(c.getScannedDate());
                ce.setBarcode(c.getBarcode());
                ce.setBarcodeFormat(c.getBarcodeFormat());
                containers.add(ce);
            }

            List<Address> addresses = new ArrayList<>();
            for(AddressEntity a:te.getAddresses()) {
                Address ae = new Address();
                ae.setFeature(a.getFeature());
                ae.setAdmin(a.getAdmin());
                ae.setLongitude(a.getLongitude());
                ae.setLatitude(a.getLatitude());
                ae.setThoroughfare(a.getThoroughfare());
                ae.setLocality(a.getLocality());
                ae.setPostal(a.getPostal());
                addresses.add(ae);
            }

            t.setAddresses(addresses);
            t.setContainers(containers);
            session.getTransaction().commit();
        }
        catch(Exception ex) {
            if(session != null) {
                session.getTransaction().rollback();
            }
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return t;
    }

    public Trailer updateTrailerById(Trailer trailer) {
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();

            TrailerEntity te = (TrailerEntity) session.get(TrailerEntity.class, trailer.getTrailerID());
            te.setScannedDropoffDate(trailer.getScannedDropoffDate());

            AddressEntity ae = new AddressEntity();
            ae.setFeature(trailer.getAddresses().get(1).getFeature());
            ae.setAdmin(trailer.getAddresses().get(1).getAdmin());
            ae.setLongitude(trailer.getAddresses().get(1).getLongitude());
            ae.setLatitude(trailer.getAddresses().get(1).getLatitude());
            ae.setThoroughfare(trailer.getAddresses().get(1).getThoroughfare());
            ae.setLocality(trailer.getAddresses().get(1).getLocality());
            ae.setPostal(trailer.getAddresses().get(1).getPostal());
            ae.setTrailer(te);
            te.getAddresses().add(ae);

            session.update(te);
            session.getTransaction().commit();
        }
        catch(Exception ex) {
            if(session != null) {
                session.getTransaction().rollback();
            }
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return getTrailerByID(trailer.getTrailerID());
    }

    public boolean saveTrailer(Trailer trailer) {
        Session session = null;
        boolean hasErrors = false;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();

            TrailerEntity te = new TrailerEntity();
            te.setBarcode(trailer.getBarcode());
            te.setBarcodeFormat(trailer.getBarcodeFormat());
            te.setScannedPickupDate(trailer.getScannedPickupDate());
            te.setScannedDropoffDate(trailer.getScannedDropoffDate());
            session.save(te);

            for(Container c:trailer.getContainers()){
                ContainerEntity ce = new ContainerEntity();
                ce.setScannedDate(c.getScannedDate());
                ce.setBarcode(c.getBarcode());
                ce.setBarcodeFormat(c.getBarcodeFormat());

                ce.setTrailer(te);
                //Some examples show that the inverse relationship must be set
                //te.getContainers().add(ce);
                session.save(ce);
            }

            for(Address a:trailer.getAddresses()){
                AddressEntity ae = new AddressEntity();
                ae.setFeature(a.getFeature());
                ae.setAdmin(a.getAdmin());
                ae.setLongitude(a.getLongitude());
                ae.setLatitude(a.getLatitude());
                ae.setThoroughfare(a.getThoroughfare());
                ae.setLocality(a.getLocality());
                ae.setPostal(a.getPostal());

                ae.setTrailer(te);
                //Some examples show that the inverse relationship must be set
                //te.getAddresses().add(ae);
                session.save(ae);
            }

            session.getTransaction().commit();
        }
        catch (Exception ex){
            if(session != null) {
                session.getTransaction().rollback();
            }
            hasErrors = true;
        }
        finally {
            if(session != null){
                session.close();
            }
            hasErrors = false;
        }

        return hasErrors;
    }
}
