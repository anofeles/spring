package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class MyPintCut {

//    @Pointcut("execution(* add*(..))")
    @Pointcut("execution(* abc*(..))")
    public void AllAddMethod(){}
}
