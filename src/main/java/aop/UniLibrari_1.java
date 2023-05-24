package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrari_1 extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("add book getBook");
        System.out.println("----------------------------------");
    }
// TODO: test
    public void getMagazine() {
        System.out.println("add book getMagazine");
        System.out.println("----------------------------------");
    }

    public void returnBook() {
        System.out.println("add book returnBook");
        System.out.println("----------------------------------");
    }

    public void returnMagazine() {
        System.out.println("add book returnMagazine");
        System.out.println("----------------------------------");
    }
    public void addBook(String person_name, Book book) {
        System.out.println("add book addBook");
        System.out.println("----------------------------------");
    }

    public void addMagazine() {
        System.out.println("add book addMagazine");
        System.out.println("----------------------------------");
    }
}
