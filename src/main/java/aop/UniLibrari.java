package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrari extends AbstractLibrary {

    @Override
    public void getBook(){
        System.out.println("add book getBook");
    }

    public void getBook_1(Book book){
        System.out.println(book.getName());
    }

    public String ReturnBook(){
        System.out.println("add book getBook");
        return "OK";
    }

    public void getMagazin(){
        System.out.println("add Magazin getMagazin");
    }
}
