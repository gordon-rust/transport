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

import java.util.Iterator;
import java.util.List;

/**
 * Created by examiner on 2/26/16.
 */
public class TrailerDAO {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
/*
    public List<TrailerDTO> getAllTrailers() {
        List<TrailerDTO> trailers = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            trailers = session.createQuery("from Trailer T").list();
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
        return trailers;
    }*/

    public boolean saveTrailer(Trailer trailer) {
        Session session = null;
        boolean hasErrors = false;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();

            TrailerEntity te = new TrailerEntity();
            te.setBarcode(trailer.getBarcode());
            te.setBarcodeFormat(trailer.getBarcodeFormat());
            te.setScannedDate(trailer.getScannedDate());
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
