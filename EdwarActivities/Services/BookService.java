package EdwarActivities.Services;

import java.util.Scanner;
import EdwarActivities.Entities.Book;

public class BookService {

    public BookService() {
    }

    Scanner reader = new Scanner(System.in);
    Book book1 = new Book();

    public Book uploadBook() {

        System.out.println("Este programa recibe los datos de un libro");
        System.out.print("Ingrese el ISBM: ");
        book1.setIsbm(reader.nextInt());
        System.out.print("Ingrese el titulo: ");
        book1.setTitle(reader.next());
        System.out.print("Ingrese el autor: ");
        book1.setAuthor(reader.next());
        System.out.print("Ingrese el numero de paginas: ");
        book1.setPagesNumber(reader.nextInt());
        return null;

    }

    public void showBookInfo() {
        System.out.println("ISBM: " + book1.getIsbm());
        System.out.println("Titulo: " + book1.getTitle());
        System.out.println("Autor: " + book1.getAuthor());
        System.out.println("Numero de paginas: " + book1.getPagesNumber());
    }

}
