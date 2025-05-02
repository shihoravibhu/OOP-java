class Book {
    private String author_name;

    public Book(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_Name() {
        return this.author_name;
    }

    public void display() {
        System.out.println("Main Book Class");
        System.out.println("Author Name : " + this.author_name);
    }
}

class Book_publication extends Book {
    private String title;

    public Book_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {   
        System.out.println("Book_publication");
        System.out.println("Author Name : " + getAuthor_Name());
        System.out.println("Title  : " + this.title);
    }
}

class Paper_publication extends Book {
    private String title;

    public Paper_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {     
        System.out.println("Paper_publication");
        System.out.println("Author Name : " + getAuthor_Name());
        System.out.println("Title  : " + this.title);
    }
}

public class Lab7a2 {
    public static void main(String[] args) {

        // Book b1 = new Book("v");

        // Book_publication b2 = new Book_publication("v", "let's C");

        // Paper_publication b3 = new Paper_publication("k", "48 Law's Of Power");

        
        // b1.display();
        // b2.display();
        // b3.display();
      
        // Method Dispatch Method 

        // System.out.println("Enter AuthorName : args[0] ");
        // System.out.println("Enter Book/Paper : +args[1] ");
        // System.out.println("Enter Title : args[2] ");

        Book b;

        if(args[1].equalsIgnoreCase("Book")){
            // System.out.println("book");
            b=new Book_publication(args[0], args[2]);
        }
        else if(args[1].equalsIgnoreCase("Paper")){
            b=new Paper_publication(args[0], args[2]);
        }
        else{
            System.out.println("Invalid Input..");
            return;
        }
        b.display();
    }
}