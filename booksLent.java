import java.io.*;
import java.util.*;

public class Book
{
    Scanner sc=new Scanner(System.in);
    String book_name;
    int book_amount;
    String date;
    static int count=0;
    
    void books_lent()
    {
        System.out.println("Enter the book name : ");
        book_name=sc.nextLine();
        System.out.println("Enter the book amount : ");
        book_amount=sc.nextInt();
        System.out.println("Date of book issue : ");
        date=sc.next();
        count++;
        System.out.println("Book : "+book_name+". issued successfully!");
    }
    
    static void display()
    {
        System.out.println("Number of books issued : "+count);
    }
    
    
    public static void main(String[]args)
    {
        Book b1=new Book();
        Book b2=new Book();
        Book b3=new Book();

        b1.books_lent();
        b2.books_lent();
        b3.books_lent();
        
        b1.display();
    }
}
