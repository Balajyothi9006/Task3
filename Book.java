//Class Book
public class Book {
    int bookid;
    String title;
    String authorname;
    boolean isAvailable;
//constructor with attributes
    public Book(int bookid, String title, String authorname,boolean isAvailable) {
        this.bookid = bookid;
        this.title = title;
        this.authorname = authorname;
        this.isAvailable=isAvailable;
    }

    Book()
    { }
    public int getBookid() {
        return bookid;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorname() {
        return authorname;
    }

    public boolean getisAvailable() {
        return isAvailable;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public boolean setAvailable(boolean available) {
       this.isAvailable = available;

        return available;
    }
}