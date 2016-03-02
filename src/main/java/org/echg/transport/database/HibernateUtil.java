package org.echg.transport.database;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Created by examiner on 2/26/16.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        //Configuration configuration = new Configuration().configure();
        //StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        //sessionFactory = configuration.buildSessionFactory(builder.build());

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial Session Factory creation failed" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void close() { sessionFactory.close();}
}
