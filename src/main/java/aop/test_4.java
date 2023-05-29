package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test_4 {
    public static void main(String[] args) {
        System.out.println("start ");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrari_1 uniLibrari1 = context.getBean("uniLibrari_1", UniLibrari_1.class);
        String bookName = uniLibrari1.returnBook();
        System.out.println("test 213 " + bookName);

        context.close();
        System.out.println("ends ");
    }
}
