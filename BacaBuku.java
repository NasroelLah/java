import java.util.Scanner;
public class BacaBuku{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama Penulis: ");
        String name = scan.nextLine();
        System.out.print("Judul Buku: ");
        String bookTitle = scan.nextLine();
        System.out.print("E-mail Penulis: ");
        String email = scan.nextLine();
        System.out.print("Jenis kelamin (L/P): ");
        char gender = scan.next().charAt(0);
        System.out.print("Harga Buku: ");
        double price = scan.nextDouble();

        Author pengarang = new Author(name, email, gender);
        Book buku = new Book(bookTitle, pengarang, price);
        System.out.println("\n\n\nNama Penulis: " + pengarang.getName()+"\nEmail Penulis: "+pengarang.getEmail());
        System.out.println("Nama Buku: " + buku.getName()+"\nHarga Buku: "+buku.getPrice());
    }
}
class Book{
    private String bookTitle;
    private Author author;
    private double price;
    public Book(String bookTitle, Author authors, double price){
        this.bookTitle = bookTitle;
        author = authors;
        this.price = price;
    }
    public String getName(){
        return bookTitle;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
}
