package ru.skypro;

public class Reader {
    public class Main {

        public static void main(String[] args) {
            // write your code here


            Author author = new Author("Alexandre", "Dumas");
            System.out.println("author.getFirstName() = " + author.getFirstName());
            System.out.println("author.getLastName() = " + author.getLastName());

            Author author1 = new Author("Dan", "Brown");
            System.out.println("author1.getFirstName() = " + author1.getFirstName());
            System.out.println("author1.getLastName() = " + author1.getLastName());

            Book book = new Book(author , " The Count of Monte Cristo", 2021);
            System.out.println("book.getBookName() = " + book.getBookName());
            System.out.println("author.getAuthor() = " + author.getAuthor());
            System.out.println("book.getPublishingYear() = " + book.getPublishingYear());
            book.setPublishingYear(1999);
            System.out.println("book.getPublishingYear() = " + book.getPublishingYear());


            Book book1 = new Book( author ,"The Da Vinci Code", 2020);
            System.out.println("book1.getBookName() = " + book1.getBookName());
            System.out.println("author1.getAuthorName() = " + author1.getAuthor());
            System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
            book1.setPublishingYear(2010);
            System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());

        }
    }

}
