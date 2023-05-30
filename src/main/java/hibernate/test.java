package hibernate;

import hibernate.entiti.Emploi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class test {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Emploi student = new Emploi(2,"tttt1111", "rrrr", "it2","500");
        studentDao.saveStudent(student);

        List< Emploi > getStudents = studentDao.getStudents();
        getStudents.forEach(s-> System.out.println(s.getName()));
    }
}
