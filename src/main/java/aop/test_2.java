package aop;

import aop.aspects.LoggingAspect;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test_2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrari_1 uniLibrari1 = context.getBean("uniLibrari_1", UniLibrari_1.class);
        Book book = context.getBean("book", Book.class);
        uniLibrari1.addBook("kakha",book);
        uniLibrari1.addMagazine();
//        uniLibrari1.getMagazine();
//        uniLibrari1.returnMagazine();
    }
}
