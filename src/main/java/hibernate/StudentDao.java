package hibernate;

import hibernate.entiti.Emploi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import static hibernate.HibernateUtil.*;


public class StudentDao {
    public void saveStudent(Emploi emploi ) {
        Transaction transaction = null;
        try (Session session = getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(emploi);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List < Emploi > getStudents() {
        try (Session session = getSessionFactory().openSession()) {
            return session.createQuery("from Emploi", Emploi.class).list();
        }
    }
}
