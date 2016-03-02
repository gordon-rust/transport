package org.echg.transport.model.dao;

import org.echg.transport.database.HibernateUtil;
import org.echg.transport.model.ContainerEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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

    public boolean saveTrailer(ContainerEntity trailer) {
        Session session = null;
        boolean hasErrors = false;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(trailer);
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
