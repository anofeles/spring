package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test_1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrari librari = context.getBean("uniLibrari", UniLibrari.class);
//        librari.getBook();
        librari.getMagazin();
        librari.ReturnBook();

//        SchoolLibrary SchoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        SchoolLibrary.getBook();

        context.close();
    }
}
