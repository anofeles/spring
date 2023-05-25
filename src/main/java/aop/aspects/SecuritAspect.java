package aop.aspects;


import aop.Book;
import jdk.jshell.MethodSnippet;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(4)
public class SecuritAspect {

    @Before("aop.aspects.MyPintCut.AllAddMethod()")
    public void beforeAddSecurityAdvance(JoinPoint joinPoint) {
        MethodSignature MethodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature = " + MethodSignature);
        System.out.println("MethodSignature.getMethod = " + MethodSignature.getMethod());
        System.out.println("MethodSignature.getReturnType = " + MethodSignature.getReturnType());
        System.out.println("MethodSignature.getName = " + MethodSignature.getName());

        if (MethodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj:arguments){
                if(obj instanceof Book){
                    Book mybook = (Book) obj;
                    System.out.println("saxeli - " + mybook.getName() + ", avtori - " + mybook.getAuthor() + ", tarigi - "+mybook.getYerOfPublication());
                }
                else if (obj instanceof String ){
                    System.out.println("damatenba " + obj);
                }
            }
        }


        System.out.println("beforeGetSecurityAdvance: log 20");
        System.out.println("----------------------------------");
    }
}
