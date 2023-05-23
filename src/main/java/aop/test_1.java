package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test_1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        librari librari = context.getBean("libraryBean",aop.librari.class);
        librari.getBook();

        context.close();
    }
}
