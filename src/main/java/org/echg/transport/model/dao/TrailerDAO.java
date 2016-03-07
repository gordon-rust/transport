package org.echg.transport.model.dao;

import org.echg.transport.database.HibernateUtil;
import org.echg.transport.model.dto.AddressEntity;
import org.echg.transport.model.dto.ContainerEntity;
import org.echg.transport.model.dto.TrailerEntity;
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

    public boolean saveTrailer(TrailerEntity trailer) {
        Session session = null;
        boolean hasErrors = false;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(trailer);

            Iterator<AddressEntity> addrIterate = trailer.getAddresses().iterator();
            while(addrIterate.hasNext()){
                session.save(addrIterate.next());
            }

            Iterator<ContainerEntity> contIterate = trailer.getContainers().iterator();
            while(addrIterate.hasNext()){
                session.save(contIterate.next());
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
