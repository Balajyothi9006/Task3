import java.util.Scanner;
// class BookManagementSystem
public class BookManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {

            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
             // Consume the newline character

            switch (choice) {
                case 1:

                     lib.addBook();
                    break;
                case 2:
                    lib.display(lib.books);
                    System.out.println("Enter the book Id to remove");
                    int bookid = scanner.nextInt();

                    lib.remove(bookid);
                    break;
                case 3:
                    lib.display(lib.books);
                    break;
                case 4:
                    System.out.println("Exiting the Library Management System");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }}
            while (choice != 4) ;

            scanner.close();
        }


    }



