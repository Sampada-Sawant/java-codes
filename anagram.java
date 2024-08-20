import java.io.*;
import java.util.*;
import java.lang.String;

public class TwoString 
{
    static void anagramOfString(String str1, String str2)
    {
        int count=0;
        for(int i=0;i<str1.length();i++)
        {
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    count++;
                }
            }
        }
        if(count>=str1.length())
        {
            System.out.println("\nThe two strings : "+str1+" and "+str2+" are anagram of each other.");
        }else 
        {
            System.out.println("\nThe two strings : "+str1+" and "+str2+" are NOT anagram of each other.");
        }
    }

    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        System.out.println("\nEnter two strings data : ");
        String string1 = read.nextLine();
        String string2 = read.nextLine();

        anagramOfString(string1,string2);    //two strings are called anagram of each other 
                                            //if they contain same characters.
        
    }
    
}
