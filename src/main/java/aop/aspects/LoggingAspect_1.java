package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(2)
public class LoggingAspect_1 {


    @Pointcut("execution(* aop.UniLibrari_1.get*())")
    public void allGetMethodFromUniLibrary() {
    }

    @Pointcut("execution(* aop.UniLibrari_1.return*())")
    public void allReturnMethodFromUniLibrary() {
    }

    @Pointcut("execution(* aop.UniLibrari_1.add*())")
    public void allAddMethodFromUniLibrary() {
    }

    @Pointcut("allGetMethodFromUniLibrary() || !allReturnMethodFromUniLibrary()")
    public void allGetAndReturnMethodFromUniLibrary() {
    }




    @Before("allGetMethodFromUniLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: log #1");
    }

    @Before("allReturnMethodFromUniLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: log #2");
    }

//    @Before("allAddMethodFromUniLibrary()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("beforeAddLoggingAdvice: log #3");
//    }

    @Before("allGetAndReturnMethodFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: log #4");
    }
}
