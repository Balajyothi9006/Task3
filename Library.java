import java.util.Scanner;
//class Library
public class Library extends Book {
    public Book[] books = new Book[5];


    public Library(int bookid, String title, String authorname,boolean isAvailable) {
        super(bookid, title, authorname,isAvailable);

    }

    int i = 0;

    public Library() {
        super();
    }

    Scanner scanner = new Scanner(System.in);
//method to add book to library system
    public void addBook() {


        System.out.println("Enter the book id :");


        bookid = scanner.nextInt();
        setBookid(bookid);

        System.out.print("Enter book name: ");
        title = scanner.next();
        setTitle(title);

        System.out.print("Enter author name: ");
        authorname = scanner.next();
        setAuthorname(authorname);
       boolean isAvailable= setAvailable(true);

        // Create a new Product object and store it in the array

        books[i] = new Book(bookid, title, authorname,isAvailable);

        i++;


    }
//method to display books in library
    public void display(Book[] books) {

        for (int j = 0; j < i; j++) {
            System.out.println("BookID: "+books[j].getBookid());
            System.out.println("Book name: "+books[j].getTitle());
            System.out.println("Author name: "+books[j].getAuthorname());
            System.out.println("book is Available: "+books[j].getisAvailable());


        }
    }
//method to remove book with bookid
    public void remove(int bookid) {
        if (i == 0) System.out.println("no books to remove");
        else {

            for (int j = 0; j < i-1; j++) {

                if (books[j].bookid == bookid) {
                    while (j < i-1) {
                        books[j] = books[j + 1];
                        j++;
                    }


                }
            }
            this.i--;
        }

    }


}