// Strings
import java.util.*;
public class Strings1 {
    public static void printCharacters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static boolean isPalindrome(String str){ // O(n)
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not palindrome
                return false;
            }
        }
        return true;
    }
    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            // North
            if(path.charAt(i)=='N'){
                y++;
            }
            // South
            else if(path.charAt(i)=='S'){
                y--;
            }
            // East
            else if(path.charAt(i)=='E'){
                x++;
            }
            // West
            else{
                x--;
            }
        }
        return (float)Math.sqrt((x*x+y*y));
    }
    public static void main(String args[]){
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");

        // Strings are immutable

        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);

        // String fullname="Tony Stark";
        // System.out.println(fullname.length());

        // concatenation
        // String firstName="Atul";
        // String lastName="Kumar";
        // String fullName=firstName + " " + lastName;
        // System.out.println(fullName+" is here"); // here also concatenation is applied
        
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}