package aop.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExeptionHandligAspect {

    @Before("aop.aspects.MyPintCut.AllAddMethod()")
    public void beforeAddExceptionHandlingAdvice(JoinPoint joinPoint){
        System.out.println("beforeGetExceptionHandlingAdvice");
        System.out.println("----------------------------------");
    }
}
