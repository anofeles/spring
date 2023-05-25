package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(){
        Student std_1 = new Student("kaxa m_1",5,4.5);
        Student std_2 = new Student("kaxa m_2",5,4.5);
        Student std_3 = new Student("kaxa m_3",5,4.5);
        students.add(std_1);
        students.add(std_2);
        students.add(std_3);
    }

    public List<Student> getStudents(){
        System.out.println("mushaobis dawyeba");
//        System.out.println(students.get(3));
        System.out.println("information from student");
        System.out.println(students);
        return students;
    }

}

