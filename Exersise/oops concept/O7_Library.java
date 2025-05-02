// You have to implement a library using Java Class Library

// Methods: addBook, issueBook, returnBook, showAvailableBooks

// Properties: Array to store the available books,

// Array to store the issued books

class Library{

    String[] books ;
    int noOfBook ;

    Library(){
        this.books = new String[100] ;
        this.noOfBook = 0 ;
    }

    public void addBook(String book){
        this.books[noOfBook] = book ;
        noOfBook++;
        System.out.println(book+" Has Been Add...");
    }
    public void issueBook(String book){
        for(int i=0 ; i<this.books.length ; i++){
            if(this.books[i].equals(book)){
                System.out.println(book+" Book Has Been Issued!!");
                this.books[i]=null;
                break;
            }
        }
        
    }
    public void returnBook(String book){
        addBook(book);
    }
    public void showAvailableBooks(){
        System.out.println("Available Book Are :");
        for(int i=0 ; i<this.books.length ; i++){
            if(this.books[i]==null){
                continue;
            }
            System.out.println("* "+this.books[i]);
        }
    }

}

public class O7_Library {
    public static void main(String[] args) {
        
        Library centeLibrary = new Library();

        centeLibrary.addBook("Think And Grow Rich");
        centeLibrary.addBook("48 Laws Of Powers");
        centeLibrary.addBook("Let's C");

        centeLibrary.issueBook("Let's C");
        centeLibrary.showAvailableBooks();

        centeLibrary.returnBook("Let's C");
        centeLibrary.showAvailableBooks();
    }
}
