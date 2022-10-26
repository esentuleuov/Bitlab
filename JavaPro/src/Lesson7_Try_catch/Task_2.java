package Lesson7_Try_catch;

public class Task_2 {
    public static void main(String[] args) {
        Library l = new Library("Esen","Astana");
        Book b1 = new Book(1,"esen","Aman");
        Book b2 = new Book(1,"esen","Aman");
        Book b3 = new Book(1,"esen","Aman");
        Book b4 = new Book(1,"esen","Aman");

        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.addBook(b4);
        l.printBooks();
    }
}
class Book{
    private int id;
    private String name;
    private String author;

    public Book(){}
    public Book(int id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(){
        this.author = author;
    }

    public String getData(){
        return id + ", " + name + ", " + author;
    }
}

class Library{
    private String name;
    private String city;
    Book books[] = new Book[2];
    int index = 0;

    public Library(){}
    public Library(String name, String city){
        this.name = name;
        this.city = city;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getCity(){
        return city;
    }
    public void setCity(){
        this.city = city;
    }

    public void addBook(Book book){
        try {
            books[index] = book;
            index++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The library is full");
        }
    }
    public void printBooks(){
        for (int i = 0; i < books.length; i++) {
            try {
                books[i].getData();
            }
            catch (Exception e){
                System.out.println("The book is empty");
            }
        }
    }
}

