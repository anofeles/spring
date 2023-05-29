package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice start");

        long begin = System.currentTimeMillis();

        Object targetMethodResult = proceedingJoinPoint.proceed();
//        targetMethodResult = "111111111";

        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice end");

        System.out.println(end);
        System.out.println(begin);
        System.out.println(end - begin);

        return targetMethodResult;
    }
}
