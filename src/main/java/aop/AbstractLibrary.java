package aop;

import org.springframework.stereotype.Component;

@Component
public abstract class AbstractLibrary {

    public void getBook(){
        System.out.println("add book 2");

    }
}
