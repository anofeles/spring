package aop.aspects;

import aop.Student;
import jdk.jfr.Experimental;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UnivesityLoginAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: login get list student front of getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "jemala " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrate = firstStudent.getAvgGrade();
        avgGrate = avgGrate + 12;
        firstStudent.setAvgGrade(avgGrate);

        System.out.println("beforeGetStudentsLoggingAdvice: login get list student out of getStudents");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exception")
    public void AfterThrowingGetStudentsLoggingAdvice(Throwable exception){
        System.out.println("AfterThrowingGetStudentsLoggingAdvice log error " + exception);
    }

    @After("execution(* getStudents())")
    public void AfterGetStudentsLoggingAdvice(JoinPoint joinPoint){
        System.out.println("AfterGetStudentsLoggingAdvice log After ");
    }
}
