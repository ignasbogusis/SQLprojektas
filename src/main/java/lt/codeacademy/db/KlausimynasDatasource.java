package lt.codeacademy.db;

import lt.codeacademy.entities.Klausimynas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class KlausimynasDatasource {
    public Klausimynas insertKlausimynasIntoDatabase(Klausimynas klausimynas){
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = null;
        try{
            tx = session.beginTransaction();

            session.save(klausimynas);

            tx.commit();
        } catch (Exception e){
            if(tx != null){
                tx.rollback();
                e.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return klausimynas;
    }
}
