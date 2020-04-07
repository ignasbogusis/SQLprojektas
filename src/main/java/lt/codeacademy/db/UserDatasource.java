package lt.codeacademy.db;

import lt.codeacademy.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class UserDatasource {
    public User inserUserIntoDatabase(User user){

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = null;
        try{
            tx = session.beginTransaction();

            session.save(user);

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

        return user;
    }

    public List<User> getAllUsersInformation(){
        SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();

        Query<User> query = session.createQuery("FROM User", User.class);

        final List<User> vartotojai = query.list();

        return  vartotojai;
    }
}
