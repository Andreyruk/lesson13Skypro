public class Main {
    public static void main(String[] args) {
        //Author author1 = new Author("Александр", "Пушкин"); или сразу в book1 (см. ниже) - new Author("Александр", "Пушкин")
        Author author2 = new Author("Алексей", "Толстой");

        Book book1 = new Book("книга1", new Author("Александр", "Пушкин"), 1812);
        Book book2 = new Book("книга2", author2, 1900);

        book1.setYearPublic(1811);
        book2.setYearPublic(1899);
//        System.out.println(book1.getTitleBook() + " " + book1.getYearPublic() + " " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
//        System.out.println(book2.getTitleBook() + " " + book2.getYearPublic() + " " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        printBook(book1);
        printBook(book2);
    }
    public static void printBook(Book book) {
        System.out.println(book.getTitleBook() + " " + book.getYearPublic() + " " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
    }
}