package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    // TODO:pointcut ("execution(public void getBook())")
    // TODO:pointcut ("execution(* *())") * voilcut

//    @Before("execution(public void getBook())")
//    @Before("execution(public void aop.UniLibrari.getBook())")
    @Before("execution(public void aop.UniLibrari.get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice");
    }

//    @Before("execution(public void aop.UniLibrari.getBook_1(*))")
//    @Before("execution(public void aop.UniLibrari.getBook_1(..))")
    @Before("execution(public void aop.UniLibrari.getBook_1(aop.Book))")
    public void beforeGetBook_1Advice(){
        System.out.println("beforeGetBook_1Advice");
    }

    //    @Before("execution(* ReturnBook())")
//    @Before("execution(* *())")
//    @Before("execution(* *(*))")
//    @Before("execution(* *(..))")
    @Before("execution(public * ReturnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice");
    }
}
