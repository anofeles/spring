package hibernate;

import hibernate.entiti.Emploi;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class test {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        int numbers[] = { 1, 2, 3, 4, 5 };

        for (int number : numbers) {
            Emploi student = new Emploi("tttt_"+number, "rrrr_"+number, "it2","500");
            studentDao.saveStudent(student);
        }



        List< Emploi > getStudents = studentDao.getStudents();
        getStudents.forEach(s-> System.out.println(s.getName()));
    }

//    public static void main(String[] args) {
//        SessionFactory factory =
//                new Configuration().configure("Hibernate.cfg.xml")
//                        .addAnnotatedClass(Emploi.class)
//                        .buildSessionFactory();
//        try {
//            Session session = factory.getCurrentSession();
//            Emploi emploi = new Emploi(5,"kkk","ttttt","it","500");
//            session.beginTransaction();
//            session.save(emploi);
//            session.getTransaction().commit();
//        }finally {
//            factory.close();
//        }
//
//    }
}
