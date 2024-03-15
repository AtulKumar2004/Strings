import java.util.*;
public class Strings6 {
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){ // O(n)
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compress(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static String compressbyStringBuilder(String str){ // O(n)
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static int countVowels(String str){ // L12 q1
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static boolean anagrams(String str1,String str2){ // L12 q4
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                int c=0;
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        c=1;
                        break;
                    }
                }
                if(c!=1){
                    return false;

                }
            }
            return true;

        }
        return false;
    }
    public static void anagrams2(String str1,String str2){ // L12 q4
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if (str1.length() == str2.length()){
            char str1charArray[]=str1.toCharArray();
            char str2charArray[]=str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result=Arrays.equals(str1charArray,str2charArray);
            if(result) {
                System.out.println(str1+" and "+str2+" are anagrams of each other.");
            }
            else {
                System.out.println(str1+" and "+str2+" are not anagrams of each other.");
            }
        
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagrams of each other.");
        }
    }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        String s="ApnaCollege".replace("l","");
        System.out.println(s+" ");
        // Scanner sc=new Scanner(System.inn);
        // System.out.print("Enter a String: ");
        // String st=sc.nextLine();
        // System.out.println(countVowels(st));
        String str1="race";
        String str2="care";
        // System.out.println(anagrams(str1,str2));
        anagrams2(str1,str2);
    }
}