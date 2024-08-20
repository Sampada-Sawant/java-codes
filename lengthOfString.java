import java.io.*;
import java.util.*;

class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner read= new Scanner(System.in);
        System.out.println("\nEnter a string data : ");
        String name = read.next();
        System.out.println("\nLength of characters in "+name+" is "+name.length());
    }
}
