package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("vefxis tyaosani")
    private String name;

    @Value("shota rustaveli")
    private String author;

    @Value("1754")
    private int yerOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYerOfPublication() {
        return yerOfPublication;
    }
}
